package com.ilp04.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp04.entity.Customer;

public class CustomerDAO {
	
	//get connection
	public Connection getConnection()
	{
		String connectionURL ="jdbc:mysql://localhost:3306/bankdb?useSSL=false";
		String userName = "root";
		String password = "experion@123";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionURL,userName,password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return connection;
	}
	
	
	//close connection
	
	public Connection closeConnection(Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;
	}
	
	//get all customer details
	
	public ArrayList<Customer> getAllCustomers(Connection connection) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		try {
			
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from customer");
		while(resultSet.next())
		{
			int customerCode = resultSet.getInt(1);
			String customerFirstName = resultSet.getString(2);
			String customerLastName = resultSet.getString(3);
			String address = resultSet.getString(4);
					long phnNo = resultSet.getLong(5);
					long aadharNo = resultSet.getLong(6);
					Customer customer = new Customer(customerCode, customerFirstName, customerLastName, address, phnNo, aadharNo);
					customerList.add(customer);	
		}
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	return customerList;
		
	}	
	
	
	//get insert info
	
	public void insertIntoCustomer(Connection connection,Customer customer){
		
		String query = "INSERT INTO Customer (customer_firstName, customer_lastName, address, phn_number, aadhar_no) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
           
            preparedStatement.setString(1, customer.getCustomerFirstName());
            preparedStatement.setString(2, customer.getCustomerLastName());
            preparedStatement.setString(3, customer.getAddress());
            preparedStatement.setLong(4, customer.getPhNumber());
            preparedStatement.setLong(5, customer.getAadharNo());
            int rowsInserted = preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        
        }
		
	}	
	
	
	
}
