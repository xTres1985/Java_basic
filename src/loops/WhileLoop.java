package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // znajdujemy sie w petli nieskonczonej dopoki nie zostanie przerwana
                // CLI
        boolean isFinished = false;
        while(isFinished != true){
                System.out.println("Witaj w naszej aplikacji");
                System.out.println("(L) - logowanie");
                System.out.println("(R) - rejestracja");
                System.out.println("(Q) - wyjscie");

                char decision = scanner.nextLine().toUpperCase().charAt(0);

                switch (decision) {
                    // case 'l':
                    case 'L':
                        System.out.println("logowanie");
                        break;
                    // case 'r':
                    case 'R':
                        System.out.println("rejestracja");
                        break;
                    // case 'q':
                    case 'Q':
                        System.out.println("wyjscie");
                        // przerwanie pętli
                        isFinished = true;
                        break;
                    default:
                        System.out.println("zły wybór");
                        break;
                }
            }
        }

    }

