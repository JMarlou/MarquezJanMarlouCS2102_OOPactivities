import java.util.Scanner;
import Activity.Activity;
import Activity.BodyScanMeditation;
import Activity.BoxBreathing;
import Activity.PhysicalExercise;
import Activity.Visualization;


public class Main {


   private static String loggedInUser = null;
   private static AchievementManager achievementManager = new AchievementManager();


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to Mindful Reflections!");

       while (true) {
           if (loggedInUser == null) {
               System.out.println("\nPlease choose an option:");
               System.out.println("1. Login");
               System.out.println("0. Exit");
           } else {
               System.out.println("\nHello, " + loggedInUser + "!");
               System.out.println("1. Perform Activities");
               System.out.println("2. View Achievements");
               System.out.println("3. Log out");
               System.out.println("0. Exit");
           }

           System.out.print("Enter your choice: ");
           int choice = scanner.nextInt();
           scanner.nextLine();


           switch (choice) {
               case 1:
                   if (loggedInUser == null) {
                       loggedInUser = Login.handleLogin(scanner);
                   } else {
                       performActivities(scanner);
                   }
                   break;
               case 2:
                   if (loggedInUser != null) {
                       viewAchievements();
                   } else {
                       System.out.println("You must be logged in to view achievements.");
                   }
                   break;
               case 3:
                   if (loggedInUser != null) {
                       loggedInUser = null;
                       System.out.println("You have logged out successfully.");
                   } else {
                       System.out.println("You are not logged in.");
                   }
                   break;
               case 0:
                   System.out.println("Goodbye!");
                   scanner.close();
                   return;
               default:
                   System.out.println("Invalid choice, please try again.");
           }
       }
   }
   private static void viewAchievements() {
       System.out.println("\nYour Achievements:");
       achievementManager.checkForAchievements();
   }

   private static void performActivities(Scanner scanner) {
       Activity[] activities = {
           new BodyScanMeditation(),
           new BoxBreathing(),
           new PhysicalExercise(),
           new Visualization()
       };


       while (true) {
           System.out.println("\nChoose an activity to perform:");
           for (int i = 0; i < activities.length; i++) {
               System.out.println((i + 1) + ". " + activities[i].getName());
           }
           System.out.println("0. Back to Main Menu");
           System.out.print("Enter choice: ");
          
           int choice = scanner.nextInt();
           scanner.nextLine(); 
  
           if (choice == 0) {
               System.out.println("Returning to Main Menu...");
               break; 
           }
  
           if (choice >= 1 && choice <= activities.length) {
               Activity activity = activities[choice - 1];
               activity.displayInfo();
               activity.waitForEnter(scanner);
               activity.performActivity(scanner);
  
               achievementManager.incrementActivityCount(); 
               System.out.println("You have completed " + achievementManager.getActivitiesCompleted() + " activities so far.");

               System.out.println("Press Enter when done!");
               scanner.nextLine();  
           } else {
               System.out.println("Invalid choice. Try again.");
           }
       }
   }
}

