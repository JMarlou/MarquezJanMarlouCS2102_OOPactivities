// Correct Package Declaration (top of file)
package Activity;


import java.util.Scanner;


public abstract class Activity {
   private String name;
   private int duration; // Duration in minutes


   public Activity(String name, int duration) {
       this.name = name;
       this.duration = duration;
   }


   // Getter methods
   public String getName() {
       return name;
   }


   public int getDuration() {
       return duration;
   }


   // Abstract method that will be implemented by subclasses
   public abstract void performActivity(Scanner scanner);


   // Method to display information about the activity
   public void displayInfo() {
       System.out.println("Activity: " + name);
   }


   // Method to wait for Enter key before starting the activity
   public void waitForEnter(Scanner scanner) {
       System.out.println("Press Enter to start the activity...");
       scanner.nextLine(); // Wait for the user to press Enter
   }


   // Method to get a valid duration input from the user (moved from subclass)
   protected int getValidDuration(Scanner scanner) {
       int duration = 0;
       boolean valid = false;
      
       while (!valid) {
           try {
               duration = Integer.parseInt(scanner.nextLine()); // Get user input
               if (duration > 0) {
                   valid = true; // If the duration is positive, accept it
               } else {
                   System.out.print("Please enter a positive number for the duration: ");
               }
           } catch (NumberFormatException e) {
               System.out.print("Invalid input. Please enter a valid number for the duration: ");
           }
       }
       return duration;
   }
}



