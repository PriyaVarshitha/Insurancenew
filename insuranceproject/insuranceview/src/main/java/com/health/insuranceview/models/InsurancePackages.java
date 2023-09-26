package com.health.insuranceview.models;

public class InsurancePackages {

    private int inspId;
    private String inspTitle;
    private String inspDesc;
    private String inspStatus;
    private double inspRangeStart;
    private double inspRangeEnd;
    private int inspAgeLimitStart;
    private int inspAgeLimitEnd;

   

    public InsurancePackages(int inspId, String inspTitle, String inspDesc, String inspStatus, double inspRangeStart,
			double inspRangeEnd, int inspAgeLimitStart, int inspAgeLimitEnd) {
		super();
		this.inspId = inspId;
		this.inspTitle = inspTitle;
		this.inspDesc = inspDesc;
		this.inspStatus = inspStatus;
		this.inspRangeStart = inspRangeStart;
		this.inspRangeEnd = inspRangeEnd;
		this.inspAgeLimitStart = inspAgeLimitStart;
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}



	public InsurancePackages() {
		// TODO Auto-generated constructor stub
	}



	public int getInspId() {
		return inspId;
	}



	public void setInspId(int inspId) {
		this.inspId = inspId;
	}



	public String getInspTitle() {
		return inspTitle;
	}



	public void setInspTitle(String inspTitle) {
		this.inspTitle = inspTitle;
	}



	public String getInspDesc() {
		return inspDesc;
	}



	public void setInspDesc(String inspDesc) {
		this.inspDesc = inspDesc;
	}



	public String getInspStatus() {
		return inspStatus;
	}



	public void setInspStatus(String inspStatus) {
		this.inspStatus = inspStatus;
	}



	public double getInspRangeStart() {
		return inspRangeStart;
	}



	public void setInspRangeStart(double inspRangeStart) {
		this.inspRangeStart = inspRangeStart;
	}



	public double getInspRangeEnd() {
		return inspRangeEnd;
	}



	public void setInspRangeEnd(double inspRangeEnd) {
		this.inspRangeEnd = inspRangeEnd;
	}



	public int getInspAgeLimitStart() {
		return inspAgeLimitStart;
	}



	public void setInspAgeLimitStart(int inspAgeLimitStart) {
		this.inspAgeLimitStart = inspAgeLimitStart;
	}



	public int getInspAgeLimitEnd() {
		return inspAgeLimitEnd;
	}



	public void setInspAgeLimitEnd(int inspAgeLimitEnd) {
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}



	@Override
	public String toString() {
		return "InsurancePackages [inspId=" + inspId + ", inspTitle=" + inspTitle + ", inspDesc=" + inspDesc
				+ ", inspStatus=" + inspStatus + ", inspRangeStart=" + inspRangeStart + ", inspRangeEnd=" + inspRangeEnd
				+ ", inspAgeLimitStart=" + inspAgeLimitStart + ", inspAgeLimitEnd=" + inspAgeLimitEnd + "]";
	}
}

