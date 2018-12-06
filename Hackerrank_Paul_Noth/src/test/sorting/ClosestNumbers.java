package test.sorting;

import java.util.Arrays;

public class ClosestNumbers {
	
	static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        String result = "";
        int minDiff = Integer.MAX_VALUE;
        for (int i=0;i<arr.length-1;i++) {
        	/*System.out.println("Numbers to be compared: " + arr[i] + ", " + arr[i+1]);
        	System.out.println("Absolute diff: " + Math.abs(arr[i]-arr[i+1]));*/
        	if(Math.abs(arr[i]-arr[i+1])<minDiff) {
        		result="";
        		result+=arr[i] + " " + arr[i+1] + " ";
        		minDiff = Math.abs(arr[i]-arr[i+1]);
        	} else if (Math.abs(arr[i]-arr[i+1])==minDiff)
        		result+=arr[i] + " " + arr[i+1] + " "; 		
        }
        String[] temp = result.split(" ");
        int[] closestNumbers = new int[temp.length];
        for(int i=0;i<temp.length;i++)
        	closestNumbers[i] = Integer.parseInt(temp[i]);
        return closestNumbers;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = closestNumbers(new int[] {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470});
		System.out.println(Arrays.toString(arr));

	}

}
