package com.health.insuranceview.rowmappers;
	
	import org.springframework.jdbc.core.RowMapper;

import com.health.insuranceview.models.Faq;

import java.sql.ResultSet;
	import java.sql.SQLException;

	public class FaqRowMapper implements RowMapper<Faq> {

	    @Override
	    public Faq mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Faq faq = new Faq();
	        faq.setId(rs.getLong("id"));
	        faq.setQuestion(rs.getString("question"));
	        faq.setAnswer(rs.getString("answer"));
	        return faq;
	    }
	}
