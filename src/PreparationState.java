
public class PreparationState implements State {
 
	Employee employee;
	public PreparationState(Employee employee) {
		this.employee=employee;
	}
	
	
	@Override
	public void waitingForCustomer() {
		System.out.println("Standing and waiting for customer");
		employee.setNextEmployeePayDesk(employee.getWaiting());
	}
	@Override
	public void shipmentPreparation() {
		System.out.println("Preparing products for shipment...");
		employee.setNextEmployeePayDesk(employee.getPreparation());
	}

}
