package com.optum.rxclaimnextgen.elg.controllers;

import com.optum.rxclaimnextgen.elg.projections.ElgTooltipsProjection;
import com.optum.rxclaimnextgen.elg.services.TooltipsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bkocinsk on 8/23/2018.
 */
@CrossOrigin
@RestController
public class TooltipsController {

    private static final Logger LOG = LoggerFactory.getLogger(TooltipsController.class);

    @Autowired
    TooltipsService elgTooltipsService;

    @GetMapping("/getTooltipsByScreenTitle")
    @ResponseBody
    public ResponseEntity getTooltipsByScreenTitle(@RequestParam("st") String screenTitle) {
        if (screenTitle.isEmpty()) {
            return ResponseEntity.badRequest().body("screenTitle value required.");
        }

        try {
            List<ElgTooltipsProjection> tooltip = elgTooltipsService.findByScreenTitle(screenTitle);
            if (tooltip == null || tooltip.isEmpty()) {
                return ResponseEntity.badRequest().body("Could not find a matching tooltip.");
            }
            return ResponseEntity.ok(tooltip);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getTooltipsByPrimaryKey")
    @ResponseBody
    public ResponseEntity getProfileByPrimaryKey(@RequestParam("st") String screenTitle, @RequestParam("fl") String fieldLabel) {
        if (screenTitle.isEmpty() || fieldLabel.isEmpty()) {
            return ResponseEntity.badRequest().body("screenTitle and fieldLabel values required.");
        }

        try {
            ElgTooltipsProjection tooltip = elgTooltipsService.findByPrimaryKey(screenTitle, fieldLabel);
            if (tooltip == null) {
                return ResponseEntity.badRequest().body("Could not find a matching tooltip.");
            }
            return ResponseEntity.ok(tooltip);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
