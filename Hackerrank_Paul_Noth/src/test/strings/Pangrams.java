package test.strings;

public class Pangrams {
	static String pangrams(String s) {
        String ref = "abcdefghijklmnopqrstuvwxyz";
        boolean isPangram = true;
        for (int i=0; i<ref.length(); i++) {
            if (!s.toLowerCase().contains(ref.substring(i,i+1))){
                isPangram = false;
                break;
            }
        }
        if(isPangram)
            return "pangram";
        else
            return "not pangram";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
