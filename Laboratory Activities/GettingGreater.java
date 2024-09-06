import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter the first character: ");
        char first = scanner.nextLine().charAt(0);

        System.out.print("Enter the second character: ");
        char second = scanner.nextLine().charAt(0);

        int asciiFirst = (int) first;
        int asciiSecond = (int) second;
        int greaterAscii = Math.max(asciiFirst, asciiSecond);
        char greater = (char) greaterAscii;

        System.out.println("------------------------------");
        System.out.println("The character with the greater value is: " + greater);
        System.out.println("------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(first + ":" + asciiFirst);
        System.out.println(second + ":" + asciiSecond);

        scanner.close();
    }
}
