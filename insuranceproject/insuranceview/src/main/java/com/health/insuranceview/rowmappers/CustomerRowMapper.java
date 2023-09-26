package com.health.insuranceview.rowmappers;
	
	import org.springframework.jdbc.core.RowMapper;

import com.health.insuranceview.models.Customer;

import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	public class CustomerRowMapper implements RowMapper<Customer> {

	    @Override
	    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Customer customer = new Customer();

	        customer.setCustId(rs.getInt("cust_id"));
	        customer.setCustFirstName(rs.getString("cust_fname"));
	        customer.setCustLastName(rs.getString("cust_lname"));
	        
	        // Parsing date fields from the result set
	        try {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the date format as per your database
	            java.util.Date dob = dateFormat.parse(rs.getString("cust_dob"));
	            java.util.Date createDate = dateFormat.parse(rs.getString("cust_cdate"));
	            java.util.Date luuDate = dateFormat.parse(rs.getString("cust_luudate"));

	            customer.setCustDateOfBirth(dob);
	            customer.setCustCreateDate(createDate);
	            customer.setCustLastUpdateDate(luuDate);
	        } catch (ParseException e) {
	            // Handle date parsing exception
	            e.printStackTrace();
	        }

	        customer.setCustAddress(rs.getString("cust_address"));
	        customer.setCustGender(rs.getString("cust_gender"));
	        customer.setCustAadhar(rs.getString("cust_aadhar"));
	        customer.setCustStatus(rs.getString("cust_status"));
	        customer.setCustLastUpdateUser(rs.getString("cust_luuser"));

	        return customer;
	    }
	}


