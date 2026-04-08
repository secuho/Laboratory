package cooperationexample;

public class Barista {
    private String name;
    private int incentive;

    public Barista(String name, int incentive) {
        this.name = name;
        this.incentive = incentive;
    }

    public int getIncentive() {
        return this.incentive;
    }

    public String getName() {
        return this.name;
    }

    public void addIncentive() {
        this.incentive += 500;
    }



}
