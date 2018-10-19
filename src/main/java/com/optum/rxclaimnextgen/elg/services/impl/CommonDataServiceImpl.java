/**
 * 
 */
package com.optum.rxclaimnextgen.elg.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optum.rxclaimnextgen.elg.entities.ElgListData;
import com.optum.rxclaimnextgen.elg.projections.ElgListDataProjection;
import com.optum.rxclaimnextgen.elg.projections.ElgStateStaProjection;
import com.optum.rxclaimnextgen.elg.repositories.ElgListDataRepository;
import com.optum.rxclaimnextgen.elg.repositories.ElgStateStaRepository;
import com.optum.rxclaimnextgen.elg.services.CommonDataService;
import com.optum.rxclaimnextgen.elg.utils.Utils;

/**
 * @author Hemant Sharma
 *
 */
@Service class CommonDataServiceImpl implements CommonDataService {

	@Autowired
	ElgStateStaRepository elgStateStaRepository;
	
	@Autowired
	ElgListDataRepository elgListDataRepository;

	@Override 
	public List<ElgStateStaProjection> getAllState() {
		List<ElgStateStaProjection> stateList = elgStateStaRepository.findAllByQuery();
		stateList
				.sort((ElgStateStaProjection s1, ElgStateStaProjection s2) -> s1.getStaStateDescription().compareTo(s2.getStaStateDescription()));
		return stateList;
	}
	
	/*
	 * fetch data and prepare list of map ,each list will be reperested as group of
	 * data which is group based on the listID field
	 * 
	 * @see com.optum.rxclaimnextgen.elg.services.CommonListService#findAll()
	 */
	@Override
	public Map<String, List<ElgListData>> getAllListData() {
		Map<String, List<ElgListData>> listDataMap = null;
		List<ElgListData> listData = null;
		List<ElgListData> elgListData = elgListDataRepository.findAll();
		if (!Utils.isListEmpty(elgListData)) {
			listDataMap = new HashMap<String, List<ElgListData>>();
			for (ElgListData data : elgListData) {
				if (listDataMap.containsKey(data.getListId()))
					listDataMap.get(data.getListId()).add(data);
				else {
					listData = new ArrayList<ElgListData>();
					listData.add(data);
					listDataMap.put(data.getListId(), listData);
				}
			}
		}
		return listDataMap;
	}

	@Override
	public List<ElgListDataProjection> getByListIdAndValueId(String listId, String valueId) {
		return elgListDataRepository.findByListIdAndValueId(listId, valueId);
	}

	@Override
	public List<ElgListDataProjection> getByListId(String listId) {
		return elgListDataRepository.findByListId(listId);
	}

}
