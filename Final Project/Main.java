import java.util.Scanner;
import Activity.Activity;
import Activity.BodyScanMeditation;
import Activity.BoxBreathing;
import Activity.PhysicalExercise;
import Activity.Visualization;


public class Main {


   private static String loggedInUser = null;
   private static AchievementManager achievementManager = new AchievementManager(); // Create an achievement manager


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to Mindful Reflections!");


       // Main program loop
       while (true) {
           if (loggedInUser == null) {
               // If no user is logged in, show login options
               System.out.println("\nPlease choose an option:");
               System.out.println("1. Login");
               System.out.println("0. Exit");
           } else {
               // If a user is logged in, show activity and logout options
               System.out.println("\nHello, " + loggedInUser + "!");
               System.out.println("1. Perform Activities");
               System.out.println("2. View Achievements");
               System.out.println("3. Log out");
               System.out.println("0. Exit");
           }


           System.out.print("Enter your choice: ");
           int choice = scanner.nextInt();
           scanner.nextLine(); // Consume the newline character


           switch (choice) {
               case 1:
                   if (loggedInUser == null) {
                       // If user is not logged in, prompt to login
                       loggedInUser = Login.handleLogin(scanner); // Call the login method
                   } else {
                       // If user is logged in, show the activities menu
                       performActivities(scanner);
                   }
                   break;
               case 2:
                   if (loggedInUser != null) {
                       // Show achievements if the user is logged in
                       viewAchievements();
                   } else {
                       System.out.println("You must be logged in to view achievements.");
                   }
                   break;
               case 3:
                   if (loggedInUser != null) {
                       // Log out the user
                       loggedInUser = null;
                       System.out.println("You have logged out successfully.");
                   } else {
                       System.out.println("You are not logged in.");
                   }
                   break;
               case 0:
                   // Exit the program
                   System.out.println("Goodbye!");
                   scanner.close();
                   return;
               default:
                   // Invalid choice
                   System.out.println("Invalid choice, please try again.");
           }
       }
   }
   // Method to view achievements
   private static void viewAchievements() {
       System.out.println("\nYour Achievements:");
       achievementManager.checkForAchievements(); // Display the achievements
   }


   private static void performActivities(Scanner scanner) {
       // Define activities
       Activity[] activities = {
           new BodyScanMeditation(),
           new BoxBreathing(),
           new PhysicalExercise(),
           new Visualization()
       };


       while (true) {
           // Show activity options
           System.out.println("\nChoose an activity to perform:");
           for (int i = 0; i < activities.length; i++) {
               System.out.println((i + 1) + ". " + activities[i].getName());
           }
           System.out.println("0. Back to Main Menu");
           System.out.print("Enter choice: ");
          
           int choice = scanner.nextInt();
           scanner.nextLine();  // Clear the newline character
  
           if (choice == 0) {
               System.out.println("Returning to Main Menu...");
               break;  // Exit the loop and return to the main menu
           }
  
           if (choice >= 1 && choice <= activities.length) {
               // Perform the selected activity
               Activity activity = activities[choice - 1];
               activity.displayInfo();
               activity.waitForEnter(scanner);
               activity.performActivity(scanner);
  
               // Increment activity count and check for achievements
               achievementManager.incrementActivityCount(); // Increment after completing an activity
               System.out.println("You have completed " + achievementManager.getActivitiesCompleted() + " activities so far.");


               System.out.println("Press Enter when done!");
               scanner.nextLine();  // Wait for user to finish
           } else {
               System.out.println("Invalid choice. Try again.");
           }
       }
   }
}

