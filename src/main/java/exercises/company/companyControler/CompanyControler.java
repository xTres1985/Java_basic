//package exercises.company.companyControler;
//
//import exercises.company.model.Employee;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//public class CompanyControler {
//    private ArrayList<Employee> employees = new ArrayList<>();
//
//    public Employee addEmployee(String firstName, String lastName, String pesel1, LocalDate birthDate, LocalDate employmentDate, double salary) {
//        Employee employee = new Employee(firstName, lastName, pesel1, birthDate, employmentDate, salary);
//        employees.add(employee);
//        return employee;
//    }
//
//    public void printAllEmployees() {
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.printf("| %3d | %15s | %15s | %15s | %12s | %12s | %15.2fzł |\n",
//                    i + 1, employees.get(i).getFirstName(), employees.get(i).getLastName(), employees.get(i).getPesel(), employees.get(i).getBirthDate(),
//                    employees.get(i).getEmploymentDate(), employees.get(i).getSalary());
//        }
//    }
//}
//
//
