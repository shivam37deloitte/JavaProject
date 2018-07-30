package com.deloitte.daos;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	
	public class UserDAO implements Dao<User> {
		static Connection connection = null;
		static PreparedStatement ps = null;
		
		static {
			try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				
				
			}catch (SQLException e) {
					e.printStackTrace();
			
					}

		private void getConnection() {
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "shivam", "abc");
			
		}
		@Override
		public User get(long id) {
			
			return null;
		}

		@Override
		public List<User> getAll() {
			ArrayList<User> users=null;
			ResultSet rs= null;
			ps=connection.prepareStatement("SELECT * FROM USERID");
			rs=ps.executeQuery();
			users=new ArrayList<User>();
			while(rs.next()) {
				users.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
			return users;
		}

		@Override
		public void save(User user) {
			
			
			//Load or register a JDBC driver
			try {
				//Establish a connection
				createConnection();
				ps=connection.prepareStatement("SELECT * FROM USERID");
				//Execute query
				ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
				ps.setInt(1,user.getId());
				ps.setString(2, user.getUserName());
				ps.setString(3, user.getFirstName());
				ps.setString(4, user.getLastName());
				ps.setString(5, user.getPasswd());
				ps.setString(6, user.getStatus());
				
				ps.executeUpdate();
				
				
				
		
			
			}finally {
				releaseResource();
				
			}
			
			
		}

		@Override
		public void update(User t, String[] params) {
			
		}

	

		@Override
		public void delete(User user) {
			
		}


		

		
	

		private static void createConnection() {
			// TODO Auto-generated method stub
			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "shivam", "abc");
			
		
		private static void releaseResource() {
			// TODO Auto-generated method stub
			try {
				if(ps!=null && !ps.isClosed()) {
				ps.close();}
				if(connection!= null && !connection.isClosed()) {
				connection.close();}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
			
		}
	}
	


