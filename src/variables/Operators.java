package variables;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        // post inkrementacja
        System.out.println(i++);
        // po wypisaniu zmienna jest inkrementowana
        System.out.println(i);

        // pre dekrementacja
        System.out.println(--j);
        // po wypisaniu
        System.out.println(j);
        // jaki wynik? i = 6 j = 3
        System.out.println((j++) * (--i + j--) + (++i));
        // 3 * (5 + 4) + 6 = 30

        //Sprawdź czy użytkownik jest pełnoletni
        // -> jeżeli jego wiek jest >=18 lat to wypisz "jesteś pełnoletni"
        //w przeciwnym razie wypisz "nie jesteś pełnoletni"
        int age;
        //Utworzenie obietku Scanner pozwalającego na wprowadzenie wartyosci do konsoli - System.in
        Scanner scaner = new Scanner(System.in);
        //użytkownik wprowadza wartość do zmiennej age typu int metodą nextInt()
        System.out.println("Wprowadź swój wiek: ");
        age = scaner.nextInt();
        System.out.println(age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły");
        // inna metoda wyświetlenia wyniku
        String isMature = age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły";
        System.out.println("Twój wiek to: " + age + " " + isMature);
        // inna metoda wyświetlenia wyniku
        System.out.printf("Twój wiek to: %d - %s\n", age, isMature);

        // Sprawdź czy użytkownik jest pełnoletni
        // Jeżeli wiek zawiera się w przedziale od 0 - 120 to sprawdzam czy jesteś dorosły
            // -> jeżeli jego wiek jest >=18 lat to wypisz "jesteś pełnoletni"
        //w przeciwnym razie
            // wypisz "nie jesteś człowiekiem"

        int age1;
        //Utworzenie obietku Scanner pozwalającego na wprowadzenie wartyosci do konsoli - System.in
        Scanner scanner = new Scanner(System.in);
        //użytkownik wprowadza wartość do zmiennej age typu int metodą nextInt()
        System.out.println("Wprowadź swój wiek: ");
        age1 = scaner.nextInt();
        //sprawdzenie czy jesteś człowiekiem
        boolean isHuman = age1 >= 0 && age1 <= 120 ? true : false;
        //sprawdzenie czy jesteś pełnoletni
        String isMature1 = age1 >= 18 ? "Jesteś dorosły" : "nie jesteś dorosły";

        System.out.println(isHuman ? isMature1 : "Robot");
        }
}
