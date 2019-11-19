package oop;

// Klasa główna - uruchomieniowa

public class Main {
    public static void main(String[] args) {
        // utworzenie obieku
        User userOne = new User();
        // odwołanie do pola klasowego
        userOne.name = "Boguslaw";
        userOne.lastName = "Borozynski";
        userOne.gender = 'M';
        userOne.salaty_net = 15000;
        userOne.activated = true;
        // wywołanie metody
        userOne.printUser();

        User userTwo = new User("Adam","Kowalski", 'M', false, 4500);
        userTwo.printUser();

        User userThree = new User("Jan", "Kowalski", 'K', true, 7500);
        userThree.printUser();

        System.out.println("=====================================");
        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("SalaryGross = " + salaryGross);
        System.out.println("Calculated salary gross: " + userTwo.calculateSalaryGross());

        System.out.println(userThree.modifyUserParameters(6000, true));
    }


}
