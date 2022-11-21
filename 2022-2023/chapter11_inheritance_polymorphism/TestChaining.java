public class TestChaining {
    public static void main(String[] args) {
        new BB(5);
    }
}

class AA {
    public AA() {
        this( false );
        System.out.println("AA constructor says nothing");
    }

    public AA(boolean someFlag) {
        System.out.println("AA constructor says " + someFlag);
    }
}

class BB extends AA {
    public BB() {
        System.out.println("BB constructor says nothing");
    }

    public BB( boolean someFlag ) {
        super( someFlag );
        System.out.println("BB constructor says " + someFlag);
    }

    public BB ( int someNumber ) {
        this();
        System.out.println("BB constructor says " + someNumber);
    }
}
