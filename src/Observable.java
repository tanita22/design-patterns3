import java.util.ArrayList;
import java.util.List;

public class Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	private String name;

	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}

	public void subscribe(Observer observer) {
		this.observers.add(observer);
		//observer.setTopic(this);
	}


	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	public void notifyObservers() {
		for(Observer observer: this.observers) {
		observer.update();
		}
	}


	public String getUpdate() {
		return this.name;
	}
}
