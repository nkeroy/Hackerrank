import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStrings {
	public static void main(String[] args) {
		List<BigInteger> s = new ArrayList<BigInteger>();
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		for(int i=0; i<counter; i++) 
			s.add(new BigInteger(sc.next()));
		Collections.sort(s);
		for (BigInteger i : s)
			System.out.println(i.toString());
	}
}