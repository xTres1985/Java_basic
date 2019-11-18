package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sencence = "Ala ma kota";
        //Ala ma kota
        //012345678910 indeksy
        //wypisz w pętli wszystkie znaki pojedynczo
        for (int i = 0; i <= sencence.length() - 1; i++) {
            if (sencence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak: %c\n", i, sencence.charAt(i));

            }
        }
        // tablica - zmienna przechowujaca zestaw wartosci uporzadkowanych po indeksach
        // indesk 0 -> 2
        // indeks 1 -> 4
        // indeks 2 -> 6
        // indeks 3 -> 8
        int numbers [] = {2,4,6,8,};
        // for ( typ pojedynczej wartosci nazwa podreczna : koleckcja wartosci
        int index = 0;
        for ( int number : numbers) {
            System.out.printf("indeks: %d wartosć: %d\n", index, number);
            index++;

        }
    }
}
