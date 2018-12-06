package test.strings;

public class FunnyString {
	static String funnyString(String s) {
        int[] array = new int[s.length()-1];
        for (int i=0; i<s.length()-1; i++)
            array[i] = Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        for (int i=0; i<array.length/2; i++) {
            if(array[i] != array[array.length-1-i])
                return "Not Funny";
        }
        return "Funny";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
