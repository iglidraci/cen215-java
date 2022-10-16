import java.util.Arrays;
import java.util.Objects;

public class Course {
    private final int CAPACITY = 2;
    private final String name;
    private String[] students;
    private int studentsNumber;
    public Course(String name) {
        this.name = name;
        this.students = new String[CAPACITY];
        this.studentsNumber = 0;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return Arrays.copyOfRange(this.students, 0, studentsNumber);
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void addStudent(String studentName) {
        // check if there is space in array
        if (studentsNumber == students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        this.students[studentsNumber++] = studentName;
    }
    public boolean dropStudent(String studentName) {
        // delete a student from array
        // boolean signifies whether this student is in the array and did get deleted
        int index = getStudentIndex(studentName);
        if (index != -1){
            for (int i = index; i < getStudentsNumber()-1; i++)
                this.students[i] = this.students[i+1];
            this.studentsNumber--;
            return true;
        }
        return false;
    }

    private int getStudentIndex(String studentName) {
        // find the index of the first student with studentName
        // it's not correct but doesn't matter much
        // return -1 if it's not in the array
        int index = -1;
        for (int i = 0; i < getStudentsNumber(); i++) {
            if (this.students[i].equals(studentName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void printStudents() {
        for(String name: getStudents())
            System.out.println(name);
    }

    public void clear() {
        this.studentsNumber = 0;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}