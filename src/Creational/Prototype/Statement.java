package Creational.Prototype;

import java.util.List;

public class Statement implements Cloneable {
	private String sql;
	private List<String> parameters;
	private Record record;
	
	public Statement(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public String getSql() {
		return sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}
	
	// PreparedStatements are compiled against Database. Clone helps avoid costly creation
	public Statement clone() {
		try {
			// Shallow copy
			return (Statement)super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
