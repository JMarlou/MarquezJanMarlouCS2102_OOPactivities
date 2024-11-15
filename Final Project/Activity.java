import java.util.Scanner;

public abstract class Activity {
    private String name;
    private int duration;

    public Activity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void performActivity(Scanner scanner);

    public void displayInfo() {
        System.out.println("Activity: " + name);
        System.out.println("Duration: " + duration + " minutes");
    }

    public void waitForEnter(Scanner scanner) {
        scanner.nextLine(); 
    }
}

class BodyScanMeditation extends Activity {

    public BodyScanMeditation(int duration) {
        super("Body Scan Meditation", duration);
    }

    @Override
    public void performActivity(Scanner scanner) {
        String[] prompts = {
            "Starting Body Scan Meditation for " + getDuration() + " minutes...",
            "Focus on each part of your body, from your toes to your head...",
            "Take deep breaths and release any tension."
        };

        for (String prompt : prompts) {
            System.out.println(prompt);
            waitForEnter(scanner); 
        } 
    }
}

class BoxBreathing extends Activity {

    public BoxBreathing(int duration) {
        super("Box Breathing", duration);
    }

    @Override
    public void performActivity(Scanner scanner) {
        String[] prompts = {
            "Starting Box Breathing for " + getDuration() + " minutes...",
            "Inhale for 4 seconds...",
            "Hold for 4 seconds...",
            "Exhale for 4 seconds...",
            "Hold for 4 seconds..."
        };

        for (String prompt : prompts) {
            System.out.println(prompt);
            waitForEnter(scanner); 
        }
    }
}

class PhysicalExercise extends Activity {

    public PhysicalExercise(int duration) {
        super("Physical Exercise", duration);
    }

    @Override
    public void performActivity(Scanner scanner) {
        String[] prompts = {
            "Starting Physical Exercise for " + getDuration() + " minutes...",
            "Do some stretches...",
            "Perform yoga poses...",
            "Do some quick cardio exercises...",
            "Focus on your breathing and relaxation."
        };

        for (String prompt : prompts) {
            System.out.println(prompt);
            waitForEnter(scanner); 
        }
    }
}

class Visualization extends Activity {

    public Visualization(int duration) {
        super("Visualization", duration);
    }

    @Override
    public void performActivity(Scanner scanner) {
        String[] prompts = {
            "Starting Visualization for " + getDuration() + " minutes...",
            "Imagine a peaceful beach or forest.",
            "Feel the calmness and relaxation...",
            "Breathe deeply and visualize your surroundings."
        };

        for (String prompt : prompts) {
            System.out.println(prompt);
            waitForEnter(scanner); 
        }
    }
}
