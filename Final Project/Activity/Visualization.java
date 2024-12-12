package Activity;


import java.util.Scanner;


public class Visualization extends Activity {


   public Visualization() {
       super("Visualization", 0); // Duration will be set by the user
   }


   @Override
   public void performActivity(Scanner scanner) {
       // Ask the user for the duration of the visualization
       System.out.print("Enter the duration for Visualization (in minutes): ");
       int userDuration = getValidDuration(scanner);


       // Get the current system time (in milliseconds)
       long startTime = System.currentTimeMillis();
      
       // Calculate the end time based on the current time and the duration (in minutes)
       long endTime = startTime + userDuration * 60 * 1000; // Duration in milliseconds
      
       // Start the visualization
       System.out.println("Starting Visualization for " + userDuration + " minutes...");


       // Perform visualization until the time is up
       int promptIndex = 0;
       String[] prompts = {
           "Visualize a calm and peaceful beach. Hear the gentle sound of the waves.",
           "Now imagine yourself walking along the beach, feeling the warm sand under your feet.",
           "Visualize the sun setting on the horizon, the colors of the sky changing beautifully.",
           "Imagine the cool breeze brushing against your face, calming and relaxing you.",
           "Visualize yourself achieving a personal goal, feeling proud and fulfilled."
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
               Thread.sleep(20000); // Sleep for 30 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }


       // When the time is up, complete the visualization
       System.out.println("\nVisualization complete. Feel free to take a moment to reflect.");
   }
}



