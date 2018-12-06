package test.sorting;

public class CountingSort1 {

	static int[] countingSort(int[] arr) {
        int[] index = new int[100];
        for(int i=0;i<arr.length;i++)
            index[arr[i]] ++;
        return index;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
