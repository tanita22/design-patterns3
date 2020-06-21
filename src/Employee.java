import java.util.ArrayList;
import java.util.List;

public abstract  class Employee extends Observable{

	protected State preparationState;
	protected State waitingState;
	protected State counterState;
	
	protected Employee inheritor;
	
	public Employee()
	{
		waitingState=new WaitingState(this);
		preparationState=new PreparationState(this);
		counterState=waitingState;
		
	}
	protected int level;
	protected Employee nextEmployeePayDesk;
	
	private List<Observer> observers=new ArrayList<>();
	private State state;
	
	public void setInheritor(Employee inheritor) {
		this.inheritor=inheritor;
	}
	
	public void setNextEmployeePayDesk(State state) {
		counterState=state;
	}
	public void receiveShipment(String shipment, int level) {
		if(this.level<=level) {
			this.sendShipment(shipment);
			return;
		}
		if(this.nextEmployeePayDesk!=null) {
			this.nextEmployeePayDesk.receiveShipment(shipment, level);
		}
	}
	protected abstract void sendShipment(String shipmentDestination);
	public void setPreparation() {
		counterState.shipmentPreparation();
	}
	public void setWaiting() {
		counterState.waitingForCustomer();
	}
	public State getWaiting()
	{
		return waitingState;
	}
public State getPreparation() {
	return preparationState;
}
}

