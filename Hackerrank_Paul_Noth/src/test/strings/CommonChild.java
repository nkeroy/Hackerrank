package test.strings;

import java.util.ArrayList;
import java.util.List;

public class CommonChild {

	// can pass test cases but time too long

	static int commonChild(String s1, String s2) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < s1.length(); i++) {
			List<String> temp1 = new ArrayList<String>();
			List<String> temp2 = new ArrayList<String>();
			// for reducing time later on
			if (s2.contains(s1.substring(i, i + 1))) {
				for (String s : list1)
					temp1.add(s + s1.substring(i, i + 1) + "(.*)");
				list1.addAll(temp1);
				list1.add("(.*)" + s1.substring(i, i + 1) + "(.*)");
			}
		}
		int max = 0;
		String maxString = "";
		for (String s : list1) {
			
			// use regex
			if (s2.matches(s)) {
				String temp = s.replace("(.*)", "");
				if (temp.length() > max) {
					maxString = temp;
					max = temp.length();
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000);
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(commonChild("HARRY", "SALLY"));
		// System.out.println(commonChild("SHINCHAN", "NOHARAAA"));
		//System.out.println(commonChild("DJIFJIENKVNUOEJVJNERJVNOWNJVBURNVWLJNVJONOWENVONWONVJOENUVBHYRBVURNGFJEKFJJWNQONCOJENVJOBEHBVBRVNNWKVNURBHBVRLVNWKNJVBBRVLJKWNIOVNRJBVUBRIBVUWJVONKRNOWVBUOBRVNKWMKDJKFJKDSKJFIOOJDPFJAKLNVUNRUNV", "JHGIRHNVNWONVOKNKNDKONVJNIBRUWUIOVNEWNIVNIONEIONWIOVNWUNVUTRNOWJINWVNENVINRJNJFNLDNVJNFJNVNROENVIENVNROENVORENJVBJRVNLWNWVJKDNVJNJGNRIJGIRWNPFJWPIJEGKFJNFDJNVNREJGVNGJIERVNJRENVNEWHVODNVIONRNIWNOVUNDFKLNVHGTNVPIAHNVUIONDFOKVNJRNJAJNVDSKNVJNRNVLANDJNFUOFRBVNLSNJDBVNJRNVJNSKNDJVNIPRJOVJSPVNJNRIPVJIWNVJNDFKVBUDSJVONRNVWVDSNJVNDSOIVNIDSBVURLKVNMNVPNDJSNVKLDNSJVNIORNBWVNKDLNVDSHIVNLRLN"));
	}

}
