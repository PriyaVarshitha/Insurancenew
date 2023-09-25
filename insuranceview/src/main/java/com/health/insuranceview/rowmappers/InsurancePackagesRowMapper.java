package com.health.insuranceview.rowmappers;

import org.springframework.jdbc.core.RowMapper;

import com.health.insuranceview.models.InsurancePackages;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsurancePackagesRowMapper implements RowMapper<InsurancePackages> {

    @Override
    public InsurancePackages mapRow(ResultSet rs, int rowNum) throws SQLException {
        InsurancePackages insrpackage = new InsurancePackages();
        
        // Map the columns from the ResultSet to the InsurancePackages fields
        insrpackage.setInspId(rs.getInt("insp_id"));
        insrpackage.setInspTitle(rs.getString("insp_title"));
        insrpackage.setInspDesc(rs.getString("insp_desc"));
        insrpackage.setInspStatus(rs.getString("insp_status"));
        insrpackage.setInspRangeStart(rs.getDouble("insp_range_start"));
        insrpackage.setInspRangeEnd(rs.getDouble("insp_range_end"));
        insrpackage.setInspAgeLimitStart(rs.getInt("insp_agelimit_start"));
        insrpackage.setInspAgeLimitEnd(rs.getInt("insp_agelimit_end"));
        
        return insrpackage;
    }
}
