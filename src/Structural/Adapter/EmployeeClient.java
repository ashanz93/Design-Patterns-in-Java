package Structural.Adapter;

import java.util.*;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john.wick@abc.com");
		
		employees.add(employeeFromDB);
		
		// Adapter
		EmployeeLdap employeeFromLdap = new EmployeeLdap("4567", "ash", "h", "ash.h@abc.com");
		
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("4568, ash, ha, ash.ha@abc.com");
		
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
	}
}
