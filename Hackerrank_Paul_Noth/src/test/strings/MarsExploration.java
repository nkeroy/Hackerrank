package test.strings;

public class MarsExploration {
	static int marsExploration(String s) {
        int count = 0;
        for (int i=0; i<s.length(); i+=3) {
            if (!s.substring(i,i+3).equals("SOS"))
                for (int j=0; j<3;j++){
                    if((j==0 && s.substring(i,i+3).charAt(j)!='S')|
                        (j==1 && s.substring(i,i+3).charAt(j)!='O')|
                        (j==2 && s.substring(i,i+3).charAt(j)!='S'))
                        count++;
                }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
