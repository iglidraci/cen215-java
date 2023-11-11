import java.util.Scanner;

public class CallStack {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("statement 1");
        } catch (Exception1 ex1) {
            System.out.println("process ex1");
        }
        System.out.println("Statement 2");

    }

    private static void method1() {
        try {
            method2();
            System.out.println("statement 3");
        } catch (Exception2 ex2) {
            System.out.println("process ex2");
        }
        System.out.println("statement 4");
    }

    private static void method2() {
        try {
            method3();
            System.out.println("statement 5");
        } catch (Exception3 ex3) {
            System.out.println("process ex3");
        }
        System.out.println("statement 6");
    }

    private static void method3() throws Exception1, Exception2, Exception3 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int nr = scanner.nextInt();
        switch (nr) {
            case 1:
                throw new Exception1();
            case 2:
                throw new Exception2();
            case 3:
                throw new Exception3();
        }
    }
}

// ignore the following classes, we'll learn later how to build them
class Exception1 extends RuntimeException {}

class Exception2 extends RuntimeException {}

class Exception3 extends RuntimeException {}
