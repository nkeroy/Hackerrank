package test.sorting;

import java.util.Arrays;

// one out of 4 test cases fail...

public class InsertionSortPart1 {

	
	static void insertionSort1(int n, int[] arr) {
		boolean inserted = false;
        int query = arr[n-1];
        for(int i=arr.length-2;i>=0;i--){
        	if(i==arr.length-2 && arr[i]<query) // maybe this is needed for proper result to not print a list that is already sorted including last index
                break;
        	
            if(arr[i]<query) {
                arr[i+1]=query;
                inserted=true;
            }
            else if (i!=0)
                arr[i+1]=arr[i];
            else{
                arr[i+1]=arr[i];
                arr[i]=query;  
            }
            String temp = Arrays.toString(arr);
            temp = temp.substring(1,temp.length()-1);
            temp = temp.replaceAll(",","");
            System.out.println(temp);
            if(inserted)
            	break; // to prevent printing unnecessary results with no changes in array
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort1(5,new int[] {1,3,4,6,5});
	}

}
