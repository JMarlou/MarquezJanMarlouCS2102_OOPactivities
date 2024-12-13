package Activity;


import java.util.Scanner;


public class Visualization extends Activity {


   public Visualization() {
       super("Visualization", 0); 
   }


   @Override
   public void performActivity(Scanner scanner) {
       System.out.print("Enter the duration for Visualization (in minutes): ");
       float userDuration = getValidDuration(scanner);

       long startTime = System.currentTimeMillis();  
       long endTime = startTime + (long)userDuration * 60 * 1000; 
      
       System.out.println("Starting Visualization for " + userDuration + " minutes...");

       int promptIndex = 0;
       String[] prompts = {
           "Visualize a calm and peaceful beach. Hear the gentle sound of the waves.",
           "Now imagine yourself walking along the beach, feeling the warm sand under your feet.",
           "Visualize the sun setting on the horizon, the colors of the sky changing beautifully.",
           "Imagine the cool breeze brushing against your face, calming and relaxing you.",
           "Visualize yourself achieving a personal goal, feeling proud and fulfilled."
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

       System.out.println("\nVisualization complete. Feel free to take a moment to reflect.");
   }
}



