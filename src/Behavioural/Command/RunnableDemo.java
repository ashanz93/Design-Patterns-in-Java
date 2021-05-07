package Behavioural.Command;

public class RunnableDemo {

	public static void main(String[] args) {
		Task task = new Task(10, 11);
		Thread thread = new Thread(task);
		thread.start(); // invoker
	}

}
