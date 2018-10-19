package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgTooltips;
import com.optum.rxclaimnextgen.elg.entities.ElgTooltipsPK;
import com.optum.rxclaimnextgen.elg.projections.ElgTooltipsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 8/23/2018.
 */
public interface ElgTooltipsRepository extends JpaRepository<ElgTooltips, ElgTooltipsPK> {

    public List<ElgTooltipsProjection> findByScreenTitle(String screenTitle);

    public ElgTooltipsProjection findByScreenTitleAndFieldLabel(String screenTitle, String fieldLabel);
}
