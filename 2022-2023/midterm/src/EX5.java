public class EX5 {
    // an example of overloading
    public void greet(String greeting) {
        System.out.println("anonymous user says " + greeting);
    }
    public void greet(String greeting, String user) {
        System.out.println("user " + user + " says " + greeting);
    }
}

// example of overriding

class Bird {
    public boolean canFly() {
        return true;
    }
}

class Ostrich extends Bird {
    @Override
    public boolean canFly() {
        return false;
    }
}
