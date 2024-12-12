package Activity;


import java.util.Scanner;


public class PhysicalExercise extends Activity {


   public PhysicalExercise() {
       super("Physical Exercise", 0); // Duration will be set by the user
   }


   @Override
   public void performActivity(Scanner scanner) {
       // Ask the user for the duration of the exercise session
       System.out.print("Enter the duration for Physical Exercise (in minutes): ");
       int exerciseDuration = getValidDuration(scanner);


       // Ask the user for the type of exercise
       System.out.println("\nChoose an exercise to perform:");
       System.out.println("1. Push-ups");
       System.out.println("2. Squats");
       System.out.println("3. Jumping Jacks");
       System.out.print("Enter your choice: ");
       int exerciseChoice = scanner.nextInt();
       scanner.nextLine(); // Consume the newline character
      
       // Ask for repetitions per set
       System.out.print("Enter the number of repetitions per set: ");
       int repetitions = scanner.nextInt();
       scanner.nextLine(); // Consume the newline character
      
       // Ask for rest time between sets
       System.out.print("Enter the rest time between sets (in seconds): ");
       int restTime = scanner.nextInt();
       scanner.nextLine(); // Consume the newline character
      
       // Convert duration to milliseconds
       long startTime = System.currentTimeMillis();
       long endTime = startTime + (exerciseDuration * 60000); // Duration in milliseconds
      
       // Perform the exercise until the duration is completed
       while (System.currentTimeMillis() < endTime) {
           // Perform the selected exercise
           performExercise(exerciseChoice, repetitions);
          
           // Rest after each set
           System.out.println("Rest for " + restTime + " seconds...");
           try {
               Thread.sleep(restTime * 1000); // Rest time in milliseconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println("Physical Exercise session completed.");
   }


   // Helper method to perform the selected exercise
   private void performExercise(int exerciseChoice, int repetitions) {
       String exerciseName = "";
       for (int i = 1; i <= repetitions; i++) {
           switch (exerciseChoice) {
               case 1:
                   exerciseName = "Push-up";
                   break;
               case 2:
                   exerciseName = "Squat";
                   break;
               case 3:
                   exerciseName = "Jumping Jack";
                   break;
               default:
                   System.out.println("Invalid choice!");
                   return;
           }
           System.out.println("Performing " + exerciseName + " " + i + " of " + repetitions + "...");
           try {
               Thread.sleep(1000); // Simulate time to perform one repetition
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }


   // Helper method to get a valid duration input from the user
  
   @Override
   public void waitForEnter(Scanner scanner) {
       System.out.println("Press Enter to start Physical Exercise...");
       scanner.nextLine(); // Wait for the user to press Enter before starting
   }
}



