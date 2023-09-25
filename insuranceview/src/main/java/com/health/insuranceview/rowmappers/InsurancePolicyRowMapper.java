package com.health.insuranceview.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.health.insuranceview.models.InsurancePolicy;

public class InsurancePolicyRowMapper implements RowMapper<InsurancePolicy> {

    @Override
    public InsurancePolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
        InsurancePolicy policy = new InsurancePolicy();
        policy.setIplcId(rs.getInt("iplc_id"));
        policy.setIplcCustId(rs.getInt("iplc_cust_id"));
        policy.setIplcCDate(rs.getDate("iplc_cdate"));
        policy.setIplcSumAssured(rs.getDouble("iplc_sum_assured"));
        policy.setIplcApplicableDate(rs.getDate("iplc_applicable_date"));
        policy.setIplcInspId(rs.getInt("iplc_insp_id"));
        policy.setIplcYrlyPremAmount(rs.getDouble("iplc_yrly_prem_amount"));
        policy.setIplcExpDate(rs.getDate("iplc_expdate"));
        policy.setIplcAgntId(rs.getInt("iplc_agnt_id"));
        return policy;
    }
}

