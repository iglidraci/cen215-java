import java.util.Arrays;

public class Course {
    private static final int DEFAULT_CAPACITY = 2;
    private final String code;
    private Student[] students;
    private int studentsNumber;
    public Course(String code) {
        this(code, DEFAULT_CAPACITY);
    }

    public Course(String code, int capacity) {
        this.code = code;
        this.students = new Student[capacity];
        this.studentsNumber = 0;
    }

    public String getCode() {
        return code;
    }

    public Student[] getStudents() {
        return Arrays.copyOfRange(this.students, 0, studentsNumber);
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void addStudent(Student student) {
        // check if there is space in array
        if (studentsNumber == students.length){
            Student[] temp = new Student[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        this.students[studentsNumber++] = student;
    }
    public boolean dropStudent(Student student) {
        // delete a student from array
        // boolean signifies whether this student is in the array and did get deleted
        int index = getStudentIndex(student);
        if (index != -1){
            for (int i = index; i < getStudentsNumber()-1; i++)
                this.students[i] = this.students[i+1];
            this.studentsNumber--;
            return true;
        }
        return false;
    }

    private int getStudentIndex(Student student) {
        // find the index of the first student with studentName
        // it's not correct but doesn't matter much
        // return -1 if it's not in the array
        int index = -1;
        for (int i = 0; i < getStudentsNumber(); i++) {
            if (this.students[i].getId() == student.getId()) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void printStudents() {
        for(Student student : getStudents())
            System.out.println(student);
    }

    public void clear() {
        this.studentsNumber = 0;
    }

    public String toString() {
        return "Course{" +
                "name='" + code + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}