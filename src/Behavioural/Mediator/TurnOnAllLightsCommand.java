package Behavioural.Mediator;

public class TurnOnAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		med.turnOnAllLights();
	}

}
