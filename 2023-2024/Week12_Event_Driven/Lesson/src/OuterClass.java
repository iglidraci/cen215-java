
public class OuterClass {
	
	private int a;

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		inner.print1();
		inner.print2();
	}
	
	class InnerClass {
		private int a = 1;
		void print1() {
			System.out.println(a);
		}
		
		void print2() {
			System.out.println(OuterClass.this.a);
		}
	}

}
