package Activity;
import java.util.Scanner;

public class BoxBreathing extends Activity {

   public BoxBreathing() {
       super("Box Breathing", 0); 
   }

   @Override
   public void performActivity(Scanner scanner) {
       System.out.print("Enter the duration for Box Breathing (in minutes): ");
       float userDuration = getValidDuration(scanner);

       long startTime = System.currentTimeMillis();
       long endTime = startTime + (long)(userDuration * 60000);
      
       System.out.println("Starting Box Breathing for " + userDuration + " minute(s)...");
      
       while (System.currentTimeMillis() < endTime) {
           performBreathingCycle();
       }

       System.out.println("Box Breathing session completed.");
   }

   private void performBreathingCycle() {
       try {
           System.out.println("Inhale for 4 seconds...");
           Thread.sleep(4000); 
           System.out.println("Hold for 4 seconds...");
           Thread.sleep(4000); 
           System.out.println("Exhale for 4 seconds...");
           Thread.sleep(4000); 
           System.out.println("Hold for 4 seconds...");
           Thread.sleep(4000); 
       } catch (InterruptedException e) {
           System.out.println("Breathing cycle interrupted.");
       }
   }

   @Override
   public void waitForEnter(Scanner scanner) {
       System.out.println("Press Enter to start Box Breathing...");
       scanner.nextLine(); 
   }
}



