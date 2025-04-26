
class Student{
   String name;
   int rollno; 


	Student (String name, int rollno) {
    		this.name = name;
    		this.rollno = rollno;
	}


	public String toString(){
    		String s = "\nMy name is " + name + ". My roll no is " + rollno;
    		return s;
	}
}

public class java1{
    public static void main(String[] args) {
        Student S1 = new Student("Tundup", 45);
        System.out.println(S1);
    }
}
