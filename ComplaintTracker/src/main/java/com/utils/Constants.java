package com.utils;

public class Constants {
	
	public static final String URL="jdbc:mysql://localhost:3306/complaint_tracker";
	public static final String USERNAME="root";
	public static final String PASSWORD="admin";
	
	public static final String INSERT_USER="insert into residents values(?,?)";
	public static final String GET_USER="select * from residents where email=?";
	
	public static final String INSERT_ADMIN="insert into admin values(?,?)";
	public static final String GET_ADMIN="select * from admin where email=?";
	public static final String ADMIN_UPDATE_COMPLAINT="update complaints set complaintstatus=? where complaintId=?";
	
	public static final String GET_ALL_COMPLAINTS="select complaintId,userName,email,flatNo,complaintstatus,complaint,phoneNumber from complaints";
	public static final String GET_USERCOMPLAINTS="select * from complaints where email=?";
	public static final String SAVE_COMPLAINT="insert into complaints(userName,email,flatNo,complaintstatus,complaint,phoneNumber) values(?,?,?,?,?,?)";
	public static final String DELETE_COMPLAINT="delete from complaints where complaintId=?";
	public static final String UPDATE_COMPLAINT="update complaints set userName=?,flatNo=?,complaint=?,phoneNumber=? where complaintId=?";
	public static final String GET_COMPLAINT="select * from complaints where complaintId=?";
<<<<<<< HEAD
	public static final String GET_COMPLAINTS_HISTORY="select * from complaints where complaintstatus='resolved'";
=======
	public static final String GET_COMPLAINTS_HISTORY="select * from complaints where  email=? and complaintstatus='resolved'";
>>>>>>> 8a58fe5 (added changes)
}
