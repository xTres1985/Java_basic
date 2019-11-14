package variables;

public class Variable {
    public static void main(String[] args) {
        //deklaracja -> rezerwacja miejsca w pamięci podręcznej
        //typ nazwaZmiennej;
        int age;
        // inicjalizacja -> pierwsze przypisanie wartosci
        age = 14;
        System.out.println("Wiek: " + age);
        // deklaracja + inicjalizacja
        double result = 0.01;
        System.out.println("Wynik: " + result);
        // modyfikacja wartości w zmiennej
        age = age + 5;
        age += 5;
        System.out.println("Wiek: " + age);

        final byte HOURS_IN_DAY = 24;
        final boolean DECISON;

        // HOURS_IN_DAY = 23; -> błąd
        DECISON = true;
        // DECISON = false; -> błąd



    }
}
