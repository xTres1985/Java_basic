//package exercises.company.model;
//
//import java.time.LocalDate;
//// lombok getter, setter and toString - @Data
//// @AllArgsContructor
//public class Employee {
//    private String firstName, lastName;
//    private final String pesel1;
//    private LocalDate birthDate;
//    private LocalDate employmentDate;
//    private double salary;
//
//    public Employee(String firstName, String lastName, String pesel1, LocalDate birthDate, LocalDate employmentDate, double salary) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.pesel1 = pesel1;
//        this.birthDate = birthDate;
//        this.employmentDate = employmentDate;
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee" +
//                " | " + firstName +
//                " | " + lastName +
//                " | " + pesel1 +
//                " | " + birthDate +
//                " | " + employmentDate +
//                " | " + salary + " | ";
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPesel() {
//        return pesel1;
//    }
//
//    public void setPesel1(String pesel1) {
//        this.pesel1 = pesel1
//    }
//
//    public LocalDate getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(LocalDate birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public LocalDate getEmploymentDate() {
//        return employmentDate;
//    }
//
//    public void setEmploymentDate(LocalDate employmentDate) {
//        this.employmentDate = employmentDate;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
