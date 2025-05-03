import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students:");
		int Student = sc.nextInt();
		
		System.out.println("Enter the number of Chocolates");

		try{
			Student = 0;
			Chocolates = Chocolates/Student; 

		int Chocolates = sc.nextInt();

		int Total = Chocolates/Student;
		
		System.out.println("Each will get " + Total + " Chococlates." );
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero.");
		}
		
		System.out.println("After catch statement.");
	}
}