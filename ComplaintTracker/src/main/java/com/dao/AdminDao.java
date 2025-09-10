package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.Admin;
import com.model.Complaints;
import com.utils.Constants;
import com.utils.DBConnection;

public class AdminDao {
	
	public void saveAdmin(Admin admin) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_ADMIN);
			statement.setString(1, admin.getEmail());
			statement.setString(2, admin.getPassword());
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public boolean validateAdmin(Admin admin) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_ADMIN);
			statement.setString(1,admin.getEmail());
			ResultSet rs = statement.executeQuery();
			String email=null;
			String password=null;
			while(rs.next()) {
				email=rs.getString(1);
				password=rs.getString(2);
			}
			return (admin.getEmail().equals(email) && admin.getPassword().equals(password));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	return false;
	}
	
	public void updateComplaint(int id,String status) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.ADMIN_UPDATE_COMPLAINT);
			statement.setString(1, status);
			statement.setInt(2, id);
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
