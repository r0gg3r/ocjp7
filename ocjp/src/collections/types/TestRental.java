package collections.types;

import java.util.ArrayList;
import java.util.List;

public class TestRental {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		List<Car> carList = new ArrayList<>();
		carList.add(car1);
		carList.add(car2);
		RentalGeneric<Car> carRental = new RentalGeneric<Car>(2, carList);

		Car cartoRent = carRental.getRental();
		carRental.returnRental(cartoRent);

		for (Car car : carList) {
			System.out.println(" car " + car);

		}

	}
}

class Car {

}