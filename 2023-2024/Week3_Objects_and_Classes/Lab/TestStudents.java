import javax.swing.*;
import java.util.Random;

public class TestStudents {
    public static void main(String[] args) {
        String[] studentNames = {"Foo", "Bar", "Baz"};
        final int nrGrades = Integer.parseInt(JOptionPane.showInputDialog("How many grades do you want to test?"));
        Student[] students = new Student[studentNames.length];

        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            int[] grades = new int[nrGrades];
            for (int j = 0; j < nrGrades; j++) {
                grades[j] = random.nextInt(40, 101);
            }
            students[i] = new Student(studentNames[i], grades);
        }
        insertionSortStudents(students);
        for(Student student: students)
            student.printStudent();

    }
    public static void insertionSortStudents(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            Student key = array[i];
            while(j >= 0 && array[j].getAverage() > key.getAverage()){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
