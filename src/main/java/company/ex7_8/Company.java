package company.ex7_8;

import staticClass.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

// ALT + Enter -> auto sugestie
public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    // dodawanie pracownika do listy
    // walidacja nr PESEL
    // -> len = 11
    // -> unique
    public String addEmployee(String name, String lastname, String PESEL, LocalDate birthDate, double salaryNet) {
        // sprawdzenie poprawności w długości numeru PESEL
        if (PESEL.length() == 11 && isPESELUnique(PESEL)) {
            Employee e = new Employee(
                    name, lastname, PESEL,
                    LocalDate.now(), birthDate, salaryNet
            );
            employees.add(e);
            return e.toString();
        } else if (!isPESELUnique(PESEL)) {
            return "Istnieje taki PESEL w liście pracowników";
        } else {
            return "BŁĘDNY PESEL";
        }
    }

    // metoda sprawdzająca czy PESEL podany w argumencie występuję w liście pracowników
    private boolean isPESELUnique(String PESEL) {
        for (Employee e : employees) {
            // sprawdzenie występowanie peselu
            if (e.getPESEL().equals(PESEL)) {
                return false;
            }
        }
        return true;
    }

    // metoda wyszukująca pracownika po numerze pesel
    public Employee getEmployeeByPESEL(String PESEL) {
        for (Employee e : employees) {
            if (e.getPESEL().equals(PESEL)) {
                return e;
            }
        }
        return null;
    }

    public void printAllEmployee() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("| %15s | %15s | %15s | %12s | %12s | %15.2fzł |\n",
                    employees.get(i).getName(), employees.get(i).getLastname(), employees.get(i).getPESEL(), employees.get(i).getEmplDate(), employees.get(i).getBirthDate(), employees.get(i).getSalaryNet());

        }
    }public void printAllEmployee1() {
        System.out.println("LISTA PRACOWNIKOW");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    public String changeSalaryByPESEL(double salary, String PESEL) {
        Employee employee = getEmployeeByPESEL(PESEL);
        if(employee != null) {
            // sprawdzam na jakim indexie w liscie jest pracownik
            int index = employees.indexOf(employee);
            employee.setSalaryNet(salary);
            // aktualizuje pracownika na tym samym indeksie
            employees.set(index, employee);
            return employee.toString();
        }
        return "Nie ma pracownika o takim numerze PESEL";

    }

}