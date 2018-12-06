package test.strings;

import java.math.BigInteger;

public class SeparateTheNumbers {
	static void separateNumbers(String s) {
        int limit = (int)s.length()/2;
        int step = 1;
        boolean foundBeautiful = false;
        for(int i=step; i<=limit;i++) {
            String previous = s.substring(0,i);
            String beautiful = s.substring(0,i);
            while(beautiful.length()<s.length()) {
                previous = new BigInteger(previous).add(new BigInteger("1")).toString();
                //previous = Integer.parseInt(previous)+1+"";
                beautiful += previous.toString();
                //beautiful += previous;
            }
            if(s.equals(beautiful)){
                System.out.println("YES " + beautiful.substring(0,i));
                foundBeautiful=true;
                break;
            }
        }
        if(!foundBeautiful)
            System.out.println("NO");
    }
	
	public static void main(String[] args) {
		separateNumbers("99999100000");
		
	}
}
