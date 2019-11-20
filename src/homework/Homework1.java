package homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WPROWADŹ I ZATWIERDŹ ENTEREM");
        System.out.println("IMIĘ:");
        String name = scanner.nextLine();
        System.out.println("NAZWISKO:");
        String lastName = scanner.nextLine();
        System.out.println("STANOWISKO:");
        String jobTitle = scanner.nextLine();
        System.out.println("PENSJA NETTO:");
        double salaryNet = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("PŁEC:");
        String gender = scanner.nextLine();
        System.out.println("PESEL:");
        String pesel = scanner.nextLine();

        System.out.printf("imie: %s | nazwisko: %s | stanowisko %s | pensja %.2f | płeć: %c | PESEL %s\n",
                name, lastName, jobTitle, salaryNet, gender.charAt(0), pesel);





    }
}
