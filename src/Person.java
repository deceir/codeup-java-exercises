import java.util.Scanner;

public class Person {

    private String name;


    public Person(String firstName) {
        this.setName(firstName);

    }



    public static void main(String[] args) {

        // If Object is set as another Object, changing one changes the other.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

    // accessors


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name);
    }
}
