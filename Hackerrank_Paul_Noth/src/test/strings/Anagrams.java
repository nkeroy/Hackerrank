package test.strings;
// hackerrank: terminated due to time out for some time cases
public class Anagrams {
	static int anagram(String s) {
        if(s.length()%2!=0)
            return -1;
        else {
            int count = 0;
            String s1 = s.substring(0,s.length()/2); 
            String s2 = s.substring(s.length()/2);
           
            for (int i=0; i<s1.length(); i++){
                if(!s2.contains(s1.substring(i,i+1)))
                    count++;
                else
                    s2=s2.replaceFirst(s1.substring(i,i+1), "-");
            }
            return count;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
