package Activity;

import java.util.Scanner;

public class BodyScanMeditation extends Activity {

   public BodyScanMeditation() {
       super("Body Scan Meditation", 0); 
   }

   @Override
   public void performActivity(Scanner scanner) {
       System.out.print("Enter the duration for Body Scan Meditation (in minutes): ");
       float userDuration = getValidDuration(scanner); 

       long startTime = System.currentTimeMillis();
       long endTime = startTime + (long)(userDuration * 60 * 1000); 
      
       System.out.println("Starting Body Scan Meditation for " + userDuration + " minutes...");

       int promptIndex = 0;
       String[] prompts = {
           "Focus on your head. Relax and let go of any tension.",
           "Move your attention to your shoulders. Feel them relaxing and softening.",
           "Now, focus on your arms. Release any tightness in your forearms and hands.",
           "Shift your attention to your chest. Feel your breath flowing freely and deeply.",
           "Focus on your abdomen. Let go of any discomfort and feel it softening."
       };

       while (System.currentTimeMillis() < endTime) {
           long timeRemaining = (endTime - System.currentTimeMillis()) / 1000; 
           System.out.println("Time remaining: " + timeRemaining + " seconds...");

           if (promptIndex < prompts.length) {
               System.out.println(prompts[promptIndex]);
               promptIndex++;
           } else {
               promptIndex = 0;
           }

           try {
               Thread.sleep(20000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       System.out.println("\nBody Scan Meditation complete. Feel free to take a moment to reflect.");
   }
}
