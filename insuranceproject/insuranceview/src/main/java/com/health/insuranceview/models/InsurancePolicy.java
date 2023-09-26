package com.health.insuranceview.models;

import java.util.Date;

public class InsurancePolicy {
    private int iplcId;
    private int iplcCustId;
    private Date iplcCDate;
    private double iplcSumAssured;
    private Date iplcApplicableDate;
    private int iplcInspId;
    private double iplcYrlyPremAmount;
    private Date iplcExpDate;
    private int iplcAgntId;

    // Constructor
    public InsurancePolicy() {
        // Default constructor
    }

	public int getIplcId() {
		return iplcId;
	}

	public void setIplcId(int iplcId) {
		this.iplcId = iplcId;
	}

	public int getIplcCustId() {
		return iplcCustId;
	}

	public void setIplcCustId(int iplcCustId) {
		this.iplcCustId = iplcCustId;
	}

	public Date getIplcCDate() {
		return iplcCDate;
	}

	public void setIplcCDate(Date iplcCDate) {
		this.iplcCDate = iplcCDate;
	}

	public double getIplcSumAssured() {
		return iplcSumAssured;
	}

	public void setIplcSumAssured(double iplcSumAssured) {
		this.iplcSumAssured = iplcSumAssured;
	}

	public Date getIplcApplicableDate() {
		return iplcApplicableDate;
	}

	public void setIplcApplicableDate(Date iplcApplicableDate) {
		this.iplcApplicableDate = iplcApplicableDate;
	}

	public int getIplcInspId() {
		return iplcInspId;
	}

	public void setIplcInspId(int iplcInspId) {
		this.iplcInspId = iplcInspId;
	}

	public double getIplcYrlyPremAmount() {
		return iplcYrlyPremAmount;
	}

	public void setIplcYrlyPremAmount(double iplcYrlyPremAmount) {
		this.iplcYrlyPremAmount = iplcYrlyPremAmount;
	}

	public Date getIplcExpDate() {
		return iplcExpDate;
	}

	public void setIplcExpDate(Date iplcExpDate) {
		this.iplcExpDate = iplcExpDate;
	}

	public int getIplcAgntId() {
		return iplcAgntId;
	}

	public void setIplcAgntId(int iplcAgntId) {
		this.iplcAgntId = iplcAgntId;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [iplcId=" + iplcId + ", iplcCustId=" + iplcCustId + ", iplcCDate=" + iplcCDate
				+ ", iplcSumAssured=" + iplcSumAssured + ", iplcApplicableDate=" + iplcApplicableDate + ", iplcInspId="
				+ iplcInspId + ", iplcYrlyPremAmount=" + iplcYrlyPremAmount + ", iplcExpDate=" + iplcExpDate
				+ ", iplcAgntId=" + iplcAgntId + "]";
	}

    // Getters and Setters
    
    
}
