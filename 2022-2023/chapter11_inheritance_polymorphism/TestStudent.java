public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "Foo");
        Course math = new Course("calculus");
        Course botany = new Course("botany");
        student.addCourse(math);
        student.addCourse(botany);
        student.addCourse(new Course("physics"));
        student.addCourse(new Course("biology"));
        student.addCourse(new Course("lambda calculus"));
        student.addCourse(new Course("abstract algebra"));
        student.printCourses();
    }
}
