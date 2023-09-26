package com.health.insuranceview.contracts;

import java.util.List;

import com.health.insuranceview.models.Customer;
import com.health.insuranceview.models.Faq;
import com.health.insuranceview.models.InsurancePackages;
import com.health.insuranceview.models.InsurancePolicy;

public interface IRepository {

	List<InsurancePolicy> getAllInsurancePolicies();

	List<Faq> getAllFAQS();

	List<InsurancePolicy> getCustomerInsurancePolicy();

	List<InsurancePackages> getInsurancePackages();

	List<Customer> getCustomerDetails();


}
