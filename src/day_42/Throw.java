package day_42;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Throw {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();
        if (age < 0) {
            //System.err.println("Invalid age: "+age);
            // System.exit(1); System.exit yerine throw keywordunu
            // kullanirsam code daha readable ve understandable olur
            throw new InputMismatchException("Age cannot be negative: " + age);
        }
        if (age > 20) {
            System.out.println("You are eligible");
        } else {
            throw new RuntimeException( "Age cannot be less than 20: " + age);

        }
    }

}