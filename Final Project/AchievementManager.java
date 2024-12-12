public class AchievementManager {
    private int activitiesCompleted; // Tracks the number of completed activities
 
 
    public AchievementManager() {
        this.activitiesCompleted = 0; // Initially, no activities have been completed
    }
 
 
    // Method to increment the completed activity count
    public void incrementActivityCount() {
        activitiesCompleted++;
        checkForAchievements(); // Check if any achievements are unlocked
    }
 
 
    // Method to check if the user has earned any achievements
    public void checkForAchievements() {
        // Achievement: Complete 3 activities
        if (activitiesCompleted == 3) {
            System.out.println("Achievement Unlocked: 'Activity Master'! You completed 3 activities.");
        }
    }
 
 
    // Getter for the number of completed activities
    public int getActivitiesCompleted() {
        return activitiesCompleted;
    }
 }
 
 
 
 