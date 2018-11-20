
public class Question15 {

	public static int countOpenBracket(String s) {
		int count=0;
		for (int i=0; i<s.length();i++) {
			if(s.charAt(i)=='(')
				count++;
		}
		return count;
	}
	public static int countClosedBracket(String s) {
		int count=0;
		for (int i=0; i<s.length();i++) {
			if(s.charAt(i)==')')
				count++;
		}
		return count;
	}
	public static int solution(String s) {
		int solution = -1;
		for (int i=0; i<s.length();i++) {
			int countLeft = countOpenBracket(s.substring(0,i+1));
			int countRight = countClosedBracket(s.substring(i+1));
			if (countLeft == countRight) {
				solution = i+1;
				break;
			}
		}
		return solution;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("(())))("));
		System.out.println(solution("()()))))"));
	}
}