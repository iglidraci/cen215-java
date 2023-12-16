
public class TestLambda {
	public static void main(String[] args) {
		TestLambda test = new TestLambda();
		test.onAction1(() -> {
			System.out.println("Action 1");
		});

        test.onAction1(new T1() {
            @Override
            public void m1() {
                System.out.println("Action 1");
            }
        });
		
		test.onAction2(x -> System.out.println(x));
		System.out.println(test.onAction3((x, y) -> x * y));
        System.out.println(test.onAction3((x, y) -> x + y));
	}
	
	public void onAction1(T1 t) {
		t.m1();
	}
	public void onAction2(T2 t) {
		t.m2(2.5);
	}
	
	public int onAction3(T3 t) {
		return t.m3(3, 2);
	}
}

// The annotation @FunctionalInterface tells the compiler that the interface is a Single Abstract Method interface
@FunctionalInterface
interface T1 {
	void m1();
}

@FunctionalInterface
interface T2 {
	void m2(double d);
}

@FunctionalInterface
interface T3 {
	int m3(int a, int b);
}