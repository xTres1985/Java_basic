package excercises1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decicion = ' ';
        while (decicion != 'Q') {
        System.out.println("(S)prawdź imię");
        System.out.println("(P)olicz znaki i znaki białe");
        System.out.println("(C)alculator");
        System.out.println("Q - zakończ");

        String name;
        decicion = scanner.nextLine().toUpperCase().charAt(0);

            switch (decicion) {
                case 'S':
                    System.out.println("Podaj imie:");
                    name = scanner.nextLine();
                    if (name.charAt(name.length() - 1) == 'a') {
                        System.out.println("Imię żeńskie");
                        break;
                    } else {
                        System.out.println("Imię męskie");
                        break;
                    }
                case 'P':
                    int whiteSign = 0;
                    System.out.println("Wprowadź zdanie");
                    String sentence = scanner.nextLine();
                    for (int i = 0; i < sentence.length(); i++) {
                        if (sentence.charAt(i) == ' ') {
                            whiteSign++;
                        }
                        System.out.println("Wszystkie znaki razem: " + i);
                        System.out.println("Wszystkie znaki białem razem: " + whiteSign);
                    }

                case 'C':
                    char operation = ' ';
                    while(true) {
                        System.out.println("Wybierz działanie: + - * / lub (Z)akończ");
                        operation = scanner.nextLine().charAt(0);
                        if(operation == 'Z'){
                            break;
                        }
                        System.out.println("Wprowadź liczbę: ");
                        double firstNumber = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Wprowadź drugą liczbę");
                        double secondNumber = scanner.nextDouble();
                        scanner.nextLine();

                        switch (operation) {
                            case '+':
                                System.out.println(firstNumber + secondNumber);
                                break;
                            case '-':
                                System.out.println(firstNumber - secondNumber);
                                break;
                            case '*':
                                System.out.println(firstNumber * secondNumber);
                                break;
                            case '/':
                                System.out.println(firstNumber / secondNumber);
                                break;
                            case 'Z':
                                System.out.println("Zakończ");
                                break;
                            default:
                                System.out.println("Błędny wybór");
                                break;
                        }
                    }
                    break;

                case 'Q':
                    System.out.println("Do zobaczenia!");
            }
        }
    }
}
