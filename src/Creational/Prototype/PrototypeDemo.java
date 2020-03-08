package Creational.Prototype;

public class PrototypeDemo {
	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie movie2 = (Movie) registry.createItem("Movie");
		movie2.setTitle("GoF");
		
		System.out.println(movie2);
		System.out.println(movie2.getRuntime());
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getUrl());
	}
}
