public class CityDestination extends Employee {

	@Override
	public void sendShipment(String shipmentDestination) {
		if(shipmentDestination.equals("City")) {
			System.out.println("Welcome, i am responsible for city deliveries!");
			this.setPreparation();
			notifyObservers();
		}
		else {
			System.out.println("I can't help you. I am not responsible for these shipments destinations.");
			this.setWaiting();
		}
		
	}

}
