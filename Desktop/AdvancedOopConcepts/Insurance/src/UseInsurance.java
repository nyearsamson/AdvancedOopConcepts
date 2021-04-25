import java.io.InputStream;
import java.util.*;
public class UseInsurance {
    //entry point of the program , main method
    public static void main(String args[]) {
        //creating object of Scannerclass
        Scanner input = new Scanner(System.in);
        int insurance;
        //asking user type ofinsurance
        System.out.println("Enter (1) for Life Insurance or (2) for Health Insurance: ");
        String userInput =input.next();//reading user choice
        insurance =Integer.parseInt(userInput);
        //checking selectedinsurance
        if (insurance == 1)
           insuranceLife();//method call
        else
           insuranceHealth();//method call
    }
    private static Scanner newScanner(InputStream in) {
        // TODO Auto-generated method stub
        return null;
    }
    //method definition
    public static void insuranceLife() {
        Life life = new Life();
        life.setCost();
        life.display();
    }
    //method definition
    public static void insuranceHealth() {
        Health health = new Health();
        health.setCost();
        health.display();
    }
}
