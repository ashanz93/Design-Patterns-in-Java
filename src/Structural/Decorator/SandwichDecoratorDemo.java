package Structural.Decorator;

public class SandwichDecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}

}
