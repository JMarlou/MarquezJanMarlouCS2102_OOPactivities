import java.util.Scanner;

public class Login {


   public static String handleLogin(Scanner scanner) {
       String[][] users = {
           {"marlou", "123"},
       };


       System.out.print("Enter username: ");
       String username = scanner.nextLine();
       System.out.print("Enter password: ");
       String password = scanner.nextLine();


       boolean loginSuccessful = false;
       for (String[] user : users) {
           if (user[0].equals(username) && user[1].equals(password)) {
               loginSuccessful = true;
               break;
           }
       }


       if (loginSuccessful) {
           System.out.println("Welcome, " + username + "!");
           return username; // Return the logged-in username
       } else {
           System.out.println("Invalid username or password.");
           return null; // Return null if login fails
       }
   }
}



