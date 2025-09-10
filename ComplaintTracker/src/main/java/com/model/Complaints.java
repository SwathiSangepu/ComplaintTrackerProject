package com.model;

public class Complaints {

	
	private int complaintId;
	private String userName;
	private String email;
	private int flatNo;
	private String complaintStatus;
	private String complaint;
	private String phoneNumber;
	
	public Complaints() {
		super();
	}

	
	
	public Complaints(int complaintId,String userName, int flatNo, String complaint, String phoneNumber) {
		super();
		this.complaintId=complaintId;
		this.userName = userName;
		this.flatNo = flatNo;
		this.complaint = complaint;
		this.phoneNumber = phoneNumber;
	}



	public Complaints(String userName, String email,int flatNo, String complaintStatus, String complaint, String phoneNumber) {
		super();
		this.userName = userName;
		this.email=email;
		this.flatNo = flatNo;
		this.complaintStatus = complaintStatus;
		this.complaint = complaint;
		this.phoneNumber = phoneNumber;
	}



	public Complaints(int complaintId, String userName, String email, int flatNo, String complaintStatus,
			String complaint, String phoneNumber) {
		super();
		this.complaintId = complaintId;
		this.userName = userName;
		this.email = email;
		this.flatNo = flatNo;
		this.complaintStatus = complaintStatus;
		this.complaint = complaint;
		this.phoneNumber = phoneNumber;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", userName=" + userName + ", email=" + email + ", flatNo="
				+ flatNo + ", complaintStatus=" + complaintStatus + ", complaint=" + complaint + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	
	
}
