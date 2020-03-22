package Structural.Adapter;

public class EmployeeAdapterCSV implements Employee {
	
	private EmployeeCSV instance;

	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return Integer.toString(instance.getId());
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getEmailAddress();
	}

}
