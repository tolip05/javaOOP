package calendar;

import java.util.Comparator;

public class WeeklyEntry {

    public final static Comparator<WeeklyEntry> BY_WEEK = sortedWeek();



    private WeeklyDays weeklyDays;
    private String notes;

    public WeeklyEntry(String weeklyDays, String notes) {
        this.weeklyDays = WeeklyDays.valueOf(WeeklyDays.class,weeklyDays.toUpperCase());
        this.notes = notes;
    }
    private static Comparator<WeeklyEntry> sortedWeek() {
        return (e1,e2) -> Integer.compare(e1.weeklyDays.ordinal(),e2.weeklyDays.ordinal());
    }



    @Override
    public String toString() {
        return String.format("%s - %s",this.weeklyDays,this.notes);
    }
}
