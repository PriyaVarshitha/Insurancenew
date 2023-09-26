package com.health.insuranceview.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.health.insuranceview.contracts.IDAO;
import com.health.insuranceview.models.Customer;
import com.health.insuranceview.models.Faq;
import com.health.insuranceview.models.InsurancePackages;
import com.health.insuranceview.models.InsurancePolicy;
import com.health.insuranceview.rowmappers.InsurancePolicyRowMapper;
import com.health.insuranceview.rowmappers.FaqRowMapper;
import com.health.insuranceview.rowmappers.InsurancePackagesRowMapper;
import com.health.insuranceview.rowmappers.CustomerRowMapper;

@Component
public class DaoImpl implements IDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private String SQL_GET_INSURANCEPOLICIES = "select * from  InsurancePolicy";
	
	private String SQL_GET_CUSTID_INSURANCEPOLICY = "select * from  InsurancePolicy where iplc_cust_id=?";
		
	private String SQL_GET_FAQS = "select * from FAQS";
	
	private String SQL_GET_INSURANCEPACKAGES = "select * from  InsurancePackages";
	
	private String SQL_GET_CUSTOMERDETAILS = "select * from InsuranceCustomers";


	
	@Override
	public List<InsurancePolicy> getAllInsurancePolicies() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_INSURANCEPOLICIES, new InsurancePolicyRowMapper());
	}

	@Override
	public List<Faq> getAllFAQS() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_FAQS, new FaqRowMapper());
	}

	@Override
	public List<InsurancePolicy> getCustomerInsurancePolicy() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_CUSTID_INSURANCEPOLICY, new InsurancePolicyRowMapper());
	}

	@Override
	public List<InsurancePackages> getInsurancePackages() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_INSURANCEPACKAGES, new InsurancePackagesRowMapper());
	}
     
	@Override
	public List<Customer> getCustomerDetails() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_CUSTOMERDETAILS, new CustomerRowMapper());
	}
}
