import java.util.Scanner;

public class GetArrayMean {
    public static double ArrayMean(int[] arr){
        if (arr.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Elements: ");
        int n = scanner.nextInt();
        int[] integers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            integers[i] = scanner.nextInt();
        }

        double mean = ArrayMean(integers);
        System.out.printf("Mean of array is %.2f%n", mean);

        scanner.close();
};
}
