import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        double length = this.grades.size();

        for (int index = 0; index < this.grades.size(); index++) {
            sum += this.grades.get(index);
        }
        double result = sum / length;
        return result;
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void main(String[] args) {

        Student sam = new Student("sam");

        System.out.println(sam.getName());

        sam.addGrade(4);
        sam.addGrade(4);
        sam.addGrade(4);
        sam.addGrade(4);
        sam.addGrade(4);
        sam.addGrade(4);


        System.out.println(sam.getGrades());
        System.out.println(sam.getGradeAverage());

    }

}
