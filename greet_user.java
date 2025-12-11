import java.util.Scanner;

public class greet_user {

    public static void main(String[] args){
        Scanner init = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = init.nextLine();
        System.out.println("Hello, " + name + ", have a good day!");
    }
}
