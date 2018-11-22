import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		String[] result = new String[50];
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			String s = sc.next();
			for (int j=0; j<s.length(); i++) {
				if(i==0)
					result[j] = s.substring(j,j+1);
				else
					result[j] = Integer.parseInt(result[j]) + Integer.parseInt(s.substring(j,j+1)) + "";
			}
			result = processArray(result);
		}
		String output = "";
		for (int i=0; i<result.length; i++)
			output += result[i];
		System.out.println(Integer.parseInt(output));
	}
	public static String[] processArray(String[] input) {
		for(int i=input.length-1; i>0; i--) {
			if (input[i].length()>1) { //should only be of length 2 since only add one time
				input[i-1] = Integer.parseInt(input[i-1]) + Integer.parseInt(input[i].substring(0,1)) + "";
				input[i] = input[i].substring(1);
			}
		}
			return input;*/
		 BigInteger a = new BigInteger("0");
	        Scanner s = new Scanner(System.in);
	        int count = s.nextInt();
	        for (int i =0; i<count;i++)
	            a = a.add(new BigInteger(s.next()));
	        System.out.println(a.toString().substring(0,10));
	}
	

}
