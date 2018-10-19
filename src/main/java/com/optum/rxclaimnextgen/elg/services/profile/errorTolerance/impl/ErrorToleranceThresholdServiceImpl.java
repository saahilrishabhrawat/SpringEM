package com.optum.rxclaimnextgen.elg.services.profile.errorTolerance.impl;

import com.optum.rxclaimnextgen.elg.entities.ElgToleranceCheckDtlEcd;
import com.optum.rxclaimnextgen.elg.repositories.profile.ElgToleranceCheckDtlEcdRepository;
import com.optum.rxclaimnextgen.elg.services.profile.errorTolerance.ErrorToleranceThresholdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErrorToleranceThresholdServiceImpl implements ErrorToleranceThresholdService {

    private static final Logger LOG = LoggerFactory.getLogger(ErrorToleranceControlServiceImpl.class);

    @Autowired
    ElgToleranceCheckDtlEcdRepository elgToleranceCheckDtlEcdRepository;

    @Override
    public List<ElgToleranceCheckDtlEcd> getAllForProfile(String carCarrierId, String accountId, String groupId) {
        return elgToleranceCheckDtlEcdRepository.getAllForProfile(carCarrierId, accountId, groupId);
    }
}
