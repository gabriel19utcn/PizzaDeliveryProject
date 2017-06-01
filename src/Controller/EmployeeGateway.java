package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Model.Employee;

public class EmployeeGateway {
		
Connection conn = GenericDataGateway.getConnection();
	
	
	public boolean create (Employee employee ){
		
		Statement stm = null;
		boolean resultCode = false;
		try{
			stm = conn.createStatement();
			String sql = "INSERT INTO employee VALUES (" + employee.getId() + "," + "'" +
					 employee.getName() + "'" + "," + "'" + employee.getUsername() + "'" + ","+ "'"+employee.getPassword() + "'"+ ","+
					employee.getIsAdmin() + ")" ;
			stm.executeUpdate(sql);
			resultCode = true;
			System.out.println("Create succesfull");
			
			stm.close();
			
			
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return resultCode;

	}
		
	public boolean update (Employee employee){
		
		Statement stm = null;
	boolean resultCode = false;
	try{
		stm = conn.createStatement();
		String sql = "UPDATE employee SET name = " + "'" + employee.getName() + "'" + " ,username =  " + "'" + employee.getUsername()+"'" + ",password =" +
		"'" + employee.getPassword() + "'" + ",isAdmin=" + employee.getIsAdmin() + " WHERE idemployee =" + employee.getId() ;
		
		
				
		stm.executeUpdate(sql);
		resultCode = true;
		System.out.println("Update succesfull");
		
		stm.close();
		
		
	}catch(SQLException e){
		
		e.printStackTrace();
	}
	return resultCode;

}
	
	public boolean delete (Employee employee){		
	
		Statement stm = null;
		boolean resultCode = false;
		try{
			stm = conn.createStatement();
			String sql = "DELETE FROM employee WHERE idemployee = " + employee.getId() ;
			
					
			stm.executeUpdate(sql);
			resultCode = true;
			System.out.println("Delete succesfull");
			
			stm.close();
			
			
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return resultCode;

		
	}
	
	public String view (){
		
		Statement stmt = null;
		String queryResult = "";

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employee";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("idemployee");
		         String nam = rs.getString("name");
		         String usr = rs.getString("username");
		         String pas = rs.getString("password");
		         int isad = rs.getInt("isAdmin");
		       
		           
		         queryResult = queryResult + "Id : " + id + " Name : " + nam + " Username : " + usr +
		        		 " Password : " + pas + " Admin: "+ isad + "\n";
		         
		      }
		      rs.close();
		      stmt.close();
				// conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return queryResult;
		
		
		
	}
	
	public Employee find(String username){
		
		Statement stmt = null;
	
		 Employee newEmployee = null;

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employee WHERE username LIKE '" + username + "'";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("idemployee");
		         String nam = rs.getString("name");
		         String usr = rs.getString("username");
		         String pas = rs.getString("password");
		         int isad = rs.getInt("isAdmin");
		       
		         newEmployee = new Employee (id , nam , usr, pas, isad);
		         
		        
		         
		      }
		      rs.close();
		      stmt.close();
				// conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return newEmployee ;
		
		
		
		
	}
	
	
	

}
