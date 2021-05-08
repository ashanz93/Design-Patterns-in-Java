package Behavioural.Mediator;

import java.text.MessageFormat;

// Receiver
public class Light {
	private boolean isOn = false;
	
	private String location = "";
	
	public Light(String location) {
		this.location = location;
	}
	public boolean isOn() {
		return isOn;
	}
	// Maintain state
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println(MessageFormat.format("{0} Light switched on", location));
	}
	public void off() {
		System.out.println(MessageFormat.format("{0} Light switched off", location));
	}
}
