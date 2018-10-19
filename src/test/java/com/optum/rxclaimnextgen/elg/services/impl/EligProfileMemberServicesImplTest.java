package com.optum.rxclaimnextgen.elg.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.AbstractTest;
import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberCareAssignDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberHimDefaultOvrDetailForm;
import com.optum.rxclaimnextgen.elg.repositories.*;
import com.optum.rxclaimnextgen.elg.services.EligProfileMemberServices;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


/**
 * Created by bkocinsk on 7/3/2018.
 */
public class EligProfileMemberServicesImplTest extends AbstractTest {

    @Autowired
    private EligProfileMemberServices eligProfileMemberServicesImpl;

    @MockBean
    private ElgEligMemberDefaultsEmdRepository elgMemberDefaultsEmdRepo;

    @MockBean
    private ElgMemberPartdDefaultsEmpRepository elgMemberPartdDefaultsRepo;

    @MockBean
    private ElgEligMemberDefaultsOvrEmhRepository elgEligMemberDefaultsOvrEmhRepository;

    @MockBean
    private ElgMbrOtherCoverageDefaultsEmcRepository elgMbrOtherCoverageDefaultsEmcRepository;

    @MockBean
    private ElgEligProfileEpfRepository eligProfEpfRepo;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void findMemberDefaultsEmdByPrimaryKey() throws Exception {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";
        ElgEligMemberDefaultsEmd expected = new ElgEligMemberDefaultsEmd();


        when(elgMemberDefaultsEmdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileMemberServicesImpl.findMemberDefaultsEmdByPrimaryKey(carCarrierId, accountId, groupId));
    }

    @Test
    public void findMemberDefaultsOvrEmhByPrimaryKey() throws Exception {
        ElgEligMemberDefaultsOvrEmh expected = new ElgEligMemberDefaultsOvrEmh();
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        when(elgEligMemberDefaultsOvrEmhRepository.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileMemberServicesImpl.findMemberDefaultsOvrEmhByPrimaryKey(carCarrierId, accountId, groupId));
    }

    @Test
    public void findMemberPartdDefaultsEmpByPrimaryKey() throws Exception {
        ElgMemberPartdDefaultsEmp expected = new ElgMemberPartdDefaultsEmp();
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        when(elgMemberPartdDefaultsRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileMemberServicesImpl.findMemberPartdDefaultsEmpByPrimaryKey(carCarrierId, accountId, groupId));
    }

    @Test
    public void findMbrOtherCovDefaultsByPrimaryKey() throws Exception {
        ElgMbrOtherCoverageDefaultsEmc expected = new ElgMbrOtherCoverageDefaultsEmc();
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        when(elgMbrOtherCoverageDefaultsEmcRepository.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId))
                .thenReturn(expected)
        ;

