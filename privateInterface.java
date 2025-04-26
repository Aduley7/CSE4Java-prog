interface Greeting {
	private void log(String message) {
		System.out.println("LOG: " + message);
	}
	
	default void sayHello() {
		log("HELLO");
	}
	
	default void sayGoodbye() {
		log("Goodbye");
	}
}

class Greeter implements Greeting {
}

public class privateInterface {
	public static void main(String[] args) {
		Greeter g = new Greeter();
		g.sayHello();
		g.sayGoodbye();
	}
}