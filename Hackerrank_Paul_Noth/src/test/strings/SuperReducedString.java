package test.strings;

public class SuperReducedString {
	
	static String reduce(String s) {
        String temp = s;
        boolean reduced;
        
        do {
            reduced = false;
            for (int i=0; i<temp.length()-1; i++) {
                if(temp.charAt(i)==temp.charAt(i+1)) {
                    temp = temp.substring(0,i) + temp.substring(i+2);
                    reduced = true;
                    break;
                }
            }
        } while (reduced);
        if (temp.equals(""))
            return "Empty String";
        else
            return temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
