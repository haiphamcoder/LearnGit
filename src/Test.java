import java.util.Scanner;

public class Test{
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int n = keyboard.nextInt();
        System.out.println("n = " + n);
    }
}