package accessSpecifiers.animal;


public class Animal {
    private double speed = 36.6;

    private double getSpeed() {
        return this.speed;

//        Reptile reptile = new Reptile();
//        System.out.println(reptile.name); protected nie jest widoczny poza pakietem reptile
//        System.out.println(reptile.getName());

//        Animal animal = new Animal();
//        animal.speed;   // perivate nie jest dostępny poza pakietem animal
//        animal.getSpeed();
    }
}
