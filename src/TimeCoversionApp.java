//Bai 4

public class TimeCoversionApp {
    int hours;
    int days;

    public int convertHoursToMinutes(int hours) {
        return hours * 60;
    }

    
    public int convertDaysToMinutes(int days) {
        return days * 24 * 60;
    }

    public static void main(String[] args) {
        TimeCoversionApp timeCoversionAPP = new TimeCoversionApp();
        int covertHourToMinute = timeCoversionAPP.convertHoursToMinutes(2);
        System.out.println(covertHourToMinute); // Output 120
        int covertDayToMinute = timeCoversionAPP.convertDaysToMinutes(3);
        System.out.println(covertDayToMinute);  // Output 4320

    }
}
