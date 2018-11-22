import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDuplicates(new int[] {1,3,1,4,5,3,5,2,5,6,3,2,4,4,2,2,3,2,3,2,3,4,5,5,4,3,1,2,3,4,4,3,4,34}));

	}
	
	public static int countDuplicates(int[] numbers) {
		
		ArrayList counted = new ArrayList();
		ArrayList duplicates = new ArrayList();
		int count = 0;
		for (int i=0; i<numbers.length;i++) {
			if(duplicates.contains(numbers[i])) {
				if(!counted.contains(numbers[i]))
					count++;
					counted.add(numbers[i]);
			} else {
				duplicates.add(numbers[i]);
			}
		}
		return count;
	}

}
