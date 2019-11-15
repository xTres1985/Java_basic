package variables;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis 1 1.234";
        System.out.println("text = " + text);
        System.out.println("Pierwszy znak napisu: " + text.charAt(0));
        System.out.println("Trzeci znak napisu: " + text.charAt(2));
        System.out.println("Trzeci znak napisu: " + text.charAt(text.length() - 1));

        System.out.println("y znajduje się na indeksie: " + text.indexOf('y'));
        System.out.println("spacja znajduje się na indeksie: " + text.indexOf(' '));
        System.out.println("napis znajduje się na indeksie: " + text.indexOf("napis"));

        System.out.println("Długość napisu w zmiennej text: " + text.length());

        //Jak wydobyć i zapisać w nowej zmiennej słowo napis ze zmiennej text
        String napis = text.substring(8,13);
        System.out.println("wyindeksowany tekst: " + napis);

        String cite = "Być albo nie być!";
        String updatedCite = cite.replaceAll("ć","c");
        System.out.println(updatedCite);

        String name1 = "Ala";
        String name2 = "ala";

        System.out.println(name1.equals(name2));
        System.out.println(name1.length() > name2.length());
        System.out.println(name1.length() >= name2.length());

        String name = "Michał";
        System.out.println("Przed: " + name);
//        name.charAt(name.length() - 1) = 'l'; -> typ string jest niezmienny
        name = name.replace("ł", "l");
        System.out.println("Po: " + name);
//        name + "abc";
        name = name + "abc";
        System.out.println("Po złączeniu z abc: " + name);

        //Sprawdzenie czy napis jest palindromem
        String txt = "KAJAKI";
        System.out.println(txt);
        // utworzylismy obiekt klasy StringBuffer -> edytowalny String
        StringBuffer editableTxt = new StringBuffer(txt);
        // odwrócenie kolejności liter w napisie
        editableTxt.reverse();
        // przypisanie odwroconego napisu do zmiennej String -> nieedytowalnej
        String txtReversed = editableTxt.toString();
        System.out.println(editableTxt);

        System.out.println("Czy napis jest palindromem: " + txt.equals(editableTxt.toString()));

        //inny sposób
        for (int index = 0; index <= txt.length() - 1; index = index +1) {
            if (txt.charAt(index) != txt.charAt(txt.length() - 1 - index)){
                System.out.println("Nie jest palindromem");
                break;
            }
            System.out.println("index: " + index + " jest równy: " + (txt.length() - 1 - index));
        }

        String login = "MikiKru";

        System.out.println("modyfikacja wyświetlenia stringa: " + login.toLowerCase());
        System.out.println("String który nie może być modyfikowany: " + login);
        System.out.println(login.equals("mikikru"));
        System.out.println(login.toUpperCase().equals("mikikru".toUpperCase()));

        String sentence = "Być albo nie być oto jest pytanie:";
        // podziel zdanie na wyrazy
        //separator -> spacja
        String [] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);

    }
}
