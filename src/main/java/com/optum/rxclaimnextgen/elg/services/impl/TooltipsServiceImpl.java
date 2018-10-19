package com.optum.rxclaimnextgen.elg.services.impl;

import com.optum.rxclaimnextgen.elg.projections.ElgTooltipsProjection;
import com.optum.rxclaimnextgen.elg.repositories.ElgTooltipsRepository;
import com.optum.rxclaimnextgen.elg.services.TooltipsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bkocinsk on 8/23/2018.
 */
@Service
public class TooltipsServiceImpl implements TooltipsService {
    private static final Logger LOG = LoggerFactory.getLogger(TooltipsServiceImpl.class);

    @Autowired
    private ElgTooltipsRepository elgTooltipsRepo;

    public List<ElgTooltipsProjection> findByScreenTitle(String screenTitle) {
        return elgTooltipsRepo.findByScreenTitle(screenTitle);
    }

    public ElgTooltipsProjection findByPrimaryKey(String screenTitle, String fieldLabel) {
        return elgTooltipsRepo.findByScreenTitleAndFieldLabel(screenTitle, fieldLabel);
    }

}
