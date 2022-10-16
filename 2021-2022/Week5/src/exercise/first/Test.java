package exercise.first;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int personType;
        for(String arg: args) {
            personType = random.nextInt(1, 10);
            Person person = createPersonType(arg, personType);
            System.out.println(person);
        }
    }

    private static Person createPersonType(String arg, int personType) {
        // if you are creating a student, make sure it's status is FRESHMEN
        Person obj;
        switch (personType) {
            case 1:
                obj = new Student();
                break;
            case 2:
                obj = new Employee();
                break;
            case 3:
                obj = new FacultyMember();
                break;
            case 4:
                obj = new Staff();
                break;
            default:
                obj = new Person();
        }
        obj.setName(arg);
        if (obj instanceof Student)
            ((Student) obj).setStatus(Status.FRESHMAN);
        return obj;
    }
}
