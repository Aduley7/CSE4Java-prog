import java.util.Scanner{
public class ternaryOperator {

	public static void main(String[] args);

    	Scanner sc= new Scanner(System.in);

    	System.out.println("Enter the time:");

    	int time = sc.nextInt();

    	String result = (time<18) ? "Good day!":"Good evening!";

    	System.out.println("result");

    	sc.close();
	}
}