package com.health.insuranceview.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.insuranceview.contracts.IDAO;
import com.health.insuranceview.contracts.IRepository;
import com.health.insuranceview.models.Faq;
import com.health.insuranceview.models.InsurancePolicy;

@Repository
public class RepositoryImpl implements IRepository {
	
	@Autowired
	IDAO idao;

	@Override
	public List<InsurancePolicy> getAllInsurancePolicies() {
		// TODO Auto-generated method stub
		return idao.getAllInsurancePolicies();
	}
	

	@Override
	public List<Faq> getAllFAQS() {
		// TODO Auto-generated method stub
		return idao.getAllFAQS();
	}

}
