interface Vehicle {
	void start();
	
	default void honk() {
		System.out.println("Honking...");
	}
}

class Car implements Vehicle {
	public void start() {
		System.out.println("Car starting....");
	}
}

public class defaultMethodTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.honk();
	}
}