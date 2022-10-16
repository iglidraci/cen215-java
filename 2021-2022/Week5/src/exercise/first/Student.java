package exercise.first;

/*
* (freshman, sophomore, junior, or senior
* */

public class Student extends Person {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Student(String name, String address, String phoneNumber, String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    public Student() {}

    @Override
    public String toString() {
        return "Student " + super.getName() + " " + status;
    }
}

