public class AchievementManager {
    private int bodyScanCount = 0;
    private int boxBreathingCount = 0;
    private int physicalExerciseCount = 0;
    private int visualizationCount = 0;

    private String[] achievements = new String[10];
    private int achievementIndex = 0;

    public void incrementActivityCount(int activityChoice) {
        switch (activityChoice) {
            case 1: bodyScanCount++; break;
            case 2: boxBreathingCount++; break;
            case 3: physicalExerciseCount++; break;
            case 4: visualizationCount++; break;
            default: System.out.println("Invalid activity choice");
        }
    }

    public void checkForAchievements() {
        if (bodyScanCount == 5 && !achievementUnlocked("Body Scan Master")) {
            unlockAchievement("Body Scan Master");
        }
        if (boxBreathingCount == 5 && !achievementUnlocked("Box Breathing Expert")) {
            unlockAchievement("Box Breathing Expert");
        }
        if (physicalExerciseCount == 5 && !achievementUnlocked("Fitness Enthusiast")) {
            unlockAchievement("Fitness Enthusiast");
        }
        if (visualizationCount == 5 && !achievementUnlocked("Visualization Pro")) {
            unlockAchievement("Visualization Pro");
        }
    }

    private void unlockAchievement(String achievement) {
        if (achievementIndex < achievements.length) {
            achievements[achievementIndex++] = achievement;
            System.out.println("Achievement Unlocked: " + achievement);
        }
    }

    private boolean achievementUnlocked(String achievement) {
        for (int i = 0; i < achievements.length; i++) {
            if (achievements[i] != null && achievements[i].equals(achievement)) {
                return true;
            }
        }
        return false;
    }

    public void showAchievements() {
        System.out.println("\nAchievements Unlocked:");
        if (achievementIndex == 0) {
            System.out.println("No achievements unlocked yet.");
        } else {
            for (int i = 0; i < achievementIndex; i++) {
                System.out.println(achievements[i]);
            }
        }
    }

    public void showActivityLog() {
        System.out.println("Body Scan Meditation: " + bodyScanCount + " times");
        System.out.println("Box Breathing: " + boxBreathingCount + " times");
        System.out.println("Physical Exercise: " + physicalExerciseCount + " times");
        System.out.println("Visualization: " + visualizationCount + " times");
    }

    public int getBodyScanCount() {
        return bodyScanCount;
    }

    public int getBoxBreathingCount() {
        return boxBreathingCount;
    }

    public int getPhysicalExerciseCount() {
        return physicalExerciseCount;
    }

    public int getVisualizationCount() {
        return visualizationCount;
    }
}
