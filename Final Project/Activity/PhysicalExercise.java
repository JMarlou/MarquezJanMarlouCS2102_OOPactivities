package Activity;


import java.util.Scanner;


public class PhysicalExercise extends Activity {


   public PhysicalExercise() {
       super("Physical Exercise", 0); 
   }


   @Override
   public void performActivity(Scanner scanner) {
       System.out.print("Enter the duration for Physical Exercise (in minutes): ");
       float exerciseDuration = getValidDuration(scanner);

       System.out.println("\nChoose an exercise to perform:");
       System.out.println("1. Push-ups");
       System.out.println("2. Squats");
       System.out.println("3. Jumping Jacks");
       System.out.print("Enter your choice: ");
       int exerciseChoice = scanner.nextInt();
       scanner.nextLine(); 
      
       System.out.print("Enter the number of repetitions per set: ");
       int repetitions = scanner.nextInt();
       scanner.nextLine();

       System.out.print("Enter the rest time between sets (in seconds): ");
       int restTime = scanner.nextInt();
       scanner.nextLine(); 
      
       long startTime = System.currentTimeMillis();
       long endTime = startTime + (long)(exerciseDuration * 60000); 
      

       while (System.currentTimeMillis() < endTime) {
           performExercise(exerciseChoice, repetitions);
          
           System.out.println("Rest for " + restTime + " seconds...");
           try {
               Thread.sleep(restTime * 1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println("Physical Exercise session completed.");
   }

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
               Thread.sleep(1000); 
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }

  
   @Override
   public void waitForEnter(Scanner scanner) {
       System.out.println("Press Enter to start Physical Exercise...");
       scanner.nextLine(); 
   }
}



