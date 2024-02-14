import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        double rate = 0;
        double hours = 0;
        double grossPay;
        double annual;

        try (Scanner myInput = new Scanner(System.in)) 
        {
            System.out.print("Enter hours worked:");
                hours = 
            myInput.nextDouble();

            System.out.print("Enter the rate:");
            rate = myInput.nextDouble();
        }

        if (hours > 40) {
            grossPay = ((hours-40) * rate * 1.5) + (40 * rate);
       
        } else {
            grossPay = (hours * rate);
        }

        System.out.println(grossPay);
        
        if (grossPay > 10) {
            annual = (grossPay * 52);
        System.out.println(annual);
        }
        else {
            System.out.println("Gross pay is not valid for annual income");
           }

//test

    }
}
