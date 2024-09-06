import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        Integer year = scanner.nextInt();

        System.out.println(year);

        scanner.close();
    }

}