package exercise.second;

public class Student {
    private String name;
    private boolean fullTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Student(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }
    public Student() {}
    protected double getTuition(double credits) {
        if (isFullTime())
            return 2000.;
        return 200 * credits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fullTime=" + fullTime +
                '}';
    }
}
