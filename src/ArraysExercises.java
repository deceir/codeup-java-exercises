import java.util.Arrays;
public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person person) {

        Person[] newPerson = Arrays.copyOf(array, array.length + 1);
        newPerson[newPerson.length - 1] = person;
        return newPerson;
    }

    public static void main(String[] args) {

        Person[] arrayOfPeople = {new Person("Jon"), new Person("Ron"), new Person("Bob")};

        for (Person person : arrayOfPeople) {
            System.out.println(person.getName());
        }



        for (Person person : addPerson(arrayOfPeople, new Person("Ronny"))) {
            System.out.println(person.getName());
        }

    }
}