import java.util.Scanner;

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
                System.out.println("2. Log out");
                System.out.println("3. Perform Activities");
                System.out.println("4. View Activity Log");
                System.out.println("5. View Achievements");
                System.out.println("0. Exit");
            }

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (loggedInUser == null) {
                        handleLogin(scanner);
                    } else {
                        System.out.println("You are already logged in.");
                    }
                    break;
                case 2:
                    if (loggedInUser != null) {
                        loggedInUser = null;
                        System.out.println("You have logged out successfully.");
                    } else {
                        System.out.println("You are not logged in.");
                    }
                    break;
                case 3:
                    if (loggedInUser != null) {
                        performActivities(scanner);
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;
                case 4:
                    if (loggedInUser != null) {
                        showActivityLog();
                        scanner.nextLine();
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;
                case 5:
                    if (loggedInUser != null) {
                        achievementManager.showAchievements();
                        scanner.nextLine();
                    } else {
                        System.out.println("You need to log in first.");
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

    private static void handleLogin(Scanner scanner) {
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
                loggedInUser = username;
                loginSuccessful = true;
                break;
            }
        }

        if (loginSuccessful) {
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void performActivities(Scanner scanner) {
        Activity meditation = new BodyScanMeditation(10); 
        Activity breathing = new BoxBreathing(5);         
        Activity physicalExercise = new PhysicalExercise(15); 
        Activity visualization = new Visualization(8);    

        Activity[] activities = {meditation, breathing, physicalExercise, visualization};

        System.out.println("\nChoose an activity to perform:");
        for (int i = 0; i < activities.length; i++) {
            System.out.println((i + 1) + ". " + activities[i].getName() + " (" + activities[i].getDuration() + " minutes)");
        }

        System.out.println("0. Exit to main menu");
        System.out.print("Enter choice: ");
        int activityChoice = scanner.nextInt();
        scanner.nextLine(); 

        if (activityChoice >= 1 && activityChoice <= activities.length) {
            Activity selectedActivity = activities[activityChoice - 1];
            selectedActivity.displayInfo();
            selectedActivity.waitForEnter(scanner);  
            selectedActivity.performActivity(scanner);
            achievementManager.incrementActivityCount(activityChoice);
            achievementManager.checkForAchievements();
            System.out.println("Press Enter if You Are Done!"); 
            scanner.nextLine();

        } else if (activityChoice == 0) {
            System.out.println("Returning to main menu...");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void showActivityLog() {
        System.out.println("\nActivity Log:");
        achievementManager.showActivityLog();
    }
}
