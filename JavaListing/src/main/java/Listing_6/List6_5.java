package Listing_6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class List6_5 {
    private LocalDateTime fromDate;
    private DateTimeFormatter formatter;

    public List6_5(LocalDateTime anyDate) {
        fromDate = anyDate;
        formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay() {
        return fromDate.getDayOfMonth();
    }

    public int getMonth() {
        return fromDate.getMonthValue();
    }

    public int getYear() {
        return fromDate.getYear();
    }

    public int getHour() {
        return fromDate.getHour();
    }

    public int getMinute() {
        return fromDate.getMinute();
    }

    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        List6_5 datePart = new List6_5(currentDate);
        System.out.println("Day: " + datePart.getDay());
        System.out.println("Month: " + datePart.getMonth());
        System.out.println("Year: " + datePart.getYear());
        System.out.println("Hour: " + datePart.getHour());
        System.out.println("Minute: " + datePart.getMinute());
    }
}
