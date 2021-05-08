package Behavioural.Mediator;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	
	private Timer timer;
	private Toolkit toolkit;
	
	public TimerDemo(int seconds) {
		toolkit = Toolkit.getDefaultToolkit();
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithoutBeep(), seconds * 2000);
	}
	
	class RemindTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Time's up");
			toolkit.beep();
		}

	}
	
	class RemindTaskWithoutBeep extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Now time's really up");
			timer.cancel();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("About to schedule task");
		new TimerDemo(3);
		System.out.println("Task scheduled");
	}

}


