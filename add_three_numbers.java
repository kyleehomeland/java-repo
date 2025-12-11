import java.util.Scanner;

public class add_three_numbers {

    public static void main(String[] args){
        System.out.println("This is a program which takes 3 numbers as input from the user and adds them.");
        int num1, num2, num3, num;
        Scanner init = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = init.nextInt();
        System.out.print("Enter the second number: ");
        num2 = init.nextInt();
        System.out.print("Enter the third number: ");
        num3 = init.nextInt();

        num = num1 + num2 + num3;
        System.out.print("The sum of the three numbers is: ");
        System.out.print(num);
    }
}
