package pop_quiz;

public class Mallard extends Duck implements Quackable {

    protected int flyspeed;

    public Mallard(String name, int age) {
        super(name, age);
        this.flyspeed = 20;
    }

    public int getFlyspeed() {
        return flyspeed;
    }

    public void setFlyspeed(int flyspeed) {
        this.flyspeed = flyspeed;
    }

    public void getDetails() {
        System.out.println(this.getAge() + this.getName() + this.getFlyspeed());
    }

    @Override
    public void quack() {
        System.out.println("Quack, quack.");
    }
}
