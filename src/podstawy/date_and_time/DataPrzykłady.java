package podstawy.date_and_time;

import java.time.LocalDate;
import java.time.Month;

public class DataPrzykłady {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(1989, Month.JANUARY, 18);
        System.out.println(localDate1);
        convertDate("2021.09.12");
    }

    /**
     * 2021.09.12 => 2021-9-12
     */
    private static void convertDate(String date){
        String[] dateArray = date.split("[.]");
        int year = Integer.valueOf(dateArray[0]);
        int month = Integer.valueOf(dateArray[1]);
        int day = Integer.valueOf(dateArray[2]);
        System.out.println(LocalDate.of(year, month, day));
    }
}
