package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Resident;
import com.utils.Constants;
import com.utils.DBConnection;

public class ResidentDao {
	
	public void saveResident(Resident resident) {
		Connection connection;
		try {
			connection=DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_USER);
			statement.setString(1, resident.getEmail());
			statement.setString(2, resident.getPassword());
			statement.executeUpdate();
		} catch (ClassNotFoundException| SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean validateResident(Resident resident) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_USER);
			statement.setString(1,resident.getEmail());
			ResultSet rs = statement.executeQuery();
			String email=null;
			String password=null;
			while(rs.next()) {
				email=rs.getString(1);
				password=rs.getString(2);
			}
			return (resident.getEmail().equals(email) && resident.getPassword().equals(password));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	return false;
	}

}
