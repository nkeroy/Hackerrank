package test.strings;

import java.util.LinkedList;
import java.util.List;
//hackerrank timeout for some test cases
public class WeightedUniformStrings {
	static String[] weightedUniformStrings(String s, int[] queries) {
        String alphabets = "-abcdefghijklmnopqrstuvwxyz";
        List<Integer> list = new LinkedList<Integer>();
        String[] output = new String[queries.length];
        for(int i=0;i<s.length();i++){
            if (i!=0 && s.charAt(i)==s.charAt(i-1)){
                list.add(list.get(list.size()-1) + alphabets.indexOf(s.substring(i,i+1)));
            }else {
                list.add(alphabets.indexOf(s.substring(i,i+1)));
            }
        }

        for (int i=0; i<queries.length;i++){
            if(list.contains(queries[i]))
                output[i] = "Yes";
            else
                output[i] = "No";
        }
        return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
