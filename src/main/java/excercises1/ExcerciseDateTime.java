package excercises1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExcerciseDateTime {
    public static void main(String[] args) {
        // znajdź dzień tygodnia w którym się urodziłeś
        LocalDate birthDate = LocalDate.of(1985, 07, 10);
        int myDayOfWeek = birthDate.getDayOfWeek().getValue();
        // Znajdz ile razy do dzis Twoje urodziny przypadały
        // w ten sam dzien tygodnia w którym się urodziłęś
        System.out.println(birthDate.getDayOfWeek().getValue());
        System.out.println(DayOfWeek.of(3));
        LocalDate actual = LocalDate.now();

        int counter = 0;
        for (birthDate.getYear(); birthDate.getYear() <= actual.getYear(); birthDate = birthDate.plusYears(1)) {
            if (myDayOfWeek == birthDate.getDayOfWeek().getValue()) {
                System.out.println(birthDate);
                counter++;
            }
        }


    }
}
