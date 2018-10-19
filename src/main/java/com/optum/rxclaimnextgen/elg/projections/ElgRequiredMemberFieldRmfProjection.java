package com.optum.rxclaimnextgen.elg.projections;

import java.util.Date;

public interface ElgRequiredMemberFieldRmfProjection {
    String getPlatformId();

    String getRmfCarrierId();

    String getRmfAccountId();

    String getRmfGroupId();

    Date getAddDate();

    Date getChgDate();

    String getChgUserName();
}
