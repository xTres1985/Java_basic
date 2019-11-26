package exercises;

import exercises.controller.AutoController;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

// Command Line Interface
public class Main {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        // dodanie 3 aut do zamówienia
        ac.addAuto("VW", "Passat", Engine.v2_0, Fuel.diesel, 120000);
        ac.addAuto("VW", "Golf", Engine.v3_0, Fuel.gasoline, 90000);
        ac.addAuto("VW", "Lupo", Engine.v1_5, Fuel.diesel, 70000);
        // wypisz listę aut
        ac.printAllAutos();
        // usuń auto
        System.out.println("Usunięto: " + ac.deleteAutoById(2));
        ac.printAllAutos();
        // daj rabat 10% dla auta 1
        System.out.println("obniżona cena " + ac.discountAutoById(1, 10));
        // podnieś cenę wszystkich aut o 5%

        ac.changeAllAutosPrice(false, 5);
        ac.printAllAutos();

        // dodajemy GUI użytkownika
        Scanner scanner = new Scanner((System.in));
        int decidion = ' ';
        // iterujemy dopóki nie wybrano Q
        while (decidion != 'Q') {
            System.out.println("PANEL FABRYKI AUT");
            System.out.println("(Z) - zamów auto");
            System.out.println("(P) - pokaż listę zamówionych aut");
            System.out.println("(U) - usuń auto");
            System.out.println("(R) - daj rabat na auto");
            System.out.println("(C) - zmień canę wszustkich aut");
            System.out.println("(Q) - wyjście z menu");
            decidion = scanner.nextLine().toUpperCase().charAt(0);
            switch (decidion) {
                case 'Z':
                    System.out.println("Wprowadź markę:");
                    String brand = scanner.nextLine();
                    System.out.println("Wprowadź model: ");
                    String model = scanner.nextLine();
                    Engine engine = Engine.v1_5;
                    int engineVersion = ' ';
                    System.out.println("Wprowadz wersje silnika: v1_5; v1_9; v2_0; v3_0");
                    System.out.println("(A) - v1.5");
                    System.out.println("(B) - v1.9");
                    System.out.println("(C) - v2.0");
                    System.out.println("(D) - v3.0");
                    engineVersion = scanner.nextLine().toUpperCase().charAt(0);
                    switch (engineVersion) {
                        case 'A':
                            engine = Engine.v1_5;
                            break;
                        case 'B':
                            engine = Engine.v1_9;
                            break;
                        case 'C':
                            engine = Engine.v2_0;
                            break;
                        case 'D':
                            engine = Engine.v3_0;
                            break;
                        default:
                            System.out.println("Błędny wybór");
                    }
                    Fuel fuel = Fuel.gasoline;
                    int fuelType = ' ';
                    System.out.println("Rodzaj Paliwa:");
                    System.out.println("Gasoline");
                    System.out.println("Diesel");
                    System.out.println("Hybrid");
                    fuelType = scanner.nextLine().toUpperCase().charAt(0);
                    switch (fuelType) {
                        case 'G':
                            fuel = Fuel.gasoline;
                            break;
                        case 'D':
                            fuel = Fuel.diesel;
                            break;
                        case 'H':
                            fuel = Fuel.hybrid;
                            break;
                        default:
                            System.out.println("Błędny wybór");
                    }
                    System.out.println("Wprowadź cenę: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Dodano: " + ac.addAuto(brand, model, engine, fuel, price));
                    break;
                case 'P':
                    ac.printAllAutos();
                    break;
                case 'U':
                    System.out.println("Podaj ID auta które chcesz usunąć: ");
                    ac.printAllAutos();
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Usunięto: " + ac.deleteAutoById(id));
                    break;
                case 'R':
                    System.out.println("Wprowadz id przecenianego auta oraz %");
                    ac.printAllAutos();
                    System.out.println("Auto: " + ac.discountAutoById(scanner.nextInt(), scanner.nextInt()) + "ma nową cenę");
                    scanner.nextLine();
                    break;
                case 'C':
                    System.out.println("(+) - podnieś cenę");
                    System.out.println("( ) - obniż cenę");
                    boolean isDiscounted = scanner.nextLine().isEmpty();
                    System.out.println("Wprowadź %");
                    ac.changeAllAutosPrice(isDiscounted, scanner.nextInt());
                    ac.printAllAutos();
                    scanner.nextLine();
                    break;
                case 'Q':
                    System.out.println("Do zobaczenia!");
                    break;
                default:
                    System.out.println("Błędny wybór");
            }

        }
    }
}
