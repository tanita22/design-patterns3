
public class WaitingState implements State {
Employee employee;
public WaitingState(Employee employee) {
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
