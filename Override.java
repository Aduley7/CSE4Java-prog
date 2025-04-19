class A {
	int i, j;
	A(int a, int b) {
		i = a;
		j = b;
	}
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A{
	int k;
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	void show(String msg) {
		System.out.println(msg + k);
	}
}
class Override
{
	public static void main(String[] args)
	{
		A A1 = new A(1,2);
		A1.show("hello");
		
		/*B B1= new B(1, 2, 3);
		B1.show("This is k: "); //this calls show() in B
		B1.show(); //this calls show() in A*/
	}
}