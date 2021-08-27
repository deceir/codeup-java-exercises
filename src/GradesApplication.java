import java.util.HashMap;
import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);

        boolean wantsToContinue = true;
        Student selectedStudent;

        do {
            System.out.println("Here are the usernames of current students: ");
            System.out.println(students.keySet());

            String userSearch = sc.nextLine();

            if (students.containsKey(userSearch)) {
                selectedStudent = students.get(userSearch);
                System.out.println("Selected user's name is: ");
                System.out.println(selectedStudent.getName());
                System.out.println(userSearch + "'s grades are: ");
                System.out.println(selectedStudent.getGrades());
                System.out.println(userSearch + " grade average is: ");
                System.out.println(selectedStudent.getGradeAverage());
            } else {
                System.out.println("There is no student with that username.");
            }

            System.out.println("Would you like to continue? (y/n)");
            String userWantsToContinue = sc.nextLine();

            if (userWantsToContinue.equalsIgnoreCase("y")) {
                wantsToContinue = true;
            } else if (userWantsToContinue.equalsIgnoreCase("n")) {
                wantsToContinue = false;
            }


        } while (wantsToContinue);


    }


}
