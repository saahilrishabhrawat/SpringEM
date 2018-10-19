package com.optum.rxclaimnextgen.elg.services.profile.requiredMemberFields.impl;

import com.optum.rxclaimnextgen.elg.projections.ElgRequiredMemberFieldRmfProjection;
import com.optum.rxclaimnextgen.elg.repositories.profile.ElgRequiredMemberFieldRmfRepository;
import com.optum.rxclaimnextgen.elg.services.profile.requiredMemberFields.RequiredMemberFieldsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequiredMemberFieldsServiceImpl implements RequiredMemberFieldsService {
    private static final Logger LOG = LoggerFactory.getLogger(RequiredMemberFieldsServiceImpl.class);

    @Autowired
    ElgRequiredMemberFieldRmfRepository elgRequiredMemberFieldRmfRepository;

    @Override
    public List<ElgRequiredMemberFieldRmfProjection> findRequiredMemberFieldData() {
        return elgRequiredMemberFieldRmfRepository.findRequiredMemberFieldData();
    }
}
