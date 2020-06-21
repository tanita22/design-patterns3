
public class Main {
	 public static void main(String[] args) throws InterruptedException {

	        Employee city = new CityDestination();
	        Employee country = new CountryDestination();
	        Employee international = new InternationalDestination();
	        Observer man = new ObserverMan("Gosho");

	        city.subscribe(man);
	        country.subscribe(man);
	        international.subscribe(man);

	        city.setInheritor(country);
	        country.setInheritor(international);

	        country.sendShipment("International");

	        city.unsubscribe(man);
	        country.unsubscribe(man);
	        international.unsubscribe(man);
	    }
}
