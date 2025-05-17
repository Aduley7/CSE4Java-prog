import java.util.Scanner;

class IncomeTaxCalculator {
    
    // Method to calculate tax based on income
    public float calculateTax(float income) {
        float tax = 0f;
        
        if (income <= 2.5f) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        
        return tax;
    }
}

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IncomeTaxCalculator taxCalculator = new IncomeTaxCalculator();

        // User input for income
        System.out.println("Enter your annual income:");
        float income = sc.nextFloat();

        // Calculate tax using the method from the IncomeTaxCalculator class
        float tax = taxCalculator.calculateTax(income);

        // Output the result
        System.out.println("Total tax per annum: " + tax);
        
        sc.close();
    }
}
