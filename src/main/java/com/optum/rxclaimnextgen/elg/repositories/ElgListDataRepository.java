package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgListData;
import com.optum.rxclaimnextgen.elg.entities.ElgListDataPK;
import com.optum.rxclaimnextgen.elg.projections.ElgListDataProjection;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 9/20/2018.
 */
public interface ElgListDataRepository extends JpaRepository<ElgListData, ElgListDataPK> {

	public List<ElgListDataProjection> findByListIdAndValueId(String listId, String valueId);

	public List<ElgListDataProjection> findByListId(String listId);
}
