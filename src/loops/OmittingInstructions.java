package loops;

public class OmittingInstructions {
    public static void main(String[] args) {
        // PROGRAM WYSZUKUJĄCY OKRESLONY ZNAK W NAPISIE
        // -> JESLI ZNALEZIONO -> WYPISZ POZYCJE TEGO ZNAKU
        // -> JESLI NIE ZNALEZIONO WYPISZ STOSOWNY KOMUNIKAT
        String sentence = "Ala ma kota a kot ma Alę";
        char search = 't';
        boolean isFound = false;
        for (int i = 0; i < sentence.length() ; i++) {
            System.out.println("Iteracja nr. " + i);
            if (sentence.charAt(i) != search) {
                // pominiecie aktualnie wykonywanej iteracji i przejscie do kolejnej
                continue;
            } else if (sentence.charAt(i) == search){
                System.out.printf("Znaleziono znak %c na indeksie %d\n", sentence.charAt(i), i );
                isFound = true;
                // instrukcja przerywająca działanie pętli
                break;
            }
            System.out.println("Nic ważnego");
        }
        if (isFound == false) {
            System.out.printf("Nie znaleziono znaku %c w tekscie %s\n", search, sentence);
        }
        for ( int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
