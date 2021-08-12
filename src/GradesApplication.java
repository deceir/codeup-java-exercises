import java.util.HashMap;

public class GradesApplication {




    public static void main(String[] args) {


        HashMap <String, Student> students = new HashMap<>();

        Student john = new Student("John");

        john.addGrade(4);
        john.addGrade(6);
        john.addGrade(9);

        Student bob = new Student("Bob");

        bob.addGrade(4);
        bob.addGrade(6);
        bob.addGrade(9);

        Student tom = new Student("Tom");

        tom.addGrade(4);
        tom.addGrade(6);
        tom.addGrade(9);

        Student billy = new Student("Billy");

        billy.addGrade(4);
        billy.addGrade(6);
        billy.addGrade(9);


        students.put("itsjohnnyyy", john);
        students.put("bigbob43", bob);
        students.put("tommythecat1", tom);
        students.put("billyray33", billy);


        System.out.println(students);

    }


}
