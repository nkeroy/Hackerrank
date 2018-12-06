package test.strings;

import java.util.HashMap;
import java.util.Map;
// wrong answer
public class MakingAnagrams {
	static int makingAnagrams(String s1, String s2) {
		int differenceInLength = Math.abs(s1.length()-s2.length());
        int count = 0;
        int duplicateCount = 0;
        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();
        
        for(int i=0; i<s1.length();i++){
            if(map1.containsKey(s1.charAt(i)))
                map1.replace(s1.charAt(i), map1.get(s1.charAt(i))+1);
            else
                map1.put(s1.charAt(i),1);
        }

        for(int i=0; i<s2.length();i++){
            if(map2.containsKey(s2.charAt(i)))
                map2.replace(s2.charAt(i), map2.get(s2.charAt(i))+1);
            else
                map2.put(s2.charAt(i),1);
        }

        if(s1.length()>= s2.length()){
            for (Character c: map2.keySet()) {
            if(map1.containsKey(c))
                duplicateCount+=Math.abs(map1.get(c)-map2.get(c));
            else
                count+=map2.get(c)*2;
        }
        }else{
            for (Character c: map1.keySet()) {
            if(map2.containsKey(c))
                duplicateCount+=Math.abs(map2.get(c)-map1.get(c));
            else
                count+=map1.get(c)*2;
        }
        }
        if(duplicateCount > differenceInLength) {
        	duplicateCount -= differenceInLength;
        	count+= duplicateCount*2;
        }else {
        	// fill this in
        	differenceInLength -= duplicateCount; //...
        	count+= differenceInLength;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makingAnagrams("ccdd","aabb"));
	}

}
