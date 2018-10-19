package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgEligMemberDefaultsEmdTest {

    private ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd;

    @Before
    public void setUp() {
        this.elgEligMemberDefaultsEmd = new ElgEligMemberDefaultsEmd();
    }

    @After
    public void tearDown() {
        this.elgEligMemberDefaultsEmd = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setCarCarrierId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setAccountId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setGroupId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getGroupId());
    }

    @Test
    public void setEmdMemberEligibilityTp() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMemberEligibilityTp(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMemberEligibilityTp());
    }

    @Test
    public void setEmdCreateFamilyInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCreateFamilyInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCreateFamilyInd());
    }

    @Test
    public void setEmdCreateSpouseInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCreateSpouseInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCreateSpouseInd());
    }

    @Test
    public void setEmdCreateDependentsInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCreateDependentsInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCreateDependentsInd());
    }

    @Test
    public void setEmdNumberOfDependents() throws Exception {
        BigInteger expected = BigInteger.TEN;
        this.elgEligMemberDefaultsEmd.setEmdNumberOfDependents(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdNumberOfDependents());
    }

    @Test
    public void setEmdNameInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdNameInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdNameInd());
    }

    @Test
    public void setEmdLastName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdLastName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdLastName());
    }

    @Test
    public void setEmdFirstName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFirstName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFirstName());
    }

    @Test
    public void setEmdMiddleInitial() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMiddleInitial(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMiddleInitial());
    }

    @Test
    public void setEmdAddressInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAddressInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAddressInd());
    }

    @Test
    public void setEmdCountryInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCountryInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCountryInd());
    }

    @Test
    public void setEmdCountryCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCountryCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCountryCode());
    }

    @Test
    public void setEmdEmailInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdEmailInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdEmailInd());
    }

    @Test
    public void setEmdPhoneNumberInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdPhoneNumberInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdPhoneNumberInd());
    }

    @Test
    public void setEmdSocSecNbrInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdSocSecNbrInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdSocSecNbrInd());
    }

    @Test
    public void setEmdSocSecNbr() throws Exception {
        Integer expected = 123456789;
        this.elgEligMemberDefaultsEmd.setEmdSocSecNbr(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdSocSecNbr());
    }

    @Test
    public void setEmdBuildSocSecNbr() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdBuildSocSecNbr(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdBuildSocSecNbr());
    }

    @Test
    public void setEmdSexInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdSexInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdSexInd());
    }

    @Test
    public void setEmdSex() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdSex(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdSex());
    }

    @Test
    public void setEmdDurKeyInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDurKeyInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDurKeyInd());
    }

    @Test
    public void setEmdDurKey() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDurKey(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDurKey());
    }

    @Test
    public void setEmdDateOfBirthInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDateOfBirthInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDateOfBirthInd());
    }

    @Test
    public void setEmdDateOfBirth() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdDateOfBirth(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDateOfBirth());
    }

    @Test
    public void setEmdRenewalDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdRenewalDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdRenewalDateInd());
    }

    @Test
    public void setEmdRenewalDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdRenewalDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdRenewalDate());
    }

    @Test
    public void setEmdEffectiveDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdEffectiveDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdEffectiveDateInd());
    }

    @Test
    public void setEmdEffectiveDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdEffectiveDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdEffectiveDate());
    }

    @Test
    public void setEmdThruDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdThruDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdThruDateInd());
    }

    @Test
    public void setEmdThruDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdThruDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdThruDate());
    }

    @Test
    public void setEmdThruDays() throws Exception {
        Integer expected = 200;
        this.elgEligMemberDefaultsEmd.setEmdThruDays(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdThruDays());
    }

    @Test
    public void setEmdMedicareHicInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMedicareHicInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMedicareHicInd());
    }

    @Test
    public void setEmdMedicareHic() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMedicareHic(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMedicareHic());
    }

    @Test
    public void setEmdMedicareEffDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMedicareEffDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMedicareEffDateInd());
    }

    @Test
    public void setEmdMedicareEffDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdMedicareEffDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMedicareEffDate());
    }

    @Test
    public void setEmdMedicareCvgTypeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMedicareCvgTypeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMedicareCvgTypeInd());
    }

    @Test
    public void setEmdMedicareCvgType() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMedicareCvgType(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMedicareCvgType());
    }

    @Test
    public void setEmdPhysicianIdInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdPhysicianIdInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdPhysicianIdInd());
    }

    @Test
    public void setPrfPrescriberId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setPrfPrescriberId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getPrfPrescriberId());
    }

    @Test
    public void setPrqPrscrbrIdQualifier() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setPrqPrscrbrIdQualifier(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getPrqPrscrbrIdQualifier());
    }

    @Test
    public void setPrfPrescriberIdState() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setPrfPrescriberIdState(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getPrfPrescriberIdState());
    }

    @Test
    public void setEmdCareFacilityInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCareFacilityInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCareFacilityInd());
    }

    @Test
    public void setCfaCareFacilityId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setCfaCareFacilityId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getCfaCareFacilityId());
    }

    @Test
    public void setEmdPersonCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdPersonCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdPersonCodeInd());
    }

    @Test
    public void setEmdPersonCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdPersonCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdPersonCode());
    }

    @Test
    public void setEmdFamilyTypeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFamilyTypeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFamilyTypeInd());
    }

    @Test
    public void setEmdFamilyType() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFamilyType(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFamilyType());
    }

    @Test
    public void setEmdFamilyIndicatorInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFamilyIndicatorInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFamilyIndicatorInd());
    }

    @Test
    public void setEmdFamilyIndicator() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFamilyIndicator(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFamilyIndicator());
    }

    @Test
    public void setEmdFamilyIdInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFamilyIdInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFamilyIdInd());
    }

    @Test
    public void setEmdFamilyId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdFamilyId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdFamilyId());
    }

    @Test
    public void setEmdRelationshipCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdRelationshipCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdRelationshipCodeInd());
    }

    @Test
    public void setEmdRelationshipCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdRelationshipCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdRelationshipCode());
    }

    @Test
    public void setEmdAlternateInsInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAlternateInsInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAlternateInsInd());
    }

    @Test
    public void setEmdAlternateIns() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAlternateIns(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAlternateIns());
    }

    @Test
    public void setEmdAltInsCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAltInsCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAltInsCodeInd());
    }

    @Test
    public void setEmdAltInsCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAltInsCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAltInsCode());
    }

    @Test
    public void setEmdAltInsuranceIdInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAltInsuranceIdInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAltInsuranceIdInd());
    }

    @Test
    public void setEmdAltInsuranceId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAltInsuranceId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAltInsuranceId());
    }

    @Test
    public void setEmdBrandCopayInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdBrandCopayInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdBrandCopayInd());
    }

    @Test
    public void setEmdBrandCopay() throws Exception {
        BigDecimal expected = BigDecimal.TEN;
        this.elgEligMemberDefaultsEmd.setEmdBrandCopay(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdBrandCopay());
    }

    @Test
    public void setEmdGenericCopayInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdGenericCopayInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdGenericCopayInd());
    }

    @Test
    public void setEmdGenericCopay() throws Exception {
        BigDecimal expected = BigDecimal.TEN;
        this.elgEligMemberDefaultsEmd.setEmdGenericCopay(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdGenericCopay());
    }

    @Test
    public void setEmdCopay3Ind() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCopay3Ind(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCopay3Ind());
    }

    @Test
    public void setEmdCopay3() throws Exception {
        BigDecimal expected = BigDecimal.TEN;
        this.elgEligMemberDefaultsEmd.setEmdCopay3(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCopay3());
    }

    @Test
    public void setEmdCopay4Ind() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCopay4Ind(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCopay4Ind());
    }

    @Test
    public void setEmdCopay4() throws Exception {
        BigDecimal expected = BigDecimal.TEN;
        this.elgEligMemberDefaultsEmd.setEmdCopay4(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCopay4());
    }

    @Test
    public void setEmdPlanInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdPlanInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdPlanInd());
    }

    @Test
    public void setPlanCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setPlanCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getPlanCode());
    }

    @Test
    public void setPlanEffDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setPlanEffDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getPlanEffDate());
    }

    @Test
    public void setEmdLanguageCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdLanguageCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdLanguageCodeInd());
    }

    @Test
    public void setEmdLanguageCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdLanguageCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdLanguageCode());
    }

    @Test
    public void setEmdDurFlagInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDurFlagInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDurFlagInd());
    }

    @Test
    public void setEmdDurFlag() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDurFlag(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDurFlag());
    }

    @Test
    public void setEmdMultBirthCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMultBirthCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMultBirthCodeInd());
    }

    @Test
    public void setEmdMultipleBirthCode() throws Exception {
        BigInteger expexted = BigInteger.TEN;
        this.elgEligMemberDefaultsEmd.setEmdMultipleBirthCode(expexted);

        assertEquals(expexted, this.elgEligMemberDefaultsEmd.getEmdMultipleBirthCode());
    }

    @Test
    public void setEmdBaseMemberIdLength() throws Exception {
        BigInteger expexted = BigInteger.TEN;
        this.elgEligMemberDefaultsEmd.setEmdBaseMemberIdLength(expexted);

        assertEquals(expexted, this.elgEligMemberDefaultsEmd.getEmdBaseMemberIdLength());
    }

    @Test
    public void setEmdOrigEffDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdOrigEffDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdOrigEffDateInd());
    }

    @Test
    public void setEmdOrigEffectiveDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdOrigEffectiveDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdOrigEffectiveDate());
    }

    @Test
    public void setEmdMemberTypeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMemberTypeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMemberTypeInd());
    }

    @Test
    public void setEmdMemberType() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMemberType(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMemberType());
    }

    @Test
    public void setEmdNetworkInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdNetworkInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdNetworkInd());
    }

    @Test
    public void setCnwNetworkId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setCnwNetworkId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getCnwNetworkId());
    }

    @Test
    public void setEmdQualifierInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdQualifierInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdQualifierInd());
    }

    @Test
    public void setCquQualifierId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setCquQualifierId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getCquQualifierId());
    }

    @Test
    public void setEmdCareEffDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCareEffDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCareEffDateInd());
    }

    @Test
    public void setEmdCareEffDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdCareEffDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCareEffDate());
    }

    @Test
    public void setEmdCareThruDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdCareThruDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCareThruDateInd());
    }

    @Test
    public void setEmdCareThruDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdCareThruDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdCareThruDate());
    }

    @Test
    public void setEmdClientProdCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdClientProdCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdClientProdCodeInd());
    }

    @Test
    public void setEmdClientProductCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdClientProductCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdClientProductCode());
    }

    @Test
    public void setEmdClientRiderCodeInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdClientRiderCodeInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdClientRiderCodeInd());
    }

    @Test
    public void setEmdClientRiderCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdClientRiderCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdClientRiderCode());
    }

    @Test
    public void setEmdMcfOvrPlanInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMcfOvrPlanInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMcfOvrPlanInd());
    }

    @Test
    public void setEmdMcfOvrPlanCode() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMcfOvrPlanCode(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMcfOvrPlanCode());
    }

    @Test
    public void setEmdMcfOvrPlanEffDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdMcfOvrPlanEffDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMcfOvrPlanEffDate());
    }

    @Test
    public void setEmdMaiEffDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMaiEffDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMaiEffDateInd());
    }

    @Test
    public void setEmdMaiEffDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdMaiEffDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMaiEffDate());
    }

    @Test
    public void setEmdMaiThruDateInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMaiThruDateInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMaiThruDateInd());
    }

    @Test
    public void setEmdMaiThruDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setEmdMaiThruDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMaiThruDate());
    }

    @Test
    public void setEmdAutoTermMatchSex() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAutoTermMatchSex(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAutoTermMatchSex());
    }

    @Test
    public void setEmdAutoTermMatchDob() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdAutoTermMatchDob(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdAutoTermMatchDob());
    }

    @Test
    public void setEmdInactvFutureCovInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdInactvFutureCovInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdInactvFutureCovInd());
    }

    @Test
    public void setEmdPlanEligValidation() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdPlanEligValidation(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdPlanEligValidation());
    }

    @Test
    public void setEmdSsnOnErrorFile() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdSsnOnErrorFile(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdSsnOnErrorFile());
    }

    @Test
    public void setEmdMaiLock() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMaiLock(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMaiLock());
    }

    @Test
    public void setEmdMemberIdFormatChec() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdMemberIdFormatChec(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdMemberIdFormatChec());
    }

    @Test
    public void setEmdDataFldsInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDataFldsInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDataFldsInd());
    }

    @Test
    public void setEmdDataFldsEffDteInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDataFldsEffDteInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDataFldsEffDteInd());
    }

    @Test
    public void setEmdDataFldsThrDteInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setEmdDataFldsThrDteInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getEmdDataFldsThrDteInd());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setAddUserName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setAddDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgEligMemberDefaultsEmd.setAddTime(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setAddProgramName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setChgUserName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsEmd.setChgDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgEligMemberDefaultsEmd.setChgTime(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmd.setChgProgramName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmd.getChgProgramName());
    }

}