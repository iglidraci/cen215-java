public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Java");
        String[] studentNames = {"Ben", "John", "Alice", "Satoshi", "Dennis", "Guido", "GeoHotz"};
        for(String name: studentNames)
            course.addStudent(name);
        System.out.println("Course first state");
        course.printStudents();
        course.dropStudent("GeoHotz");
        course.dropStudent("Ben");
        System.out.println("After dropping GeoHotz and Ben");
        course.printStudents();
    }
}
