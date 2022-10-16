package exercise.second;

import java.util.Random;

public class TestStudent {
    private static final Random random = new Random();
    public static void main(String[] args) {
        for(String arg: args) {
            Student student = createStudentType(arg, random.nextBoolean());
            System.out.println(student);
            System.out.print("Tuition: ");
            System.out.println(student.getTuition());
            System.out.println("------------");
        }
    }

    private static Student createStudentType(String name, boolean fullTime) {
        Random random = new Random();
        if (fullTime)
            return new FullTimeStudent(name);
        return new PartTimeStudent(name, random.nextDouble(1, 5));
    }
}
