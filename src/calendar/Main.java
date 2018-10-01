package calendar;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar calendar = new WeeklyCalendar();
        calendar.addWeekly("sUNDAY","sport");
        calendar.addWeekly("Monday","kur");
        calendar.addWeekly("tuesday","futball");

        for (WeeklyEntry w : calendar.weeklyEntriesSchedule()) {
            System.out.println(w);
        }
    }
}
