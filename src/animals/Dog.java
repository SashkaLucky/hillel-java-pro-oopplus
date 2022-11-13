package animals;

public class Dog extends Animal {
    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
    }

    @Override
    public void run() {
        if (this.getDistanceRun() > 500){
            System.out.println("Dogs can't run that far ");
            return;
        }
        System.out.printf("Dog %s is run\n ", this.getName() + " " + this.getDistanceRun() + "m");
    }

    @Override
    public void swim() {
        if (this.getDistanceSwim() <= 0)
            return;
        if (this.getDistanceSwim() > 10){
            System.out.println("Dogs can't swim that far ");
            return;
        }
        System.out.printf("Dog %s is swim\n ", this.getName() + " " + this.getDistanceSwim() + "m");
    }
}
