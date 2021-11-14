package exercise.second;

public class PartTimeStudent extends Student {
    public PartTimeStudent(String name) {
        super(name, false);
    }
    public double getTuition(double credit) {
        return super.getTuition(credit);
    }
}
