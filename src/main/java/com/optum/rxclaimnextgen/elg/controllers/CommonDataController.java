
package com.optum.rxclaimnextgen.elg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.optum.rxclaimnextgen.elg.projections.ElgListDataProjection;
import com.optum.rxclaimnextgen.elg.services.CommonDataService;

/**
 * @author Hemant Sharma
 *
 */
@CrossOrigin
@RestController
public class CommonDataController {

	@Autowired
	CommonDataService stateDataService;

	/**
	 * Find all common data which is used in all the screen to populate dropdown.
	 */
	@GetMapping("/getAllState")
	@ResponseBody
	public ResponseEntity getAllState() {
		try {
			return ResponseEntity.ok().body(stateDataService.getAllState());
		} catch (Exception e) {

			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

	/**
	 * Find all common data which is used in all the screen to populate dropdown.
	 */
	@GetMapping("/getAllListData")
	@ResponseBody
	public ResponseEntity getAllListData() {
		try {
			return ResponseEntity.ok().body(stateDataService.getAllListData());
		} catch (Exception e) {

			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

	/**
	 * Find all common data which is used in all the screen to populate dropdown.
	 */
	@GetMapping("/getListDataById")
	@ResponseBody
	public ResponseEntity getListDataById(String listId, String valueId) {
		try {
			return ResponseEntity.ok().body(stateDataService.getByListIdAndValueId(listId, valueId));
		} catch (Exception e) {

			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

	/**
	 * Find all common data which is used in all the screen to populate dropdown.
	 */
	@GetMapping("/getByListId")
	@ResponseBody
	public ResponseEntity getByListId(@RequestParam("listId") String listId) {
		try {
			List<ElgListDataProjection> listIdData = stateDataService.getByListId(listId);
			if (null == listIdData)
				return ResponseEntity.badRequest().body("Could not find a list of data against listId");
			return ResponseEntity.ok().body(listIdData);
		} catch (Exception e) {

			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}
}
