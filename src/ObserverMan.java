import java.util.ArrayList;
import java.util.List;

public  class ObserverMan implements Observer {
	private String name;

	public ObserverMan(String name) {
		this.name=name;
	}

	public void update() {

		System.out.println(this.name + " gets the shipment and bringing it to storage.");
	}
}
