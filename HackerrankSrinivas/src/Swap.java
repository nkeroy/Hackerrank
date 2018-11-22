import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
