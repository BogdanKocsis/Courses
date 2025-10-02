

public class DaysOfTheWeek {
    private enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        DayOfWeek theDay = DayOfWeek.SATURDAY;

        if(!isWeekday(theDay)){
            System.out.println("It's a week day!");
        } else {
            System.out.println("Yay! It's the weekend");
        }
    }

    public static boolean isWeekday(DayOfWeek day){
        return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
    }
}
