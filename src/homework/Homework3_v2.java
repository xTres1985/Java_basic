package homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Homework3_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        String todayYear = today.toString().substring(0, 4);
        String todayMonth = today.toString().substring(5, 7);
        String todayDay = today.toString().substring(8, 10);
        Integer todayYearNumber = Integer.valueOf(todayYear);
        Integer todayMonthNumber = Integer.valueOf(todayMonth);
        Integer todayDayNumber = Integer.valueOf(todayDay);


    }
}
