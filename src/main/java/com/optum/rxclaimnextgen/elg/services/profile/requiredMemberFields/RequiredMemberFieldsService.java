package com.optum.rxclaimnextgen.elg.services.profile.requiredMemberFields;

import com.optum.rxclaimnextgen.elg.projections.ElgRequiredMemberFieldRmfProjection;

import java.util.List;

public interface RequiredMemberFieldsService {
    List<ElgRequiredMemberFieldRmfProjection> findRequiredMemberFieldData();
}
