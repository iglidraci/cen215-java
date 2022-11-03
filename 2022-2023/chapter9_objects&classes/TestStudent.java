public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student's name: " + student.name);
        System.out.println("Student's age: " + student.age);
        System.out.println("Student's gender: " + student.gender);
        System.out.println("Is student major science: " + student.isScienceMajor);
        /*What do you think it will happen?*/
        // System.out.println(student.name.length());
    }
}

