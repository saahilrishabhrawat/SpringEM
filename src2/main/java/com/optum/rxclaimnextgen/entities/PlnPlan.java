package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;

/**
 *  RCPLNP - PLN Plan
 *
 * Created by bkocinsk on 7/19/2018.
 */
@Entity
@Table(name = "RCPLNP")
@IdClass(PlnPlanPK.class)
public class PlnPlan {
    private String planCode;
    private int planEffDate;
    private int planTermDate;
    private String planName;
    private String planVerifyMember;
    private String planVerifyRxNetwork;
    private String planDea;
    private String planPreferredFormulary;
    private String planDefaultDrugStatus;
    private String planEligibilityOverride;
    private String desiIndicator;
    private String planVerifyMdNetwork;
    private String planVerifyMdSpecialty;
    private String planVerifyCareFacility;
    private String planVerifyRestrictions;
    private String planVerifyPricing;
    private String planVerifyTherapy;
    private String planVerifyBrndGenSubs;
    private String planVerify3rdPtyExcp;
    private String planVerifyLegendOtc;
    private String planVerifyFdaTherEqui;
    private String planVerifyDeaCode;
    private String planVerifyDosageForm;
    private String planVerifyRouteOfAdm;
    private String planVerifyPackaging;
    private String planVerifyMaintDrug;
    private String planVerifyCompound;
    private String planLevelOfService;
    private String daysSupplyQtyDispLmts;
    private String planVerifyRefillLimits;
    private String deductibleCapLimits;
    private String planCustomerLocation;
    private String planPatientPayQual;
    private String planVerifyNdcList;
    private String planVerifyGpiList;
    private String planVerifyCob;
    private String dugTableName;
    private String planQualifier;
    private String planAuditFlag;
    private String planFutureUseFlag1;
    private String planFutureUseFlag2;
    private String planFutureUseFlag3;
    private String planFutureUseFlag4;
    private String planFutureUseCode1;
    private String planFutureUseCode2;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "ADAECD")
    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    @Id
    @Column(name = "ADAKDT")
    public int getPlanEffDate() {
        return planEffDate;
    }

    public void setPlanEffDate(int planEffDate) {
        this.planEffDate = planEffDate;
    }

    @Id
    @Column(name = "ADA1DT")
    public int getPlanTermDate() {
        return planTermDate;
    }

    public void setPlanTermDate(int planTermDate) {
        this.planTermDate = planTermDate;
    }

    @Basic
    @Column(name = "ADBOTX")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @Basic
    @Column(name = "ADCRST")
    public String getPlanVerifyMember() {
        return planVerifyMember;
    }

    public void setPlanVerifyMember(String planVerifyMember) {
        this.planVerifyMember = planVerifyMember;
    }

    @Basic
    @Column(name = "ADCZST")
    public String getPlanVerifyRxNetwork() {
        return planVerifyRxNetwork;
    }

    public void setPlanVerifyRxNetwork(String planVerifyRxNetwork) {
        this.planVerifyRxNetwork = planVerifyRxNetwork;
    }

    @Basic
    @Column(name = "ADC1ST")
    public String getPlanDea() {
        return planDea;
    }

    public void setPlanDea(String planDea) {
        this.planDea = planDea;
    }

    @Basic
    @Column(name = "ADCSST")
    public String getPlanPreferredFormulary() {
        return planPreferredFormulary;
    }

    public void setPlanPreferredFormulary(String planPreferredFormulary) {
        this.planPreferredFormulary = planPreferredFormulary;
    }

    @Basic
    @Column(name = "ADCTST")
    public String getPlanDefaultDrugStatus() {
        return planDefaultDrugStatus;
    }

    public void setPlanDefaultDrugStatus(String planDefaultDrugStatus) {
        this.planDefaultDrugStatus = planDefaultDrugStatus;
    }

    @Basic
    @Column(name = "ADC5ST")
    public String getPlanEligibilityOverride() {
        return planEligibilityOverride;
    }

    public void setPlanEligibilityOverride(String planEligibilityOverride) {
        this.planEligibilityOverride = planEligibilityOverride;
    }

    @Basic
    @Column(name = "ADCUST")
    public String getDesiIndicator() {
        return desiIndicator;
    }

    public void setDesiIndicator(String desiIndicator) {
        this.desiIndicator = desiIndicator;
    }

    @Basic
    @Column(name = "ADCVST")
    public String getPlanVerifyMdNetwork() {
        return planVerifyMdNetwork;
    }

    public void setPlanVerifyMdNetwork(String planVerifyMdNetwork) {
        this.planVerifyMdNetwork = planVerifyMdNetwork;
    }

    @Basic
    @Column(name = "ADCWST")
    public String getPlanVerifyMdSpecialty() {
        return planVerifyMdSpecialty;
    }

    public void setPlanVerifyMdSpecialty(String adcwst) {
        this.planVerifyMdSpecialty = planVerifyMdSpecialty;
    }

    @Basic
    @Column(name = "ADCXST")
    public String getPlanVerifyCareFacility() {
        return planVerifyCareFacility;
    }

    public void setPlanVerifyCareFacility(String planVerifyCareFacility) {
        this.planVerifyCareFacility = planVerifyCareFacility;
    }

    @Basic
    @Column(name = "ADC0ST")
    public String getPlanVerifyRestrictions() {
        return planVerifyRestrictions;
    }

    public void setPlanVerifyRestrictions(String planVerifyRestrictions) {
        this.planVerifyRestrictions = planVerifyRestrictions;
    }

    @Basic
    @Column(name = "ADCYST")
    public String getPlanVerifyPricing() {
        return planVerifyPricing;
    }

    public void setPlanVerifyPricing(String planVerifyPricing) {
        this.planVerifyPricing = planVerifyPricing;
    }

    @Basic
    @Column(name = "ADDZST")
    public String getPlanVerifyTherapy() {
        return planVerifyTherapy;
    }

    public void setPlanVerifyTherapy(String planVerifyTherapy) {
        this.planVerifyTherapy = planVerifyTherapy;
    }

    @Basic
    @Column(name = "ADHTST")
    public String getPlanVerifyBrndGenSubs() {
        return planVerifyBrndGenSubs;
    }

    public void setPlanVerifyBrndGenSubs(String planVerifyBrndGenSubs) {
        this.planVerifyBrndGenSubs = planVerifyBrndGenSubs;
    }

    @Basic
    @Column(name = "ADHUST")
    public String getPlanVerify3rdPtyExcp() {
        return planVerify3rdPtyExcp;
    }

    public void setPlanVerify3rdPtyExcp(String planVerify3rdPtyExcp) {
        this.planVerify3rdPtyExcp = planVerify3rdPtyExcp;
    }

    @Basic
    @Column(name = "ADHVST")
    public String getPlanVerifyLegendOtc() {
        return planVerifyLegendOtc;
    }

    public void setPlanVerifyLegendOtc(String planVerifyLegendOtc) {
        this.planVerifyLegendOtc = planVerifyLegendOtc;
    }

    @Basic
    @Column(name = "ADHWST")
    public String getPlanVerifyFdaTherEqui() {
        return planVerifyFdaTherEqui;
    }

    public void setPlanVerifyFdaTherEqui(String planVerifyFdaTherEqui) {
        this.planVerifyFdaTherEqui = planVerifyFdaTherEqui;
    }

    @Basic
    @Column(name = "ADHXST")
    public String getPlanVerifyDeaCode() {
        return planVerifyDeaCode;
    }

    public void setPlanVerifyDeaCode(String planVerifyDeaCode) {
        this.planVerifyDeaCode = planVerifyDeaCode;
    }

    @Basic
    @Column(name = "ADHYST")
    public String getPlanVerifyDosageForm() {
        return planVerifyDosageForm;
    }

    public void setPlanVerifyDosageForm(String planVerifyDosageForm) {
        this.planVerifyDosageForm = planVerifyDosageForm;
    }

    @Basic
    @Column(name = "ADHZST")
    public String getPlanVerifyRouteOfAdm() {
        return planVerifyRouteOfAdm;
    }

    public void setPlanVerifyRouteOfAdm(String planVerifyRouteOfAdm) {
        this.planVerifyRouteOfAdm = planVerifyRouteOfAdm;
    }

    @Basic
    @Column(name = "ADH0ST")
    public String getPlanVerifyPackaging() {
        return planVerifyPackaging;
    }

    public void setPlanVerifyPackaging(String planVerifyPackaging) {
        this.planVerifyPackaging = planVerifyPackaging;
    }

    @Basic
    @Column(name = "ADH1ST")
    public String getPlanVerifyMaintDrug() {
        return planVerifyMaintDrug;
    }

    public void setPlanVerifyMaintDrug(String planVerifyMaintDrug) {
        this.planVerifyMaintDrug = planVerifyMaintDrug;
    }

    @Basic
    @Column(name = "ADJ6ST")
    public String getPlanVerifyCompound() {
        return planVerifyCompound;
    }

    public void setPlanVerifyCompound(String planVerifyCompound) {
        this.planVerifyCompound = planVerifyCompound;
    }

    @Basic
    @Column(name = "ADJ7ST")
    public String getPlanLevelOfService() {
        return planLevelOfService;
    }

    public void setPlanLevelOfService(String planLevelOfService) {
        this.planLevelOfService = planLevelOfService;
    }

    @Basic
    @Column(name = "ADJ8ST")
    public String getDaysSupplyQtyDispLmts() {
        return daysSupplyQtyDispLmts;
    }

    public void setDaysSupplyQtyDispLmts(String daysSupplyQtyDispLmts) {
        this.daysSupplyQtyDispLmts = daysSupplyQtyDispLmts;
    }

    @Basic
    @Column(name = "ADJ9ST")
    public String getPlanVerifyRefillLimits() {
        return planVerifyRefillLimits;
    }

    public void setPlanVerifyRefillLimits(String planVerifyRefillLimits) {
        this.planVerifyRefillLimits = planVerifyRefillLimits;
    }

    @Basic
    @Column(name = "ADKAST")
    public String getDeductibleCapLimits() {
        return deductibleCapLimits;
    }

    public void setDeductibleCapLimits(String deductibleCapLimits) {
        this.deductibleCapLimits = deductibleCapLimits;
    }

    @Basic
    @Column(name = "ADKBST")
    public String getPlanCustomerLocation() {
        return planCustomerLocation;
    }

    public void setPlanCustomerLocation(String planCustomerLocation) {
        this.planCustomerLocation = planCustomerLocation;
    }

    @Basic
    @Column(name = "ADR5H6")
    public String getPlanPatientPayQual() {
        return planPatientPayQual;
    }

    public void setPlanPatientPayQual(String planPatientPayQual) {
        this.planPatientPayQual = planPatientPayQual;
    }

    @Basic
    @Column(name = "ADR3H6")
    public String getPlanVerifyNdcList() {
        return planVerifyNdcList;
    }

    public void setPlanVerifyNdcList(String planVerifyNdcList) {
        this.planVerifyNdcList = planVerifyNdcList;
    }

    @Basic
    @Column(name = "ADR4H6")
    public String getPlanVerifyGpiList() {
        return planVerifyGpiList;
    }

    public void setPlanVerifyGpiList(String planVerifyGpiList) {
        this.planVerifyGpiList = planVerifyGpiList;
    }

    @Basic
    @Column(name = "ADR6H6")
    public String getPlanVerifyCob() {
        return planVerifyCob;
    }

    public void setPlanVerifyCob(String planVerifyCob) {
        this.planVerifyCob = planVerifyCob;
    }

    @Basic
    @Column(name = "ADNXCD")
    public String getDugTableName() {
        return dugTableName;
    }

    public void setDugTableName(String dugTableName) {
        this.dugTableName = dugTableName;
    }

    @Basic
    @Column(name = "ADCCT3")
    public String getPlanQualifier() {
        return planQualifier;
    }

    public void setPlanQualifier(String planQualifier) {
        this.planQualifier = planQualifier;
    }

    @Basic
    @Column(name = "ADMKH6")
    public String getPlanAuditFlag() {
        return planAuditFlag;
    }

    public void setPlanAuditFlag(String planAuditFlag) {
        this.planAuditFlag = planAuditFlag;
    }

    @Basic
    @Column(name = "ADR7H6")
    public String getPlanFutureUseFlag1() {
        return planFutureUseFlag1;
    }

    public void setPlanFutureUseFlag1(String planFutureUseFlag1) {
        this.planFutureUseFlag1 = planFutureUseFlag1;
    }

    @Basic
    @Column(name = "ADR8H6")
    public String getPlanFutureUseFlag2() {
        return planFutureUseFlag2;
    }

    public void setPlanFutureUseFlag2(String planFutureUseFlag2) {
        this.planFutureUseFlag2 = planFutureUseFlag2;
    }

    @Basic
    @Column(name = "ADR9H6")
    public String getPlanFutureUseFlag3() {
        return planFutureUseFlag3;
    }

    public void setPlanFutureUseFlag3(String planFutureUseFlag3) {
        this.planFutureUseFlag3 = planFutureUseFlag3;
    }

    @Basic
    @Column(name = "ADSAH6")
    public String getPlanFutureUseFlag4() {
        return planFutureUseFlag4;
    }

    public void setPlanFutureUseFlag4(String planFutureUseFlag4) {
        this.planFutureUseFlag4 = planFutureUseFlag4;
    }

    @Basic
    @Column(name = "ADBIHB")
    public String getPlanFutureUseCode1() {
        return planFutureUseCode1;
    }

    public void setPlanFutureUseCode1(String planFutureUseCode1) {
        this.planFutureUseCode1 = planFutureUseCode1;
    }

    @Basic
    @Column(name = "ADBJHB")
    public String getPlanFutureUseCode2() {
        return planFutureUseCode2;
    }

    public void setPlanFutureUseCode2(String planFutureUseCode2) {
        this.planFutureUseCode2 = planFutureUseCode2;
    }

    @Basic
    @Column(name = "ADAKVN")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ADC2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ADADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADALVN")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "ADADVN")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "ADBMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "ADABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "ADAEVN")
    public String getChgProgramName() {
        return chgProgramName;
    }

    public void setChgProgramName(String chgProgramName) {
        this.chgProgramName = chgProgramName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.optum.rxclaimnextgen.entities.PlnPlan that = (com.optum.rxclaimnextgen.entities.PlnPlan) o;

        if (planEffDate != that.planEffDate) return false;
        if (planTermDate != that.planTermDate) return false;
        if (addDate != that.addDate) return false;
        if (addTime != that.addTime) return false;
        if (chgDate != that.chgDate) return false;
        if (chgTime != that.chgTime) return false;
        if (planCode != null ? !planCode.equals(that.planCode) : that.planCode != null) return false;
        if (planName != null ? !planName.equals(that.planName) : that.planName != null) return false;
        if (planVerifyMember != null ? !planVerifyMember.equals(that.planVerifyMember) : that.planVerifyMember != null)
            return false;
        if (planVerifyRxNetwork != null ? !planVerifyRxNetwork.equals(that.planVerifyRxNetwork) : that.planVerifyRxNetwork != null)
            return false;
        if (planDea != null ? !planDea.equals(that.planDea) : that.planDea != null) return false;
        if (planPreferredFormulary != null ? !planPreferredFormulary.equals(that.planPreferredFormulary) : that.planPreferredFormulary != null)
            return false;
        if (planDefaultDrugStatus != null ? !planDefaultDrugStatus.equals(that.planDefaultDrugStatus) : that.planDefaultDrugStatus != null)
            return false;
        if (planEligibilityOverride != null ? !planEligibilityOverride.equals(that.planEligibilityOverride) : that.planEligibilityOverride != null)
            return false;
        if (desiIndicator != null ? !desiIndicator.equals(that.desiIndicator) : that.desiIndicator != null)
            return false;
        if (planVerifyMdNetwork != null ? !planVerifyMdNetwork.equals(that.planVerifyMdNetwork) : that.planVerifyMdNetwork != null)
            return false;
        if (planVerifyMdSpecialty != null ? !planVerifyMdSpecialty.equals(that.planVerifyMdSpecialty) : that.planVerifyMdSpecialty != null)
            return false;
        if (planVerifyCareFacility != null ? !planVerifyCareFacility.equals(that.planVerifyCareFacility) : that.planVerifyCareFacility != null)
            return false;
        if (planVerifyRestrictions != null ? !planVerifyRestrictions.equals(that.planVerifyRestrictions) : that.planVerifyRestrictions != null)
            return false;
        if (planVerifyPricing != null ? !planVerifyPricing.equals(that.planVerifyPricing) : that.planVerifyPricing != null)
            return false;
        if (planVerifyTherapy != null ? !planVerifyTherapy.equals(that.planVerifyTherapy) : that.planVerifyTherapy != null)
            return false;
        if (planVerifyBrndGenSubs != null ? !planVerifyBrndGenSubs.equals(that.planVerifyBrndGenSubs) : that.planVerifyBrndGenSubs != null)
            return false;
        if (planVerify3rdPtyExcp != null ? !planVerify3rdPtyExcp.equals(that.planVerify3rdPtyExcp) : that.planVerify3rdPtyExcp != null)
            return false;
        if (planVerifyLegendOtc != null ? !planVerifyLegendOtc.equals(that.planVerifyLegendOtc) : that.planVerifyLegendOtc != null)
            return false;
        if (planVerifyFdaTherEqui != null ? !planVerifyFdaTherEqui.equals(that.planVerifyFdaTherEqui) : that.planVerifyFdaTherEqui != null)
            return false;
        if (planVerifyDeaCode != null ? !planVerifyDeaCode.equals(that.planVerifyDeaCode) : that.planVerifyDeaCode != null)
            return false;
        if (planVerifyDosageForm != null ? !planVerifyDosageForm.equals(that.planVerifyDosageForm) : that.planVerifyDosageForm != null)
            return false;
        if (planVerifyRouteOfAdm != null ? !planVerifyRouteOfAdm.equals(that.planVerifyRouteOfAdm) : that.planVerifyRouteOfAdm != null)
            return false;
        if (planVerifyPackaging != null ? !planVerifyPackaging.equals(that.planVerifyPackaging) : that.planVerifyPackaging != null)
            return false;
        if (planVerifyMaintDrug != null ? !planVerifyMaintDrug.equals(that.planVerifyMaintDrug) : that.planVerifyMaintDrug != null)
            return false;
        if (planVerifyCompound != null ? !planVerifyCompound.equals(that.planVerifyCompound) : that.planVerifyCompound != null)
            return false;
        if (planLevelOfService != null ? !planLevelOfService.equals(that.planLevelOfService) : that.planLevelOfService != null)
            return false;
        if (daysSupplyQtyDispLmts != null ? !daysSupplyQtyDispLmts.equals(that.daysSupplyQtyDispLmts) : that.daysSupplyQtyDispLmts != null)
            return false;
        if (planVerifyRefillLimits != null ? !planVerifyRefillLimits.equals(that.planVerifyRefillLimits) : that.planVerifyRefillLimits != null)
            return false;
        if (deductibleCapLimits != null ? !deductibleCapLimits.equals(that.deductibleCapLimits) : that.deductibleCapLimits != null)
            return false;
        if (planCustomerLocation != null ? !planCustomerLocation.equals(that.planCustomerLocation) : that.planCustomerLocation != null)
            return false;
        if (planPatientPayQual != null ? !planPatientPayQual.equals(that.planPatientPayQual) : that.planPatientPayQual != null)
            return false;
        if (planVerifyNdcList != null ? !planVerifyNdcList.equals(that.planVerifyNdcList) : that.planVerifyNdcList != null)
            return false;
        if (planVerifyGpiList != null ? !planVerifyGpiList.equals(that.planVerifyGpiList) : that.planVerifyGpiList != null)
            return false;
        if (planVerifyCob != null ? !planVerifyCob.equals(that.planVerifyCob) : that.planVerifyCob != null)
            return false;
        if (dugTableName != null ? !dugTableName.equals(that.dugTableName) : that.dugTableName != null) return false;
        if (planQualifier != null ? !planQualifier.equals(that.planQualifier) : that.planQualifier != null)
            return false;
        if (planAuditFlag != null ? !planAuditFlag.equals(that.planAuditFlag) : that.planAuditFlag != null)
            return false;
        if (planFutureUseFlag1 != null ? !planFutureUseFlag1.equals(that.planFutureUseFlag1) : that.planFutureUseFlag1 != null)
            return false;
        if (planFutureUseFlag2 != null ? !planFutureUseFlag2.equals(that.planFutureUseFlag2) : that.planFutureUseFlag2 != null)
            return false;
        if (planFutureUseFlag3 != null ? !planFutureUseFlag3.equals(that.planFutureUseFlag3) : that.planFutureUseFlag3 != null)
            return false;
        if (planFutureUseFlag4 != null ? !planFutureUseFlag4.equals(that.planFutureUseFlag4) : that.planFutureUseFlag4 != null)
            return false;
        if (planFutureUseCode1 != null ? !planFutureUseCode1.equals(that.planFutureUseCode1) : that.planFutureUseCode1 != null)
            return false;
        if (planFutureUseCode2 != null ? !planFutureUseCode2.equals(that.planFutureUseCode2) : that.planFutureUseCode2 != null)
            return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = planCode != null ? planCode.hashCode() : 0;
        result = 31 * result + planEffDate;
        result = 31 * result + planTermDate;
        result = 31 * result + (planName != null ? planName.hashCode() : 0);
        result = 31 * result + (planVerifyMember != null ? planVerifyMember.hashCode() : 0);
        result = 31 * result + (planVerifyRxNetwork != null ? planVerifyRxNetwork.hashCode() : 0);
        result = 31 * result + (planDea != null ? planDea.hashCode() : 0);
        result = 31 * result + (planPreferredFormulary != null ? planPreferredFormulary.hashCode() : 0);
        result = 31 * result + (planDefaultDrugStatus != null ? planDefaultDrugStatus.hashCode() : 0);
        result = 31 * result + (planEligibilityOverride != null ? planEligibilityOverride.hashCode() : 0);
        result = 31 * result + (desiIndicator != null ? desiIndicator.hashCode() : 0);
        result = 31 * result + (planVerifyMdNetwork != null ? planVerifyMdNetwork.hashCode() : 0);
        result = 31 * result + (planVerifyMdSpecialty != null ? planVerifyMdSpecialty.hashCode() : 0);
        result = 31 * result + (planVerifyCareFacility != null ? planVerifyCareFacility.hashCode() : 0);
        result = 31 * result + (planVerifyRestrictions != null ? planVerifyRestrictions.hashCode() : 0);
        result = 31 * result + (planVerifyPricing != null ? planVerifyPricing.hashCode() : 0);
        result = 31 * result + (planVerifyTherapy != null ? planVerifyTherapy.hashCode() : 0);
        result = 31 * result + (planVerifyBrndGenSubs != null ? planVerifyBrndGenSubs.hashCode() : 0);
        result = 31 * result + (planVerify3rdPtyExcp != null ? planVerify3rdPtyExcp.hashCode() : 0);
        result = 31 * result + (planVerifyLegendOtc != null ? planVerifyLegendOtc.hashCode() : 0);
        result = 31 * result + (planVerifyFdaTherEqui != null ? planVerifyFdaTherEqui.hashCode() : 0);
        result = 31 * result + (planVerifyDeaCode != null ? planVerifyDeaCode.hashCode() : 0);
        result = 31 * result + (planVerifyDosageForm != null ? planVerifyDosageForm.hashCode() : 0);
        result = 31 * result + (planVerifyRouteOfAdm != null ? planVerifyRouteOfAdm.hashCode() : 0);
        result = 31 * result + (planVerifyPackaging != null ? planVerifyPackaging.hashCode() : 0);
        result = 31 * result + (planVerifyMaintDrug != null ? planVerifyMaintDrug.hashCode() : 0);
        result = 31 * result + (planVerifyCompound != null ? planVerifyCompound.hashCode() : 0);
        result = 31 * result + (planLevelOfService != null ? planLevelOfService.hashCode() : 0);
        result = 31 * result + (daysSupplyQtyDispLmts != null ? daysSupplyQtyDispLmts.hashCode() : 0);
        result = 31 * result + (planVerifyRefillLimits != null ? planVerifyRefillLimits.hashCode() : 0);
        result = 31 * result + (deductibleCapLimits != null ? deductibleCapLimits.hashCode() : 0);
        result = 31 * result + (planCustomerLocation != null ? planCustomerLocation.hashCode() : 0);
        result = 31 * result + (planPatientPayQual != null ? planPatientPayQual.hashCode() : 0);
        result = 31 * result + (planVerifyNdcList != null ? planVerifyNdcList.hashCode() : 0);
        result = 31 * result + (planVerifyGpiList != null ? planVerifyGpiList.hashCode() : 0);
        result = 31 * result + (planVerifyCob != null ? planVerifyCob.hashCode() : 0);
        result = 31 * result + (dugTableName != null ? dugTableName.hashCode() : 0);
        result = 31 * result + (planQualifier != null ? planQualifier.hashCode() : 0);
        result = 31 * result + (planAuditFlag != null ? planAuditFlag.hashCode() : 0);
        result = 31 * result + (planFutureUseFlag1 != null ? planFutureUseFlag1.hashCode() : 0);
        result = 31 * result + (planFutureUseFlag2 != null ? planFutureUseFlag2.hashCode() : 0);
        result = 31 * result + (planFutureUseFlag3 != null ? planFutureUseFlag3.hashCode() : 0);
        result = 31 * result + (planFutureUseFlag4 != null ? planFutureUseFlag4.hashCode() : 0);
        result = 31 * result + (planFutureUseCode1 != null ? planFutureUseCode1.hashCode() : 0);
        result = 31 * result + (planFutureUseCode2 != null ? planFutureUseCode2.hashCode() : 0);
        result = 31 * result + (addUserName != null ? addUserName.hashCode() : 0);
        result = 31 * result + addDate;
        result = 31 * result + addTime;
        result = 31 * result + (addProgramName != null ? addProgramName.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + chgDate;
        result = 31 * result + chgTime;
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlnPlan{" +
                "planCode='" + planCode + '\'' +
                ", planEffDate=" + planEffDate +
                ", planTermDate=" + planTermDate +
                ", planName='" + planName + '\'' +
                ", planVerifyMember='" + planVerifyMember + '\'' +
                ", planVerifyRxNetwork='" + planVerifyRxNetwork + '\'' +
                ", planDea='" + planDea + '\'' +
                ", planPreferredFormulary='" + planPreferredFormulary + '\'' +
                ", planDefaultDrugStatus='" + planDefaultDrugStatus + '\'' +
                ", planEligibilityOverride='" + planEligibilityOverride + '\'' +
                ", desiIndicator='" + desiIndicator + '\'' +
                ", planVerifyMdNetwork='" + planVerifyMdNetwork + '\'' +
                ", planVerifyMdSpecialty='" + planVerifyMdSpecialty + '\'' +
                ", planVerifyCareFacility='" + planVerifyCareFacility + '\'' +
                ", planVerifyRestrictions='" + planVerifyRestrictions + '\'' +
                ", planVerifyPricing='" + planVerifyPricing + '\'' +
                ", planVerifyTherapy='" + planVerifyTherapy + '\'' +
                ", planVerifyBrndGenSubs='" + planVerifyBrndGenSubs + '\'' +
                ", planVerify3rdPtyExcp='" + planVerify3rdPtyExcp + '\'' +
                ", planVerifyLegendOtc='" + planVerifyLegendOtc + '\'' +
                ", planVerifyFdaTherEqui='" + planVerifyFdaTherEqui + '\'' +
                ", planVerifyDeaCode='" + planVerifyDeaCode + '\'' +
                ", planVerifyDosageForm='" + planVerifyDosageForm + '\'' +
                ", planVerifyRouteOfAdm='" + planVerifyRouteOfAdm + '\'' +
                ", planVerifyPackaging='" + planVerifyPackaging + '\'' +
                ", planVerifyMaintDrug='" + planVerifyMaintDrug + '\'' +
                ", planVerifyCompound='" + planVerifyCompound + '\'' +
                ", planLevelOfService='" + planLevelOfService + '\'' +
                ", daysSupplyQtyDispLmts='" + daysSupplyQtyDispLmts + '\'' +
                ", planVerifyRefillLimits='" + planVerifyRefillLimits + '\'' +
                ", deductibleCapLimits='" + deductibleCapLimits + '\'' +
                ", planCustomerLocation='" + planCustomerLocation + '\'' +
                ", planPatientPayQual='" + planPatientPayQual + '\'' +
                ", planVerifyNdcList='" + planVerifyNdcList + '\'' +
                ", planVerifyGpiList='" + planVerifyGpiList + '\'' +
                ", planVerifyCob='" + planVerifyCob + '\'' +
                ", dugTableName='" + dugTableName + '\'' +
                ", planQualifier='" + planQualifier + '\'' +
                ", planAuditFlag='" + planAuditFlag + '\'' +
                ", planFutureUseFlag1='" + planFutureUseFlag1 + '\'' +
                ", planFutureUseFlag2='" + planFutureUseFlag2 + '\'' +
                ", planFutureUseFlag3='" + planFutureUseFlag3 + '\'' +
                ", planFutureUseFlag4='" + planFutureUseFlag4 + '\'' +
                ", planFutureUseCode1='" + planFutureUseCode1 + '\'' +
                ", planFutureUseCode2='" + planFutureUseCode2 + '\'' +
                ", addUserName='" + addUserName + '\'' +
                ", addDate=" + addDate +
                ", addTime=" + addTime +
                ", addProgramName='" + addProgramName + '\'' +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}
