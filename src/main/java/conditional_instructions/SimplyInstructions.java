package conditional_instructions;

import java.util.Scanner;

public class SimplyInstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź swój wiek: ");
        int age = scanner.nextInt();
        String enter = scanner.nextLine();

        if(age >= 0 && age <= 120) {
            // jestem człowiekiem
            System.out.println("CZŁOWIEK - sprawdzam dalej");
            if (age >= 18) {
                System.out.println("Człowiek dorosły");
            } else {
                System.out.println("Dziecko");
            }
        } else {
            System.out.println("ROBOT"); }


            // SPRAWDŹ CZY LICZBA PODANA PRZEZ UŻYTKOWNIKA JEST PARZYSTA
            // jeśli tak wypisz parzysta
            // jeżeli nie wypisz nieparzysta
            // jeżeli zero wypisz zero

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Wprowadź liczbę: ");
            int number = scanner1.nextInt();
            String enter1 = scanner1.nextLine();

            if(number == 0 ) {
                System.out.println("ZERO");
            }
                else {
                    if(number % 2 == 0)
                        System.out.println("PARZYSTA");
                        else
                        System.out.println("NIEPARZYSTA");
                    }
                }
            }
