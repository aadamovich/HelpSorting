package basics;

import java.time.*;

public class DateAndTimeExample {
    public static void main(String[] args) {

        // Local Time
/*        LocalTime localTime = LocalTime.now().withNano(0).withSecond(0);
        System.out.println("Now it is: " + localTime);

        System.out.println("Minutes: " + localTime.getMinute());
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0);
        localTime1 = localTime1.plusMinutes(20);
        System.out.println(localTime1);*/

        // Local date
/*        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Year - " + localDate.getYear());
        System.out.println("Day of the week " + localDate.getDayOfWeek());
        System.out.println("Day of the year " + localDate.getDayOfYear());

        LocalDate localDate1 = LocalDate.of(2019,12,11);
        System.out.println("Covid started - " + localDate1);
        LocalDate localDate2 = LocalDate.of(1986, 11,13);
        System.out.println("My birthday - " + localDate2);*/

        // Local Date Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now: " + localDateTime);

        LocalDateTime firstInternationCatDay = LocalDateTime.of(1997, Month.NOVEMBER, 12, 10, 45, 55,0);
        System.out.println("International Cat's day was started on: " + firstInternationCatDay);

        // Duration
        System.out.println(Duration.ofHours(14).toMinutes());
        System.out.println(Duration.between(firstInternationCatDay, localDateTime).toMinutes());

        // Period (can work only with localDate)
        LocalDate covidStart = LocalDate.of(2019,12,11);

        System.out.println(Period.between(covidStart, covidStart.plusDays(200)).getMonths());
    }
}
