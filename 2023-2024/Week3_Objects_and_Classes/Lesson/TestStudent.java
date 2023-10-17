public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.isScienceMajor);
        System.out.println(student.age);
        student = null; // helps GC
    }
}
