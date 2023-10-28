public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("CEN 215");
        Student[] students = {
                new Student(1, "Foo", "Qux"),
                new Student(2, "Bar", "Fred"),
                new Student(3, "Baz", "Thud")
        };
        for(Student student : students) {
            course.addStudent(student);
        }
        System.out.println("Course first state");
        course.printStudents();
        course.dropStudent(students[1]);
        System.out.println("After dropping");
        course.printStudents();
    }
}
