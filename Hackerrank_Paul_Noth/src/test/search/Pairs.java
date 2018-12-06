package test.search;

import java.util.Arrays;

public class Pairs {

	static int pairs(int k, int[] arr) {
		int count = 0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]-arr[j]==k) {
					count++;
					break;
				} else if (arr[j]-arr[i] >k)
					break;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
