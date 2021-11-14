package exercise.second;

public class FullTimeStudent extends Student {
    public FullTimeStudent(String name) {
        super(name, true);
    }
    public double getTuition() {
        return super.getTuition(0);
    }
}
