package test.strings;

public class BeautifulBinaryString {
	static int beautifulBinaryString(String b) {
        int count = 0;
        for (int i=0; i<b.length()-2;) {
            if(b.substring(i,i+3).equals("010")){
                count++;
                i+=3;
            } else {
                i++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
