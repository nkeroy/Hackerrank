import java.lang.Math;

//20minutes
public class Question8 {
	public static int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length-1; i++) {
			int temp = A[i];
			if(Math.abs(temp) < min)
				min = Math.abs(temp);
			for (int j = i+1; j<A.length; j++) {
				temp += A[j];
				if(Math.abs(temp) < min) {
					min = Math.abs(temp);
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] {2,-4,6,-3,9};
		System.out.println(solution(input));
	}
}