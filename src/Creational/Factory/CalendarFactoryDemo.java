package Creational.Factory;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar cal = Calendar.getInstance() -> Default timezone
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
