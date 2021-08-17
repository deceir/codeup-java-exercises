package pop_quiz;

public class Duck {

    protected String name;
    protected int age;

    public Duck(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("You cannot leave this blank");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
