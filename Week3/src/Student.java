import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Student {
    private String name;
    private int[] grades;
    public Student(String name) {
        this.name = name;
        grades = new int[5];
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public void setRandomGrades() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int grade = random.nextInt(7) + 4;
            grades[i] = grade;
        }
    }
    public double getAverage() {
        int sum = Arrays.stream(this.grades).sum();
        return sum/5.;
    }
    public void printStudentInformation() {
        System.out.printf("%-15s %-10d %-10d %-10d %-10d %-10d %-10.2f %n",
                name, grades[0], grades[1], grades[2], grades[3], grades[4], getAverage());
    }
}
