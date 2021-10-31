import java.util.Arrays;

public class Student {
    private int[] grades;
    private String name;

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(){}
    public Student(String name, int... grades) {
        this.name = name;
        this.grades = grades;
    }
    public double getAverage() {
        double sum = 0;
        for (int grade: grades)
            sum += grade;
        return sum/grades.length;
//        return (double)Arrays.stream(grades).sum()/ grades.length;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20d %-20d %-20d %-20d %-20d %-20.2f",
                getName(), getGrades()[0], getGrades()[1],
                getGrades()[2], getGrades()[3], getGrades()[4],
                getAverage());
    }
}
