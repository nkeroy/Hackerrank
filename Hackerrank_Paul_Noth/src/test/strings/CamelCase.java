package test.strings;

public class CamelCase {
	static int camelcase(String s) {
        int wordCount = 0;
        for (int i=0; i<s.length(); i++) {
            if(i==0 || s.substring(i,i+1).toUpperCase().equals(s.substring(i,i+1))) 
                wordCount++;
        }
        return wordCount;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
