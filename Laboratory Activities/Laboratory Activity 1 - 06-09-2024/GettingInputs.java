import java.util.Scanner;

public class GettingInputs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        Integer year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the album: ");
        String album = scanner.nextLine();

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the Artists: ");
        String artist = scanner.nextLine();

        System.out.println("------------------------------\nSONG DETAILS\n------------------------------");
        System.out.println("Year released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + '"' + title + '"');
        System.out.println("Artist: " + artist);

        scanner.close();
    }

}