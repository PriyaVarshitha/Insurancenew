package com.health.insuranceview.models;

	import java.util.Date; // Import Date class for cust_dob and cust_cdate

	public class Customer {
	    private int custId; // cust_id
	    private String custFirstName; // cust_fname
	    private String custLastName; // cust_lname
	    private Date custDateOfBirth; // cust_dob
	    private String custAddress; // cust_address
	    private String custGender; // cust_gender
	    private Date custCreateDate; // cust_cdate
	    private String custAadhar; // cust_aadhar
	    private String custStatus; // cust_status
	    private Date custLastUpdateDate; // cust_luudate
	    private String custLastUpdateUser; // cust_luuser

	    // Constructors, getters, and setters

	    public Customer() {
	        // Default constructor
	    }

	    public Customer(int custId, String custFirstName, String custLastName, Date custDateOfBirth, String custAddress,
	                    String custGender, Date custCreateDate, String custAadhar, String custStatus,
	                    Date custLastUpdateDate, String custLastUpdateUser) {
	        this.custId = custId;
	        this.custFirstName = custFirstName;
	        this.custLastName = custLastName;
	        this.custDateOfBirth = custDateOfBirth;
	        this.custAddress = custAddress;
	        this.custGender = custGender;
	        this.custCreateDate = custCreateDate;
	        this.custAadhar = custAadhar;
	        this.custStatus = custStatus;
	        this.custLastUpdateDate = custLastUpdateDate;
	        this.custLastUpdateUser = custLastUpdateUser;
	    }

	    // Getters and setters for all fields

	    public int getCustId() {
	        return custId;
	    }

	    public void setCustId(int custId) {
	        this.custId = custId;
	    }

	    public String getCustFirstName() {
	        return custFirstName;
	    }

	    public void setCustFirstName(String custFirstName) {
	        this.custFirstName = custFirstName;
	    }

	    public String getCustLastName() {
	        return custLastName;
	    }

	    public void setCustLastName(String custLastName) {
	        this.custLastName = custLastName;
	    }

	    public Date getCustDateOfBirth() {
	        return custDateOfBirth;
	    }

	    public void setCustDateOfBirth(Date custDateOfBirth) {
	        this.custDateOfBirth = custDateOfBirth;
	    }

	    public String getCustAddress() {
	        return custAddress;
	    }

	    public void setCustAddress(String custAddress) {
	        this.custAddress = custAddress;
	    }

	    public String getCustGender() {
	        return custGender;
	    }

	    public void setCustGender(String custGender) {
	        this.custGender = custGender;
	    }

	    public Date getCustCreateDate() {
	        return custCreateDate;
	    }

	    public void setCustCreateDate(Date custCreateDate) {
	        this.custCreateDate = custCreateDate;
	    }

	    public String getCustAadhar() {
	        return custAadhar;
	    }

	    public void setCustAadhar(String custAadhar) {
	        this.custAadhar = custAadhar;
	    }

	    public String getCustStatus() {
	        return custStatus;
	    }

	    public void setCustStatus(String custStatus) {
	        this.custStatus = custStatus;
	    }

	    public Date getCustLastUpdateDate() {
	        return custLastUpdateDate;
	    }

	    public void setCustLastUpdateDate(Date custLastUpdateDate) {
	        this.custLastUpdateDate = custLastUpdateDate;
	    }

	    public String getCustLastUpdateUser() {
	        return custLastUpdateUser;
	    }

	    public void setCustLastUpdateUser(String custLastUpdateUser) {
	        this.custLastUpdateUser = custLastUpdateUser;
	    }
	}

