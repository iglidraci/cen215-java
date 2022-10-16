import java.util.Date;

public class ImmutableC {
    private int[] a;
    private Date d;
    public ImmutableC() {
        a = new int[] {1, 3, 4};
        d = new Date();
    }

    public int[] getA() {
        return a;
    }
    public Date getD() {
        return this.d;
    }
}
