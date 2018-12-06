package test.strings;

public class TheLoveLetterMystery {
	static int theLoveLetterMystery(String s) {
        int count = 0;
        for (int i=0; i<s.length()/2; i++){
            int value = Character.compare(s.charAt(i), s.charAt(s.length()-i-1));
            if (value!=0)
                count += Math.abs(value);;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
