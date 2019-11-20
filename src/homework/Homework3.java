package homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        String todayYear = today.toString().substring(0, 4);
        String todayMonth = today.toString().substring(5, 7);
        String todayDay = today.toString().substring(8, 10);
        Integer todayYearNumber = Integer.valueOf(todayYear);
        Integer todayMonthNumber = Integer.valueOf(todayMonth);
        Integer todayDayNumber = Integer.valueOf(todayDay);

        System.out.println(todayDayNumber);
        System.out.println(todayMonth);
        System.out.println(todayYear);
        System.out.println("Wprowadz date: ");
        String dateOfBirth = scanner.nextLine();
        String yearOfBirth = dateOfBirth.substring(0, 4);
        String monthOfBirth = dateOfBirth.toString().substring(5, 7);
        String dayOfBirth = dateOfBirth.toString().substring(8, 10);
        Integer yearOfBirthNumber = Integer.valueOf(yearOfBirth);
        Integer monthOfBirthNumber = Integer.valueOf(monthOfBirth);
        Integer dayOfBirthNumber = Integer.valueOf(dayOfBirth);
        


        if (todayMonthNumber > monthOfBirthNumber) {
            System.out.println(todayYearNumber - yearOfBirthNumber);
        } else {
            if (todayMonthNumber == monthOfBirthNumber && todayDayNumber < dayOfBirthNumber) {
                System.out.println(todayYearNumber - yearOfBirthNumber - 1);
            } else {
                System.out.println(todayYearNumber - yearOfBirthNumber);
            }
    }
    }
}

//        System.out.println("Twój wiek to:");
//        System.out.println(todayYearNumber - yearOfBirthNumber);


