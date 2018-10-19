package com.optum.rxclaimnextgen.elg.services;

import com.optum.ibm.entities.ObjectStatistics;
import com.optum.ibm.entities.Sysschemas;
import com.optum.ibm.entities.Systables;
import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.*;
import com.optum.rxclaimnextgen.elg.projections.*;

import java.io.IOException;
import java.util.List;


public interface NonEligAPIServices {

	public String callNonEligDataService(String platformId, String api) throws Exception;
}
