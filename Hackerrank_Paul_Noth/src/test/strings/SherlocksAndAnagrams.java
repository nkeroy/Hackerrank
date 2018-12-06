package test.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlocksAndAnagrams {

	static int sherlockAndAnagrams(String s) {
        int count = 0;
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<s.length()+1;j++) {
				if (i==0 && j==s.length()) continue;
				char[] tempArr = s.substring(i,j).toCharArray();
				Arrays.sort(tempArr);
				String tempStr = String.copyValueOf(tempArr);
				if (map.containsKey(tempStr)) {
					map.put(tempStr, map.get(tempStr)+1);
				} else {
					map.put(tempStr,1);
				}
			}
		}
		//System.out.println(map.entrySet());
		
		for (String key: map.keySet())
			count+= (map.get(key)*(map.get(key)-1))/2;
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sherlockAndAnagrams("cdcd"));
		System.out.println(sherlockAndAnagrams("kkkk"));
		System.out.println(sherlockAndAnagrams("ifailuhkqq"));
		System.out.println(sherlockAndAnagrams("cdcd"));
		
	}

}
