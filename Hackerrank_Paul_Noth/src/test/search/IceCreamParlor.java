package test.search;

import java.util.Arrays;

//there is always a unique solution for this program
public class IceCreamParlor {

	static int[] icecreamParlor(int m, int[] arr) {
		int[] flavors = null;
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr.length; j++)
				if(i!=j && arr[i]+arr[j]==m) {
					flavors = new int[] {i+1, j+1}; // because qn assumes 1-based indexing
					break;
				}
		Arrays.sort(flavors); // because the solution arrays are sorted
		return flavors;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(icecreamParlor(4, new int[]{1,4,5,3,2})));

	}

}
