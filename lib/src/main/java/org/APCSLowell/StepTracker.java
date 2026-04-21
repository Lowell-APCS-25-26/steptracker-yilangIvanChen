package org.APCSLowell;

public class StepTracker {
    private int minSteps, totSteps, actDays, totDays;
    public StepTracker(int activityThreshold) {
        minSteps = activityThreshold;
        totSteps = 0;
        actDays = 0;
        totDays = 0;
    }
    public void addDailySteps(int stepCount) {
        if (stepCount >= minSteps)
            actDays++;
        totDays++;
        totSteps += stepCount;
    }
    public int activeDays() {
        return actDays;
    }
    public double averageSteps() {
        if (totDays == 0)
            return 0;
        return (double) totSteps/totDays;
    }
}
