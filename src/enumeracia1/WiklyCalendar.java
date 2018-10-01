package enumeracia1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WiklyCalendar {
   private List<WiklyEntry>entries;

    public WiklyCalendar() {
        this.entries = new ArrayList<>();
    }
    public void addEntry(String weekday,String note){
        WiklyEntry entry = new WiklyEntry(weekday,note);
        this.entries.add(entry);
    }
    public Iterable<WiklyEntry> getWeklySchedule(){
        Collections.sort(entries,WiklyEntry.BY_WEEKDAY);
        return entries;
    }

    public static void main(String[] args) {
        WiklyCalendar calendar = new WiklyCalendar();
        calendar.addEntry("friday","slleping");
        calendar.addEntry("monday","sport");

        for (WiklyEntry wiklyEntry : calendar.getWeklySchedule()) {
            System.out.println(wiklyEntry);
        }
    }
}
