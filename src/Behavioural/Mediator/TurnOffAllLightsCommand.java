package Behavioural.Mediator;

public class TurnOffAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		med.turnOffAllLights();
	}

}
