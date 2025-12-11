import java.util.Scanner;

public class grade_calculator {

    public static void main(String[] args){
        System.out.println("Welcome to percentage calculator program!");
        Scanner init = new Scanner(System.in);
        int totalMarks = 500;
        float gainedMarks;
        float percentage;

        System.out.print("Enter the marks of the first subject: ");
        float sub1 = init.nextFloat();
        System.out.print("Enter the marks of the second subject: ");
        float sub2 = init.nextFloat();
        System.out.print("Enter the marks of the third subject: ");
        float sub3 = init.nextFloat();
        System.out.print("Enter the marks of the fourth subject: ");
        float sub4 = init.nextFloat();
        System.out.print("Enter the marks of the fifth subject: ");
        float sub5 = init.nextFloat();

        gainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (gainedMarks/totalMarks)*100;
        System.out.print("Percentage secured by you: ");
        System.out.println(percentage);
    }
}
