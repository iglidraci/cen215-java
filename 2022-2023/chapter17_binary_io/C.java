import java.io.Serializable;

public class C implements Serializable {
    private int v1 = 1;
    private static double v2 = 2; // Variable v2 is not serialized because it is a static variable
    private transient int v3 = 3; // transient keyword to tell the JVM to ignore them when writing the object to an object stream.

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public static double getV2() {
        return v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }
}
