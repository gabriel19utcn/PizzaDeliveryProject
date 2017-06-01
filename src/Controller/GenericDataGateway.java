package Controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GenericDataGateway {






	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/restaurant";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "1234";

	   
	   public static Connection getConnection() {
	   Connection conn = null;
	  // Statement stmt = null;
 
	
	   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);


		      if(conn!= null){
		    	  
		    	  System.out.println("Conexiunea s-a realizat");
		    	  
		    	  
		      }
		      
		      else
		    	   System.out.println("Conexiunea nu s-a realizat");
		      
		    	  		    	  
	   
	   
	   } catch(SQLException | ClassNotFoundException se){
		   
		   se.printStackTrace();
		   
	   }
	   return conn;
	   } 
	   
	   
	   
	   
	   
	   
	  
}