package KpiPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dtime=LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println("Before Formtted:"+dtime);
        DateTimeFormatter formatterobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = dtime.format(formatterobj);
        System.out.println("After Formtting:"+formattedDate);

    }
}
