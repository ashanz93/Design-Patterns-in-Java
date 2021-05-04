package Structural.Facade;

import java.util.List;

public class JdbcFacadeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcFacade jdbcFacade = new JdbcFacade();
		
		jdbcFacade.createTable();
		
		System.out.println("Table created.");
		
		jdbcFacade.insertIntoTable();
		
		System.out.println("Record inserted.");
		
		List<Address> addresses = jdbcFacade.getAddresses();
		
		for (Address address : addresses) {
			System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
		}
	}

}
