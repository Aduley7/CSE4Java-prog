public class Income_Tax_Calculator{
  public static void main(String[] args){
        float tax = 0f;
        float income = 8.0f;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your annual income:");
        //income = sc.nextFloat();

        if(income<=2.5f){
            tax = tax + 0;
        }

        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f * (income-2.5f);
        }

        else if(income>5.0f && income<=10.0f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }

        else if(income>10.0f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Total tax per annum:" + tax);
  }
}
