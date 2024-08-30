// Introduction to Java. Welcome to OOP Course
import java.util.Scanner;

public class Welcome{
    public static void main(String[] args) {
        System.out.println("Welcome to CS 211: Object-oriented Programming");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("This course will be fun, " + name + '!' );

        scanner.close();
    }
}