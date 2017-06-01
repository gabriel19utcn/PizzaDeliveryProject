package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Model.Order;


public class OrderGateway {

	
Connection conn = GenericDataGateway.getConnection();
	
	
	public boolean plasareComanda (Order order){
		
		Statement stm = null;
		boolean resultCode = false;
		try{
			stm = conn.createStatement();
			String sql = "INSERT INTO restaurant.order VALUES (" + null + "," + "'" + order.getPizza() + "'" + "," + "'"+order.getTip() + "'"+ "," + "'" +order.getNume() + "'" + "," + order.getNrtel() + "," + "'" + order.getAdresa() + "'" + "," + order.getPret() +")";       
			stm.executeUpdate(sql);
			resultCode = true;
			System.out.println("Comanda Inregistrata");
			
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
			String sql = "SELECT * FROM restaurant.order";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         String pizz = rs.getString("pizza");
		         String tip = rs.getString("tip");
		         String nume = rs.getString("nume");
		         int nrtel = rs.getInt("nrtel");
		         String adr = rs.getString("adresa");
		         int pret = rs.getInt("pret");
		       
		           
		         queryResult = queryResult + "Id : " + id + " Pizza : " + pizz + " Tip : " + tip + " Nume : " + nume +
		        		 " NrTel : " + nrtel + " Adresa: "+ adr +  " Pret: "+ pret +  "\n";
		         
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
	
	public Order find(String nume){
		
		Statement stmt = null;
		
		 Order ord = null;

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM restaurant.order WHERE nume = " +  "'" + nume + "'";
			System.out.println(nume);
			
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	
		    	  int id  = rs.getInt("id");
			         String pizz = rs.getString("pizza");
			         String tip = rs.getString("tip");
			         String num = rs.getString("nume");
			         int nrtel = rs.getInt("nrtel");
			         String adr = rs.getString("adresa");
			         int pret = rs.getInt("pret");
		    	  			        	       
		         ord = new Order(id,pizz,tip,num,nrtel,adr,pret);
		         
		         System.out.println(nume);
		         
		      }
		      rs.close();
		      stmt.close();
				// conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return ord;			
	}
	
	public List<Order> findAll(String nume) {
		List<Order> orderList = new ArrayList<Order>();
		
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM restaurant.order WHERE nume = " +  "'" + nume + "'";
			System.out.println(nume);
			
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	
		    	  int id  = rs.getInt("id");
			         String pizz = rs.getString("pizza");
			         String tip = rs.getString("tip");
			         String num = rs.getString("nume");
			         int nrtel = rs.getInt("nrtel");
			         String adr = rs.getString("adresa");
			         int pret = rs.getInt("pret");
		    	  			        	       
		         Order ord = new Order(id,pizz,tip,num,nrtel,adr,pret);
		         orderList.add(ord);
		         
		         System.out.println(nume);
		         
		      }
		      rs.close();
		      stmt.close();
				// conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return orderList;		
	}
	
	
}
