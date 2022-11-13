package animals;

public class Cat extends Animal {

    public Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);

    }

    @Override
    public void run() {
        if (this.getDistanceRun() > 200){
            System.out.println("Cats can't run that far ");
            return;
        }
        System.out.printf("Cat %s is run\n", this.getName());
    }

    @Override
    public void swim() {
        System.out.println("Cats can`t swim");
    }
}
