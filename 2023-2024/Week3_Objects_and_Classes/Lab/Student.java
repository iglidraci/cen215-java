public class Student {

    private int[] grades;
    private String name;

    public Student(String name) {
        this(name, new int[6]);
    }
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
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

    public double getAverage() {
        double sum = 0;
        for (int grade: grades)
            sum += grade;
        return sum/grades.length;
    }

    public void printStudent() {
        // suppose we don't need more than 10 chars for students name
        String line = String.format("%-10s ", getName());
        for(int grade: grades)
            line += String.format("%-8d ", grade);
        line += String.format("%-8.2f", getAverage());
        System.out.println(line);
    }
}