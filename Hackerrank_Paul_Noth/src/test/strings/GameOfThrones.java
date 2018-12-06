package test.strings;

import java.util.Arrays;

public class GameOfThrones {
	static String gameOfThrones(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        int odd = 0;
        int count = 1;
        for (int i=0; i<array.length-1; i++) {
            if(array[i]==array[i+1]) {
                count++;
            } else {
                if(count%2!=0)
                    odd++;
                count = 1;
                //account for last element by adding
                if (i==array.length-1)
                    odd++;
            }
            if((array.length%2==0 && odd>0) || (array.length%2!=0 && odd>1))
                return "NO";
        }
        return "YES";
    }
	public static void main(String[] args) {
		
	}
}
