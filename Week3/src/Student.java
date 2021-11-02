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
        // suppose we don't need more than 10 chars for students name
        String format = String.format("%-10s ", getName());
        for(int grade: grades)
            format += String.format("%-8d ", grade);
        format += String.format("%-8.2f", getAverage());
        return format;
    }
}
