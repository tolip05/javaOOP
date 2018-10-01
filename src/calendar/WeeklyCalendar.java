package calendar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry>entry;

    public WeeklyCalendar() {
        this.entry = new ArrayList<>();
    }
    public void addWeekly(String weeklyday,String note){
        WeeklyEntry weeklyEntry = new WeeklyEntry(weeklyday,note);

        this.entry.add(weeklyEntry);
    }
    public Iterable<WeeklyEntry>weeklyEntriesSchedule(){
        Collections.sort(this.entry,WeeklyEntry.BY_WEEK);
        return this.entry;
    }
}
