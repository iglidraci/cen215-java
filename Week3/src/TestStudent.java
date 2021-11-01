import java.util.Arrays;
import java.util.Objects;
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
        Student[] students = new Student[studentNames.length];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(studentNames[i],
                    random.nextInt(61) + 40,
                    random.nextInt(61) + 40,
                    random.nextInt(61) + 40,
                    random.nextInt(61) + 40,
                    random.nextInt(61) + 40
                    );
        }
//        Arrays.sort(students, (x, y) -> Double.compare(x.getAverage(), y.getAverage()));
        insertionSortStudents(students);
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "", "Grade1", "Grade2", "Grade3", "Grade4", "Grade5", "Average");
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
