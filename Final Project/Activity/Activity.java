package Activity;
import java.util.Scanner;

public abstract class Activity {
   private String name;
   private float duration;


   public Activity(String name, float duration) {
       this.name = name;
       this.duration = duration;
   }

   public String getName() {
       return name;
   }

   public float getDuration() {
       return duration;
   }

   public abstract void performActivity(Scanner scanner);

   public void displayInfo() {
       System.out.println("Activity: " + name);
   }

   public void waitForEnter(Scanner scanner) {
       System.out.println("Press Enter to start the activity...");
       scanner.nextLine(); 
   }

   protected float getValidDuration(Scanner scanner) {
       float duration = 0;
       boolean valid = false;
      
       while (!valid) {
        try {
            duration = Float.parseFloat(scanner.nextLine()); 
            if (duration > 0) {
                valid = true; 
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



