import java.util.Scanner;

public class kms_to_miles {

    public static void main(String[] args){
        System.out.println("This program converts the user input value from kms to miles.");
        Scanner init = new Scanner(System.in);
        System.out.print("Enter the value (in kms): ");
        float value_km = init.nextFloat();

        double value_miles = (value_km)/1.61;
        System.out.println(value_km + " (Input by the user) in miles is: " + value_miles);
    }
}
