
public class CountryDestination  extends Employee{
	@Override
	public void sendShipment(String shipmentDestination) {
		if(shipmentDestination.equals("Country")) {
			System.out.println("Welcome, i am responsible for country deliveries!");
			this.setPreparation();
			notifyObservers();
		}
		else if(inheritor!=null){
			inheritor.sendShipment(shipmentDestination);
			this.setWaiting();
		}
		
	}

}
