public class MyStringBuilder {
    private static final int DEFAULT_CAPACITY = 16;
    private char[] buffer;
    private int length;

    public MyStringBuilder() {
        buffer = new char[DEFAULT_CAPACITY];
    }

    public MyStringBuilder(String s) {
        buffer = new char[s.length()*2];
        System.arraycopy(s.toCharArray(), 0, buffer, 0, s.length());
        length = s.length();
    }

    public MyStringBuilder append(MyStringBuilder s) {
        int newLength = length + s.length;
        if(newLength > buffer.length)
            resize(newLength*2);
        System.arraycopy(s.buffer, 0, this.buffer, this.length, s.length);
        this.length = newLength;
        return this;
    }

    private void resize(int size) {
        char[] temp = new char[size];
        System.arraycopy(this.buffer, 0, temp, 0, this.length);
        this.buffer = temp;
    }

    public char charAt(int i) {
        if(i >= 0 && i < length)
            return buffer[i];
        return '\u0000';
    }
    public int length() {
        return this.length;
    }

    public MyStringBuilder toLowerCase() {
        for (int i = 0; i < length; i++) {
            this.buffer[i] = Character.toLowerCase(this.buffer[i]);
        }
        return this;
    }

    public String substring(int begin, int end) {
        if((begin >= end) || (begin < 0) || (end > length)) return "";
        char[] temp = new char[end - begin];
        System.arraycopy(this.buffer, begin, temp, 0, temp.length);
        return String.valueOf(temp);
    }

    public String toString() {
        char[] chars = new char[length];
        System.arraycopy(this.buffer, 0, chars, 0, length);
        return String.valueOf(chars);
    }

}
