package sanjayDegaonkar;

interface Maths {
	public int operation(int a, int b);
}

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths() {
			@Override
			public int operation(int a, int b) {
				return a+b;
			}
		};
		System.out.println(m.operation(1,1));
		
		Maths m1 = (int a, int b)->{
			return a+b;
		};
		
		System.out.println(m1.operation(2, 2));
		
		Maths m2 = (a,b)->a+b;
		System.out.println(m2.operation(3, 3));
		
	}

}
