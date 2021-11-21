package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsAssignment {
    public static void main(String[] args) {
        File file = new File(TestFileClass.CWD + "/data/assignment.csv");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");
            ArrayList<AssignmentData> list = new ArrayList<>();
            String firstName;
            String lastName;
            double points;
            while(scanner.hasNext()) {
                firstName = scanner.next();
                lastName = scanner.next();
                // email address is not used
                scanner.next();
                points = scanner.nextDouble();
                // assignment state is not used
                scanner.next();
                // comments are not used
                scanner.next();
                list.add(new AssignmentData(firstName, lastName, points));
            }
            for(AssignmentData data: list)
                System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class AssignmentData {
    private final String firstName;
    private final String lastName;
    private final double points;

    public AssignmentData(String firstName, String lastName, double points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPoints() {
        return points;
    }
    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t" + points;
    }
}
