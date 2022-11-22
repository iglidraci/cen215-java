public class Student {
    private int id;
    private String name;
    private int nrOfCourses;
    private Course[] registeredCourses;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new Course[5];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addCourse(Course course) {
        if (nrOfCourses < 5) {
            this.registeredCourses[nrOfCourses] = course;
            nrOfCourses++;
        } else {
            System.out.println("You cannot register anymore courses");
        }
    }
    public Course[] getRegisteredCourses() {
        return this.registeredCourses;
    }
    public void printCourses() {
        for(Course course : this.registeredCourses)
            if (course != null) System.out.println(course.getName());
    }
}
