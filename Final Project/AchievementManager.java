public class AchievementManager {
    private int activitiesCompleted; 
 
 
    public AchievementManager() {
        this.activitiesCompleted = 0; 
    }
 
    public void incrementActivityCount() {
        activitiesCompleted++;
        checkForAchievements();
    }
 
 
    public void checkForAchievements() {
        if (activitiesCompleted == 3) {
            System.out.println("Achievement Unlocked: 'Activity Master'! You completed 3 activities.");
        }
    }
 
    public int getActivitiesCompleted() {
        return activitiesCompleted;
    }
 }
 
 
 
 