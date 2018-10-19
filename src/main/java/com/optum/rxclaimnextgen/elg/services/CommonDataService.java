/**
 * 
 */
package com.optum.rxclaimnextgen.elg.services;

import java.util.List;
import java.util.Map;

import com.optum.rxclaimnextgen.elg.entities.ElgListData;
import com.optum.rxclaimnextgen.elg.projections.ElgListDataProjection;
import com.optum.rxclaimnextgen.elg.projections.ElgStateStaProjection;

/**
 * @author Hemant Sharma
 *
 */
public interface CommonDataService {
	/**
	 * Fetch all state and return list of state
	 * 
	 * @return List<ElgStateSta>
	 */
	List<ElgStateStaProjection> getAllState();

	/**
	 * Fetch all data and prepare list of data.
	 * 
	 * @return Map<String, List<ElgListData>>
	 */
	public Map<String, List<ElgListData>> getAllListData();

	/**
	 * Fetch list of data for given list Id and value Id.
	 * 
	 * @return List<ElgListDataProjection>
	 */
	public List<ElgListDataProjection> getByListIdAndValueId(String listId, String valueId);

	/**
	 * Fetch list of data for given list Id.
	 * 
	 * @return List<ElgListDataProjection>
	 */
	public List<ElgListDataProjection> getByListId(String listId);
}
