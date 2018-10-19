package com.optum.rxclaimnextgen.elg.services;

import com.optum.rxclaimnextgen.elg.projections.ElgTooltipsProjection;

import java.util.List;

/**
 * Created by bkocinsk on 8/23/2018.
 */
public interface TooltipsService {

    public List<ElgTooltipsProjection> findByScreenTitle(String screenTitle);

    public ElgTooltipsProjection findByPrimaryKey(String screenTitle, String fieldLabel);
}
