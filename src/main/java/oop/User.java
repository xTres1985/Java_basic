package oop;
// ALT + INS -> GENERATE
public class User {
    // pola -> zmienne i Obiekty
    String name;
    String lastName;
    char gender;
    boolean activated;
    double salaty_net;
    // konstrutor -> metoda która jest wywoływana podczas tworzenia obiektu
    public User() { }

    public User(String name, String lastName, char gender, boolean activated, double salaty_net) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.activated = activated;
        this.salaty_net = salaty_net;
    }

    // metoda bezargumentowa nie zwracajaca żadnej wartości -> 'typu void'
    void printUser() {
        System.out.printf(
                "|%10s|%10s|%3c|%6b|%8.2fzł|\n",
                this.name, this.lastName, this.gender, this.activated, this.salaty_net);
        // this.name wskazuje na obiekt globalny w klasie
    }
    // metoda zwracająca wartość
    double calculateSalaryGross() {
        double salaryGross = salaty_net *1.23;
        return salaryGross;
    }
    String modifyUserParameters(double salaty_net, boolean activated) {
        this.salaty_net = salaty_net;
        this.activated = activated;
        return String.format("|%10s|%10s|%3c|%6b|%8.2fzł|\n",
        this.name, this.lastName, this.gender, this.activated, this.salaty_net);

    }

}
