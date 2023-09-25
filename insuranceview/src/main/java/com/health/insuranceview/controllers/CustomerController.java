package com.health.insuranceview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import com.health.insuranceview.contracts.IRepository;
import com.health.insuranceview.models.Faq;
import com.health.insuranceview.models.InsurancePackages;
import com.health.insuranceview.models.InsurancePolicy;

@RestController
public class CustomerController {
	@Autowired(required=true)
	IRepository irrp;
	
	@GetMapping(value = "/getAllInsurancePolicies")
    public List<InsurancePolicy> getAllInsurancePolicies(Model model) {
        System.out.println("varshu1");
        List<InsurancePolicy> li = irrp.getAllInsurancePolicies();
        model.addAttribute("list", li);
        System.out.println(li);
        return li;
    }
	
	@GetMapping(value = "/getCustomersInsurancePolicy")
    public List<InsurancePolicy> getCustomerInsurancePolicy(Model model) {
        System.out.println("varshu3");
        List<InsurancePolicy> li = irrp.getCustomerInsurancePolicy();
        model.addAttribute("list", li);
        System.out.println(li);
        return li;
    }
	

	@GetMapping(value = "/getFAQS")
    public List<Faq> getAllFAQS(Model model) {
        System.out.println("varshu2");
        List<Faq> li = irrp.getAllFAQS();
        model.addAttribute("list", li);
        System.out.println(li);
        return li;
    }
	
	@GetMapping(value = "/html")
    public String gethtml(Model model) {
        System.out.println("varshu5");
        return "web";
    }
	


	@GetMapping(value = "/getInsurancePackages")
    public List<InsurancePackages> getInsurancePackages(Model model) {
        System.out.println("varshu4");
        List<InsurancePackages> li = irrp.getInsurancePackages();
        model.addAttribute("list", li);
        System.out.println(li);
        return li;
    }
	
	

}
