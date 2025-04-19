//Base class
class Human{
	String name;
	int age;
	 
	Human()
	{
		name="";
		age=0;
		System.out.println("\nI am just born."  );
	}

	//Constructor
	Human(String n, int a){
		name = n;
		age = a;
	}

	void speak(){
		System.out.println("\nMy name is " +   name   + " and I am " + age + "years old.");
	} 
}




//Derived class
class Student extends Human {
	String studentId;
	String standard; //New attribute
	
	//attribute
	Student(String n, int a, String sId, String std) {
		super(n, a); //calling constructor of parent
		studentId = sId;
		standard = std;

	}
	
	void speak() {
		super.speak(); //Calling method of parent
		System.out.println("I am studying in standard "   + standard  + " My student ID is: "      + studentId + "\n ");
	}
}


class PG_Student extends Student {
	String specialization;
	
	PG_Student(String name, int age, String studentId, String standard, String specialization){
		super(name, age, studentId, standard);
		this.specialization = specialization;
	}

	void research() {
		System.out.println("I am a post graduate student specializing in " + specialization +".");
	}
}


//Main class
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Human h = new Human("Manik" , 20);
		Student s = new Student("Karan" , 17, "S12345"   , "12th"  );
		PG_Student p = new PG_Student("Muneeb" , 17, "PS12346"   , "12th", "Computer Science");
		h.speak();
		s.speak();
		p.research();
	}
}