package Activity;


import java.util.Scanner;


public class BoxBreathing extends Activity {


   public BoxBreathing() {
       super("Box Breathing", 0); // Default to 0, since the duration will be user-defined
   }


   @Override
   public void performActivity(Scanner scanner) {
       // Prompt the user to enter the duration of the Box Breathing session
       System.out.print("Enter the duration for Box Breathing (in minutes): ");
       int userDuration = getValidDuration(scanner);


       // Convert minutes to milliseconds
       long startTime = System.currentTimeMillis();
       long endTime = startTime + (userDuration * 60000); // Duration in milliseconds
      
       System.out.println("Starting Box Breathing for " + userDuration + " minute(s)...");
      
       // Perform the breathing cycle until the duration is completed
       while (System.currentTimeMillis() < endTime) {
           performBreathingCycle();
       }


       System.out.println("Box Breathing session completed.");
   }


   // Helper method to perform one cycle of Box Breathing
   private void performBreathingCycle() {
       try {
           System.out.println("Inhale for 4 seconds...");
           Thread.sleep(4000); // Inhale for 4 seconds
           System.out.println("Hold for 4 seconds...");
           Thread.sleep(4000); // Hold for 4 seconds
           System.out.println("Exhale for 4 seconds...");
           Thread.sleep(4000); // Exhale for 4 seconds
           System.out.println("Hold for 4 seconds...");
           Thread.sleep(4000); // Hold for 4 seconds
       } catch (InterruptedException e) {
           System.out.println("Breathing cycle interrupted.");
       }
   }


   @Override
   public void waitForEnter(Scanner scanner) {
       System.out.println("Press Enter to start Box Breathing...");
       scanner.nextLine(); // Wait for the user to press Enter before starting
   }
}



