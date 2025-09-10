package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Complaints;
import com.utils.Constants;
import com.utils.DBConnection;

public class ComplaintsDao {
	
	public boolean saveComplaint(Complaints c) {
		boolean success=false;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SAVE_COMPLAINT);
			statement.setString(1, c.getUserName());
			statement.setString(2, c.getEmail());
			statement.setInt(3,c.getFlatNo());
			statement.setString(4, c.getComplaintStatus());;
			statement.setString(5, c.getComplaint());
			statement.setString(6, c.getPhoneNumber());
			int row=statement.executeUpdate();
			if(row>0) success=true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return success;
	}
	
	public List<Complaints> getUserComplaints(String email) {
		List<Complaints> lists=new ArrayList<>();
		try {
			Connection connection=DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_USERCOMPLAINTS);
			statement.setString(1,email);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name = rs.getString(2);
			//	String e = rs.getString(3);
				int flatNo = rs.getInt(4);
				String status = rs.getString(5);
				String complaint = rs.getString(6);
				String num = rs.getString(7);
				Complaints c=new Complaints(id,name,email,flatNo,status,complaint,num);
				lists.add(c);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return lists;
	}
	
	public Complaints getComplaint(int id) {
		Complaints c=null;
		try {
			Connection connection=DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_COMPLAINT);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				//int id=rs.getInt(1);
				String name = rs.getString(2);
				String e = rs.getString(3);
				int flatNo = rs.getInt(4);
				String status = rs.getString(5);
				String complaint = rs.getString(6);
				String num = rs.getString(7);
				c=new Complaints(id,name,e,flatNo,status,complaint,num);	
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void updateComplaint(Complaints c) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_COMPLAINT);
			statement.setString(1, c.getUserName());
			statement.setInt(2,c.getFlatNo());
			statement.setString(3,c.getComplaint());
			statement.setString(4, c.getPhoneNumber());
			statement.setInt(5, c.getComplaintId());
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteComplaint(int id) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETE_COMPLAINT);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Complaints> getAllComplaints(){
		List<Complaints> list=new ArrayList<>();
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_ALL_COMPLAINTS);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				int no=rs.getInt(4);
				String status=rs.getString(5);
				String complaint=rs.getString(6);
				String mobNum=rs.getString(7);
				Complaints c=new Complaints(id,name,email,no,status,complaint,mobNum);
				list.add(c);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Complaints> getUserComplaintsHistory(){
		List<Complaints> list=new ArrayList<>();
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_COMPLAINTS_HISTORY);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name = rs.getString(2);
				String e = rs.getString(3);
				int flatNo = rs.getInt(4);
				String status = rs.getString(5);
				String complaint = rs.getString(6);
				String num = rs.getString(7);
				Complaints c=new Complaints(id,name,e,flatNo,status,complaint,num);
				list.add(c);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
}
