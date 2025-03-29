class Person
{
	int height;
	void add10(Person o)
	{
		o.height += 10;
	}
}

class ArgumentPassByRef
{
	public static void main(String args[])
	{
		Person ob = new Person();
		ob.height = 150;
		System.out.println("Height before call:" +ob.height);
		ob.add10(ob);
		System.out.println("Height after call:" +ob.height);
	}
}