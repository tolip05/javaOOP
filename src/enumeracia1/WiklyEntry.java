package enumeracia1;

import java.util.Comparator;

public class WiklyEntry {
    public final static Comparator<WiklyEntry>BY_WEEKDAY = getComparatorByWeekday();


    private Weekday wekday;
    private String note;

    public WiklyEntry(String wekday, String note) {


        this.wekday = Weekday.valueOf(Weekday.class,wekday.toUpperCase());
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.wekday,this.note);
    }
    private static Comparator<WiklyEntry> getComparatorByWeekday() {
        return (e1,e2) -> Integer.compare(e1.wekday.ordinal(),e2.wekday.ordinal());
    }
}
