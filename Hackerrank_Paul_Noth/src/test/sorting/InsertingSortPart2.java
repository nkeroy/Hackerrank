package test.sorting;
import java.util.Arrays;

public class InsertingSortPart2 {

	static void insertionSort2(int n, int[] arr) {
		for (int i=1; i<arr.length; i++) {
			int query = arr[i];
			for(int j=i-1; j>=0; j--) {
				// imagine arr[i] as the query/integer to be inserted into the list
				if(arr[j]<query) {
					arr[j+1]=query;
					break;
				} else if (j!=0) {
					arr[j+1]=arr[j];
				} else {
					arr[j+1]=arr[j];
					arr[j]=query;
				}
			}
			String temp = Arrays.toString(arr);
            temp = temp.substring(1,temp.length()-1);
            temp = temp.replaceAll(",","");
            System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort2(8, new int[] {8,7,6,5,4,3,2,1});
	}
}
