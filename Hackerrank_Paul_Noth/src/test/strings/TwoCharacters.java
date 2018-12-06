package test.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//hackerrank timeout for some test cases
public class TwoCharacters {
	static int alternate(String s) {
        List<Character> list = new ArrayList<Character>();
        List<Character> dupList = new ArrayList<Character>();
        int max=0;
        
        for (int i=0;i<s.length();i++) {
            list.add(s.charAt(i));
            if (!dupList.contains(s.charAt(i)))
                dupList.add(s.charAt(i));
        }

        for(int i=0; i<dupList.size()-1; i++) {
            for(int j=i+1; j<dupList.size();j++) {
                Character first = dupList.get(i);
                Character second = dupList.get(j);
                List<Character> output=list.stream().filter(character -> (character==first || character==second)).collect(Collectors.toList());
                /*for (Character c : output)
                    System.out.print(c + " ");*/
                
                boolean alt = true;
                
                for(int a=0;a<Math.ceil(output.size()/2);a++) {
                    if(output.get(a)!=output.get(a+2)) {
                        alt=false;
                        break;
                    }
                }
                // if size of char list is odd
                if(output.size()%2!=0 && output.get(0)!=output.get(output.size()-1))
                    alt=false;
                
                /*System.out.print(alt);
                System.out.println("");*/

                if(alt)
                    if(output.size()>max)
                        max=output.size();
                }    
            }    
            return max;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
