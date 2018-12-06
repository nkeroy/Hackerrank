package test.search;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
//one test case failed, no idea
public class MissingNumbers {

	static int[] missingNumbers(int[] arr, int[] brr) {
		int[] missingNumbers = new int[brr.length - arr.length];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int index = 0; // increase this index as missing numbers added into above array

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		for (int i = 0; i < brr.length; i++) {
			if (map.containsKey(brr[i]) && map.get(brr[i]) >= 1)
				map.put(brr[i], map.get(brr[i]) - 1);
			else {
				missingNumbers[index++] = brr[i];
				//System.out.println(brr[i]);
			}
		}
		Arrays.sort(missingNumbers);
		return missingNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println(Arrays.toString(missingNumbers(new int[] { 888 },

						new int[] { 666,777,888,999,888 })));

	}

}
