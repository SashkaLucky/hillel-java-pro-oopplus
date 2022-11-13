import animals.Animal;
import animals.Cat;
import animals.Dog;


public class Main {
    public static void main(String[] args) {
        Animal demi = new Dog("Demi", 150,0);


        Animal[] animals = new Animal[] {
                demi
        };

        animalsRun(animals);
        animalsSwim(animals);
    }

    public static void animalsRun(Animal[] animals){
        for (Animal a: animals) {
            a.run();
        }
    }
    public static void animalsSwim(Animal[] animals) {
        for (Animal a : animals) {
            a.swim();
        }
    }
}
