package Controller;

import Controller.EmployeeGateway;
import Model.Employee;

public class LoginGateway {
	private EmployeeGateway employeeGateway = new EmployeeGateway();
	
	
	
	public boolean checkIfAdmin (String username, String password){
		
		boolean ok = false; 
		Employee employee = employeeGateway.find(username);
		if (employee.getUsername().equals(username)) {
			if (employee.getPassword().equals(password)) {
				if (employee.getIsAdmin() == 1) {
					ok = true;
				} 
			}
		}
		return ok;
		
	}
	
	
 
	
	
}
	
	