package homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
//        System.out.println(today);
        String todayYear = today.toString().substring(0,4);
//        System.out.println(todayYear);
        Integer todayYearNumber = Integer.valueOf(todayYear);
//        System.out.println(todayYearNumber);
        System.out.println("Wprowadz date: ");
        String dateOfBirth = scanner.nextLine();
        String yearOfBirth = dateOfBirth.substring(0,4);
        System.out.println(yearOfBirth);
        Integer yearOfBirthNumber = Integer.valueOf(yearOfBirth);
        System.out.println("Twój wiek to:");
        System.out.println(todayYearNumber - yearOfBirthNumber);
//
    }

}
