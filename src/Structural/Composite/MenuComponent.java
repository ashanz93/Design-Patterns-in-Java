package Structural.Composite;

import java.util.*;

public abstract class MenuComponent {
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
	
	public abstract String toString();
	
	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
	public MenuComponent add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	public MenuComponent remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
}
