package exercise.second;

import java.util.Random;

public class TestStudent {
    public static void main(String[] args) {
        Random random = new Random();
        for(String arg: args) {
            Student student = createStudentType(arg, random.nextBoolean());
            System.out.println(student);
            System.out.print("Tuition: ");
            System.out.println(student.getTuition(random.nextDouble(1, 5)));
            System.out.println("------------");
        }
    }

    private static Student createStudentType(String name, boolean fullTime) {
        if (fullTime)
            return new FullTimeStudent(name);
        return new PartTimeStudent(name);
    }
}
