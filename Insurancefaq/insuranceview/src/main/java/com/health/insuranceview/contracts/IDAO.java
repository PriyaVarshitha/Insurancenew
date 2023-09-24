package com.health.insuranceview.contracts;

import java.util.List;

import com.health.insuranceview.models.Faq;
import com.health.insuranceview.models.InsurancePolicy;

public interface IDAO {

	List<InsurancePolicy> getAllInsurancePolicies();
	
	List<Faq> getAllFAQS();
	
	

}