        assertEquals(expected, elgMbrOtherCoverageDefaultsEmcRepository.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId));
    }

    /*
    @Test
    public void getMemberHimDefaultsOvrDetailsByPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgEligMemberDefaultsOvrEmh expected = new ElgEligMemberDefaultsOvrEmh();
        expected.setCarCarrierId("a");
        expected.setAccountId("b");
        expected.setGroupId("c");
        expected.setEmhHimFromThruDateI("d");
        expected.setEmhHimFromThruDateR("e");
        expected.setEmhQhpPlanIdInd("f");
        expected.setEmhQhpPlanIdRep("g");
        expected.setEmhCsrLevelInd("h");
        expected.setEmhCsrLevelRep("i");
        expected.setEmhMetalLevelInd("j");
        expected.setEmhMetalLevelIndRep("k");
        expected.setEmhMemberEthnicityInd("l");
        expected.setEmhMemberEthnicityRep("m");
        expected.setEmhAptcIndicator("n");
        expected.setEmhHimGraceStartEndI("o");
        expected.setEmhHimGraceStartEndR("p");
        expected.setEmhFamilyIdReproc("q");
        expected.setAddDate(new Date(1234));
        expected.setAddTime(new Time(1234));
        expected.setAddProgramName("r");
        expected.setAddUserName("s");
        expected.setChgDate(new Date(4321));
        expected.setChgTime(new Time(4321));
        expected.setChgProgramName("t");
        expected.setChgUserName("u");

        when(elgEligMemberDefaultsOvrEmhRepository.findByCarCarrierIdAndAccountIdAndGroupId(anyString(), anyString(), anyString()))
            .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileMemberServicesImpl.getMemberHimDefaultsOvrDetailsByPrimaryKey(carCarrierId, accountId, groupId).toString());
    }
    */

    @Test
    public void populateHimDefaultsOvrDetailsByPrimaryKeyTest() throws Exception {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh = new ElgEligMemberDefaultsOvrEmh();
        elgEligMemberDefaultsOvrEmh.setCarCarrierId("a");
        elgEligMemberDefaultsOvrEmh.setAccountId("b");
        elgEligMemberDefaultsOvrEmh.setGroupId("c");
        elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateI("d");
        elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateR("e");
        elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdInd("f");
        elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdRep("g");
        elgEligMemberDefaultsOvrEmh.setEmhCsrLevelInd("h");
        elgEligMemberDefaultsOvrEmh.setEmhCsrLevelRep("i");
        elgEligMemberDefaultsOvrEmh.setEmhMetalLevelInd("j");
        elgEligMemberDefaultsOvrEmh.setEmhMetalLevelIndRep("k");
        elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityInd("l");
        elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityRep("m");
        elgEligMemberDefaultsOvrEmh.setEmhAptcIndicator("n");
        elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndI("o");
        elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndR("p");
        elgEligMemberDefaultsOvrEmh.setEmhFamilyIdReproc("q");
        elgEligMemberDefaultsOvrEmh.setAddDate(new Date(1234));
        elgEligMemberDefaultsOvrEmh.setAddTime(new Time(1234));
        elgEligMemberDefaultsOvrEmh.setAddProgramName("r");
        elgEligMemberDefaultsOvrEmh.setAddUserName("s");
        elgEligMemberDefaultsOvrEmh.setChgDate(new Date(4321));
        elgEligMemberDefaultsOvrEmh.setChgTime(new Time(4321));
        elgEligMemberDefaultsOvrEmh.setChgProgramName("t");
        elgEligMemberDefaultsOvrEmh.setChgUserName("u");

        EligMemberHimDefaultOvrDetailForm expected = new EligMemberHimDefaultOvrDetailForm();
        expected.setCarCarrierId("a");
        expected.setAccountId("b");
        expected.setGroupId("c");
        expected.setEmhHimFromThruDateI("d");
        expected.setEmhHimFromThruDateR("e");
        expected.setEmhQhpPlanIdInd("f");
        expected.setEmhQhpPlanIdRep("g");
        expected.setEmhCsrLevelInd("h");
        expected.setEmhCsrLevelRep("i");
        expected.setEmhMetalLevelInd("j");
        expected.setEmhMetalLevelIndRep("k");
        expected.setEmhMemberEthnicityInd("l");
        expected.setEmhMemberEthnicityRep("m");
        expected.setEmhAptcIndicator("n");
        expected.setEmhHimGraceStartEndI("o");
        expected.setEmhHimGraceStartEndR("p");
        expected.setEmhFamilyIdReproc("q");
        expected.setAddDate(DateUtils.convertDateToString(new Date(1234)));
        expected.setAddTime((new Time(1234)).toString());
        expected.setAddProgramName("r");
        expected.setAddUserName("s");
        expected.setChgDate(DateUtils.convertDateToString(new Date(4321)));
        expected.setChgTime((new Time(4321)).toString());
        expected.setChgProgramName("t");
        expected.setChgUserName("u");

        when(elgEligMemberDefaultsOvrEmhRepository.findByCarCarrierIdAndAccountIdAndGroupId(anyString(), anyString(), anyString()))
                .thenReturn(elgEligMemberDefaultsOvrEmh)
        ;

        assertEquals(expected.toString(), this.eligProfileMemberServicesImpl.populateHimDefaultsOvrDetailsByPrimaryKey(carCarrierId, accountId, groupId).toString());

    }

    /*
    @Test
    public void populatePojoFromEntity() throws Exception {
        ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh = new ElgEligMemberDefaultsOvrEmh();


        elgEligMemberDefaultsOvrEmh.setCarCarrierId("a");
        elgEligMemberDefaultsOvrEmh.setAccountId("b");
        elgEligMemberDefaultsOvrEmh.setGroupId("c");
        elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateI("d");
        elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateR("e");
        elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdInd("f");
        elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdRep("g");
        elgEligMemberDefaultsOvrEmh.setEmhCsrLevelInd("h");
        elgEligMemberDefaultsOvrEmh.setEmhCsrLevelRep("i");
        elgEligMemberDefaultsOvrEmh.setEmhMetalLevelInd("j");
        elgEligMemberDefaultsOvrEmh.setEmhMetalLevelIndRep("k");
        elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityInd("l");
        elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityRep("m");
        elgEligMemberDefaultsOvrEmh.setEmhAptcIndicator("n");
        elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndI("o");
        elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndR("p");
        elgEligMemberDefaultsOvrEmh.setEmhFamilyIdReproc("q");
        elgEligMemberDefaultsOvrEmh.setAddDate(new Date(1234));
        elgEligMemberDefaultsOvrEmh.setAddTime(new Time(1234));
        elgEligMemberDefaultsOvrEmh.setAddProgramName("r");
        elgEligMemberDefaultsOvrEmh.setAddUserName("s");
        elgEligMemberDefaultsOvrEmh.setChgDate(new Date(4321));
        elgEligMemberDefaultsOvrEmh.setChgTime(new Time(4321));
        elgEligMemberDefaultsOvrEmh.setChgProgramName("t");
        elgEligMemberDefaultsOvrEmh.setChgUserName("u");


        EligMemberHimDefaultOvrDetailForm expected = new EligMemberHimDefaultOvrDetailForm();
        expected.setCarCarrierId("a");
        expected.setAccountId("b");
        expected.setGroupId("c");
        expected.setEmhHimFromThruDateI("d");
        expected.setEmhHimFromThruDateR("e");
        expected.setEmhQhpPlanIdInd("f");
        expected.setEmhQhpPlanIdRep("g");
        expected.setEmhCsrLevelInd("h");
        expected.setEmhCsrLevelRep("i");
        expected.setEmhMetalLevelInd("j");
        expected.setEmhMetalLevelIndRep("k");
        expected.setEmhMemberEthnicityInd("l");
        expected.setEmhMemberEthnicityRep("m");
        expected.setEmhAptcIndicator("n");
        expected.setEmhHimGraceStartEndI("o");
        expected.setEmhHimGraceStartEndR("p");
        expected.setEmhFamilyIdReproc("q");
        expected.setAddDate(DateUtils.convertDateToString(new Date(1234)));
        expected.setAddTime((new Time(1234)).toString());
        expected.setAddProgramName("r");
        expected.setAddUserName("s");
        expected.setChgDate(DateUtils.convertDateToString(new Date(4321)));
        expected.setChgTime((new Time(4321)).toString());
        expected.setChgProgramName("t");
        expected.setChgUserName("u");

        assertEquals(expected.toString(), this.eligProfileMemberServicesImpl.populatePojoFromEntity(elgEligMemberDefaultsOvrEmh).toString());

    }
    */

    @Test
    public void findMbrOtherCovDefaultsByPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgMbrOtherCoverageDefaultsEmc expected = new ElgMbrOtherCoverageDefaultsEmc();

        when(elgMbrOtherCoverageDefaultsEmcRepository.findByCarCarrierIdAndAccountIdAndGroupId(anyString(), anyString(), anyString()))
            .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileMemberServicesImpl.findMbrOtherCovDefaultsByPrimaryKey(carCarrierId, accountId, groupId).toString());
    }

    @Test
    public void populateCareAssignPojoFromEntity() throws Exception {
        ElgEligMemberDefaultsEmd elgEligCareAssign = new ElgEligMemberDefaultsEmd();

        elgEligCareAssign.setCarCarrierId("a");
        elgEligCareAssign.setAccountId("b");
        elgEligCareAssign.setGroupId("c");
        elgEligCareAssign.setCarCarrierId("d") ;
        elgEligCareAssign.setAccountId("e");
        elgEligCareAssign.setGroupId("f");
        elgEligCareAssign.setEmdCareEffDateInd("g");
        elgEligCareAssign.setEmdCareEffDate(new Date(5487));
        elgEligCareAssign.setEmdCareThruDateInd("h");
        elgEligCareAssign.setEmdCareThruDate(new Date(1234));
        elgEligCareAssign.setEmdCareFacilityInd("i") ;
        elgEligCareAssign.setEmdNetworkInd("j");
        elgEligCareAssign.setEmdQualifierInd("k");
        elgEligCareAssign.setCnwNetworkId("l");
        elgEligCareAssign.setEmdMcfOvrPlanInd("m");
        elgEligCareAssign.setEmdMcfOvrPlanCode("n");
        elgEligCareAssign.setEmdMcfOvrPlanEffDate(new Date(5678));
        elgEligCareAssign.setCfaCareFacilityId("o");
        elgEligCareAssign.setCquQualifierId("p");
        elgEligCareAssign.setEmdPhysicianIdInd("q");
        elgEligCareAssign.setPrfPrescriberId("r");
        elgEligCareAssign.setPrfPrescriberIdState("s");
        elgEligCareAssign.setAddDate(new Date(4321));
        elgEligCareAssign.setAddTime(new Time(1234));
        elgEligCareAssign.setAddProgramName("t");
        elgEligCareAssign.setAddUserName("u");
        elgEligCareAssign.setChgDate(new Date(8765));
        elgEligCareAssign.setChgTime(new Time(6543));
        elgEligCareAssign.setChgProgramName("v");
        elgEligCareAssign.setChgUserName("w");


        EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = new EligMemberCareAssignDetailForm();
        eligMemberCareAssignDetailForm.setCarCarrierId("a");
        eligMemberCareAssignDetailForm.setAccountId("b");
        eligMemberCareAssignDetailForm.setGroupId("c");
        eligMemberCareAssignDetailForm.setCarCarrierId("d");
        eligMemberCareAssignDetailForm.setAccountId("e");
        eligMemberCareAssignDetailForm.setGroupId("f");
        eligMemberCareAssignDetailForm.setEmdCareEffDate(DateUtils.convertUtilDateTODateType(new Date(5487)));
        eligMemberCareAssignDetailForm.setEmdCareEffDateInd("g");
        eligMemberCareAssignDetailForm.setEmdCareThruDateInd("h");
        eligMemberCareAssignDetailForm.setEmdCareThruDate(DateUtils.convertUtilDateTODateType(new Date(1234)));
        eligMemberCareAssignDetailForm.setEmdCareFacilityInd("i");
        eligMemberCareAssignDetailForm.setEmdNetworkInd("j");
        eligMemberCareAssignDetailForm.setEmdQualifierInd("k");
        eligMemberCareAssignDetailForm.setCnwNetworkID("l");
        eligMemberCareAssignDetailForm.setEmdMCFOvrPlanInd("m");
        eligMemberCareAssignDetailForm.setEmdMCFOvrPlanCode("n");
        eligMemberCareAssignDetailForm.setEmdMCFOvrPlanEffDate(DateUtils.convertUtilDateTODateType(new Date(5678)));
        eligMemberCareAssignDetailForm.setCfaCareFacilityID("o");
        eligMemberCareAssignDetailForm.setCquQualifierID("p");
        eligMemberCareAssignDetailForm.setEmdPhysicianIDInd("q");
        eligMemberCareAssignDetailForm.setPrfPrescriberID("r");
        eligMemberCareAssignDetailForm.setPrfPrescriberIDState("s");
        eligMemberCareAssignDetailForm.setAddDate(DateUtils.convertDateToString(new Date(4321)));
        eligMemberCareAssignDetailForm.setAddTime(new Time(1234).toString());
        eligMemberCareAssignDetailForm.setAddProgramName("t");
        eligMemberCareAssignDetailForm.setAddUserName("u");
        eligMemberCareAssignDetailForm.setChgDate(DateUtils.convertDateToString(new Date(8765)));
        eligMemberCareAssignDetailForm.setChgTime(new Time(6543).toString());
        eligMemberCareAssignDetailForm.setChgProgramName("v");
        eligMemberCareAssignDetailForm.setChgUserName("w");

       // assertEquals(eligMemberCareAssignDetailForm.toString(), this.eligProfileMemberServicesImpl.populateCareAssignPojoFromEntity(elgEligCareAssign).toString());
    }

    /*
    @Test
    public void elgEligProfileEpfgetProfileByPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgEligProfileEpf expected = new ElgEligProfileEpf();
        expected.setCarCarrierId(carCarrierId);
        expected.setAccountId(accountId);
        expected.setGroupId(groupId);

        when(eligProfEpfRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId))
            .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileMemberServicesImpl.getProfileByPrimaryKey(carCarrierId, accountId, groupId).toString());

    }
    */

    /*
    @Test
    public void getCareAssignByPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgEligMemberDefaultsEmd expected = new ElgEligMemberDefaultsEmd();

        when(elgMemberDefaultsEmdRepo.findByCarCarrierIdAndAccountIdAndGroupId(anyString(), anyString(), anyString()))
            .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileMemberServicesImpl.getCareAssignByPrimaryKey(carCarrierId, accountId, groupId).toString());
    }
    */

    @Test
    public void careAssignupsertTest() throws Exception {
        ElgEligMemberDefaultsEmd expected = new ElgEligMemberDefaultsEmd();

        when(elgMemberDefaultsEmdRepo.saveAndFlush(expected))
            .thenReturn(expected)
        ;

        assertEquals(expected.toString(), expected.toString());
    }

    @Test
    public void populateCareAssignDetailsByPrimaryKeyTest() throws Exception {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = new EligMemberCareAssignDetailForm();
        eligMemberCareAssignDetailForm.setCarCarrierId("a");
        eligMemberCareAssignDetailForm.setAccountId("b");
        eligMemberCareAssignDetailForm.setGroupId("c");
        eligMemberCareAssignDetailForm.setCarCarrierId("d");
        eligMemberCareAssignDetailForm.setAccountId("e");
        eligMemberCareAssignDetailForm.setGroupId("f");
        eligMemberCareAssignDetailForm.setEmdCareEffDate(DateUtils.convertUtilDateTODateType(new Date(5487)));
        eligMemberCareAssignDetailForm.setEmdCareEffDateInd("g");
        eligMemberCareAssignDetailForm.setEmdCareThruDateInd("h");
        eligMemberCareAssignDetailForm.setEmdCareThruDate(DateUtils.convertUtilDateTODateType(new Date(1234)));
        eligMemberCareAssignDetailForm.setEmdCareFacilityInd("i");
        eligMemberCareAssignDetailForm.setEmdNetworkInd("j");
        eligMemberCareAssignDetailForm.setEmdQualifierInd("k");
        eligMemberCareAssignDetailForm.setCnwNetworkID("l");
        eligMemberCareAssignDetailForm.setEmdMCFOvrPlanInd("m");
        eligMemberCareAssignDetailForm.setEmdMCFOvrPlanCode("n");
        eligMemberCareAssignDetailForm.setEmdMCFOvrPlanEffDate(DateUtils.convertUtilDateTODateType(new Date(5678)));
        eligMemberCareAssignDetailForm.setCfaCareFacilityID("o");
        eligMemberCareAssignDetailForm.setCquQualifierID("p");
        eligMemberCareAssignDetailForm.setEmdPhysicianIDInd("q");
        eligMemberCareAssignDetailForm.setPrfPrescriberID("r");
        eligMemberCareAssignDetailForm.setPrfPrescriberIDState("s");
        eligMemberCareAssignDetailForm.setAddDate(DateUtils.convertDateToString(new Date(4321)));
        eligMemberCareAssignDetailForm.setAddTime(new Time(1234).toString());
        eligMemberCareAssignDetailForm.setAddProgramName("t");
        eligMemberCareAssignDetailForm.setAddUserName("u");
        eligMemberCareAssignDetailForm.setChgDate(DateUtils.convertDateToString(new Date(8765)));
        eligMemberCareAssignDetailForm.setChgTime(new Time(6543).toString());
        eligMemberCareAssignDetailForm.setChgProgramName("v");
        eligMemberCareAssignDetailForm.setChgUserName("w");

        ElgEligMemberDefaultsEmd elgEligCareAssign = new ElgEligMemberDefaultsEmd();

        elgEligCareAssign.setCarCarrierId("a");
        elgEligCareAssign.setAccountId("b");
        elgEligCareAssign.setGroupId("c");
        elgEligCareAssign.setCarCarrierId("d") ;
        elgEligCareAssign.setAccountId("e");
        elgEligCareAssign.setGroupId("f");
        elgEligCareAssign.setEmdCareEffDateInd("g");
        elgEligCareAssign.setEmdCareEffDate(new Date(5487));
        elgEligCareAssign.setEmdCareThruDateInd("h");
        elgEligCareAssign.setEmdCareThruDate(new Date(1234));
        elgEligCareAssign.setEmdCareFacilityInd("i") ;
        elgEligCareAssign.setEmdNetworkInd("j");
        elgEligCareAssign.setEmdQualifierInd("k");
        elgEligCareAssign.setCnwNetworkId("l");
        elgEligCareAssign.setEmdMcfOvrPlanInd("m");
        elgEligCareAssign.setEmdMcfOvrPlanCode("n");
        elgEligCareAssign.setEmdMcfOvrPlanEffDate(new Date(5678));
        elgEligCareAssign.setCfaCareFacilityId("o");
        elgEligCareAssign.setCquQualifierId("p");
        elgEligCareAssign.setEmdPhysicianIdInd("q");
        elgEligCareAssign.setPrfPrescriberId("r");
        elgEligCareAssign.setPrfPrescriberIdState("s");
        elgEligCareAssign.setAddDate(new Date(4321));
        elgEligCareAssign.setAddTime(new Time(1234));
        elgEligCareAssign.setAddProgramName("t");
        elgEligCareAssign.setAddUserName("u");
        elgEligCareAssign.setChgDate(new Date(8765));
        elgEligCareAssign.setChgTime(new Time(6543));
        elgEligCareAssign.setChgProgramName("v");
        elgEligCareAssign.setChgUserName("w");


        when(elgMemberDefaultsEmdRepo.findByCarCarrierIdAndAccountIdAndGroupId(anyString(), anyString(), anyString()))
            .thenReturn(elgEligCareAssign)
        ;

        //assertEquals(eligMemberCareAssignDetailForm.toString(), this.eligProfileMemberServicesImpl.populateCareAssignDetailsByPrimaryKey(carCarrierId, accountId, groupId).toString());
    }

}
