package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexStart {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Podaj numer PESEL");
            final String PESEL = new Scanner(System.in).nextLine();
            // pattern to nasz wzorzec zawierajacy wyrazenia regularne
            // PESEL
            String pattern = "[0-9]{11}$";
//        boolean isMatched = Pattern.matches(pattern, "");
            if (Pattern.matches(pattern, PESEL)) {
                System.out.println("OK");
                break;
            } else {
                System.out.println("N-OK");
            }
        }
    }
}
