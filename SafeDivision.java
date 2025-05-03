import java.util.Scanner;

public class SafeDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1,num2;

		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
	
		while(true) {
			try {
				System.out.print("Enter the second number:");
				num2 = sc.nextInt();

				int result = num1/num2;
				System.out.println("Result: " + result);
				break;
			}
			
			catch(ArithmeticException e) {
				System.out.println("Error: " + e.getMessage() + " Please try again.");
			}
		}
	}
}