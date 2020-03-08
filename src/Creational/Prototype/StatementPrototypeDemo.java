package Creational.Prototype;

import java.util.*;

public class StatementPrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from movies where title = ?";
		
		List<String> parameters = new ArrayList<>();
		parameters.add("Star Wars");
		
		Record record = new Record();
		
		Statement st1 = new Statement(sql, parameters, record);
		
		System.out.println(st1.getSql());
		
		System.out.println(st1.getParameters());
		
		System.out.println(st1.getRecord());
		
		Statement st2 = st1.clone();
		
		System.out.println(st2.getSql());
		
		System.out.println(st2.getParameters());
		
		System.out.println(st2.getRecord());
	}

}
