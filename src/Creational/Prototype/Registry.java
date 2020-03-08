package Creational.Prototype;

import java.util.*;

public class Registry {
	private Map<String, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) (items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Superman");
		movie.setPrice(25);
		movie.setRuntime("2 hrs");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumOfPages(335);
		book.setPrice(500);
		book.setTitle("Book1");
		items.put("Book", book);
	}
}
