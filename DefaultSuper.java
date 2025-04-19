class A {
	A(int x) {
		System.out.println("A's constructor");
	}
}

class B extends A {
	B() {
		//No super () written here, Java inserts it aautomatically
		System.out.println("B's constructor");
	}
}
public class DefaultSuper {
	public static void main(String[] args) {
		B b1 = new B(); //constructor called here
	}
}