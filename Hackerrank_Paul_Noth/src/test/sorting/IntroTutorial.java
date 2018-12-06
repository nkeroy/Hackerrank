package test.sorting;

import java.util.Arrays;

public class IntroTutorial {
	
	static int introTutorial(int V, int[] arr) {
        int index = 0;
        int[] temp = arr;
        while(true){
            int mid = (temp.length-1)/2;
            if(temp[mid] == V){
                index += mid;
                break;
            }else if(temp[mid] < V){
                temp = Arrays.copyOfRange(temp,mid+1,temp.length);
                index += mid+1;
            }else{
                temp = Arrays.copyOfRange(temp,0,mid);
            }
        }
        return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(introTutorial(5, new int[] {1,1,2,3,5,7,10,11}));
	}

}
