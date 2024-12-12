package Activity;


import java.util.Scanner;


public class BodyScanMeditation extends Activity {


   public BodyScanMeditation() {
       super("Body Scan Meditation", 0); // Duration will be set by the user
   }


   @Override
   public void performActivity(Scanner scanner) {
       // Ask the user for the duration of the meditation
       System.out.print("Enter the duration for Body Scan Meditation (in minutes): ");
       int userDuration = getValidDuration(scanner);


       // Get the current system time (in milliseconds)
       long startTime = System.currentTimeMillis();
      
       // Calculate the end time based on the current time and the duration (in minutes)
       long endTime = startTime + userDuration * 60 * 1000; // Duration in milliseconds
      
       // Start the meditation
       System.out.println("Starting Body Scan Meditation for " + userDuration + " minutes...");


       // Perform body scan until the time is up
       int promptIndex = 0;
       String[] prompts = {
           "Focus on your head. Relax and let go of any tension.",
           "Move your attention to your shoulders. Feel them relaxing and softening.",
           "Now, focus on your arms. Release any tightness in your forearms and hands.",
           "Shift your attention to your chest. Feel your breath flowing freely and deeply.",
           "Focus on your abdomen. Let go of any discomfort and feel it softening."
       };


       while (System.currentTimeMillis() < endTime) {
           long timeRemaining = (endTime - System.currentTimeMillis()) / 1000; // Convert to seconds
           System.out.println("Time remaining: " + timeRemaining + " seconds...");


           // Display one prompt at a time
           if (promptIndex < prompts.length) {
               System.out.println(prompts[promptIndex]);
               promptIndex++;
           } else {
               // Loop back to the first prompt if all prompts are shown
               promptIndex = 0;
           }


           // Wait for 30 seconds before showing the next prompt
           try {
               Thread.sleep(30000); // Sleep for 30 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }


       // When the time is up, complete the meditation
       System.out.println("\nBody Scan Meditation complete. Feel free to take a moment to reflect.");
   }
}