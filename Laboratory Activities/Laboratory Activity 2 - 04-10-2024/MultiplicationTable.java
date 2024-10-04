import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int max = scanner.nextInt();

        int[][] multiplicationTable = new int[max + 1][max + 1];

        for(int i = 1; i <= max; i++){
            for(int j = 1; j <= max; j++){
                multiplicationTable[i][j] = i * j;
        }
    } 
        System.out.println("Multiplication Table:");
        for(int i = 1;  i <= max; i++){
            for(int j = 1; j <= max; j++){
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();
        }
    scanner.close();
    }
}