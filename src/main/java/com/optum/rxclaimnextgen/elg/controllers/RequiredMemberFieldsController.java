package com.optum.rxclaimnextgen.elg.controllers;

import com.optum.rxclaimnextgen.elg.projections.ElgRequiredMemberFieldRmfProjection;
import com.optum.rxclaimnextgen.elg.services.profile.requiredMemberFields.RequiredMemberFieldsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RequiredMemberFieldsController {

    private static final Logger LOG = LoggerFactory.getLogger(RequiredMemberFieldsController.class);


    @Autowired
    RequiredMemberFieldsService requiredMemberFieldsService;

    @GetMapping("/requiredMemberFields")
    @ResponseBody
    public ResponseEntity findAllRequiredMemberFieldData() {
        try {
            List<ElgRequiredMemberFieldRmfProjection> results = requiredMemberFieldsService.findRequiredMemberFieldData();
            return ResponseEntity.ok().body(results);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

}
