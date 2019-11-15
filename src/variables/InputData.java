package variables;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        // utworzenie obiektu Scanner
        Scanner scanner = new Scanner(System.in);

        // wprowadzam liczbę
        System.out.println("Wprowadz liczbę całkowitą");
        int number = scanner.nextInt(); // ENTER -> \n
        // aby skonsumować ENTER wykonujemy metodę nextLine()
        //scanner.nextLine();
        String enter = scanner.nextLine();
        // wprowadzam napis
        System.out.println("Wprowadź napis");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziłeś: %d i %s\n", number, text);
        System.out.printf("Skonsumowano: \n", enter);
        // zamknięcie połączenia
        scanner.close();
    }
}
