package animals;

public class Animal {

    private String name;
    private int distanceRun;
    private int distanceSwim;
    public  static int amount;


    public Animal(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        amount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    public void run () {
        System.out.println("Animal is running " + name + distanceRun);
    }

    public void swim(){
        System.out.println("Animal is swimming " + name + distanceSwim);
    }
}
