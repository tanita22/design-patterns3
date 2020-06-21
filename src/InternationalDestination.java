
public class InternationalDestination  extends Employee{
	
	@Override
	protected void sendShipment(String shipmentDestination)
	{
		if(shipmentDestination.equals("International")) {
			System.out.println("Welcome, i am responsible for international deliveries!");
			this.setPreparation();
			notifyObservers();
		}else {
			System.out.println("I can't help you. I am not responsible for these shipments destinations");
		this.setWaiting();
		}
		
	}
}
