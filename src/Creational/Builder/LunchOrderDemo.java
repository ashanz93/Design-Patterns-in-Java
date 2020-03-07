package Creational.Builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Italian").dressing("Mayonnaise").meat("Ham");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}

}
