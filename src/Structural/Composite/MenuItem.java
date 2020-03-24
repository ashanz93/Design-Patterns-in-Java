package Structural.Composite;

public class MenuItem extends MenuComponent {
	
	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return print(this);
	}

}
