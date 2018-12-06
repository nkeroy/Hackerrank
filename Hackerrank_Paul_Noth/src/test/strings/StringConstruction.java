package test.strings;

public class StringConstruction {
	static int stringConstruction(String s) {
        int cost = 0;
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<alphabets.length();i++){
            if(s.contains(alphabets.substring(i,i+1)))
                cost++;
        }
        return cost;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
