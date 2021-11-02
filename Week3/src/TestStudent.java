import javax.swing.*;
import java.util.Random;


public class TestStudent {
    public static void main(String[] args) {
        String[] studentNames = {"ambra",
                "anxhela",
                "arjani",
                "danieli",
                "denis",
                "desa",
                "igli",
                "ludi",
                "sindi",
                "tila"};
        int nrGrades = Integer.parseInt(JOptionPane.showInputDialog("How many grades do you want to test?"));
        Student[] students = new Student[studentNames.length];
        int[] grades;
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            grades = new int[nrGrades];
            for (int j = 0; j < nrGrades; j++) {
                grades[j] = random.nextInt(61) + 40;
            }
            students[i] = new Student(studentNames[i], grades);
        }
//        Arrays.sort(students, (x, y) -> Double.compare(x.getAverage(), y.getAverage()));
        insertionSortStudents(students);
        for(Student student: students)
            System.out.println(student);
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
