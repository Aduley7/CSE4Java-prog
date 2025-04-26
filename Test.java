interface MathOperations {
	static int add (int a, int b) {
		return a + b;
	}

	static int square(int a) {
		return a*a;
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println(MathOperations.add(5,3));
		System.out.println(MathOperations.square(4));
	}
}
			