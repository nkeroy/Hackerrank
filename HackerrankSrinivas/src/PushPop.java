import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PushPop {

	static List<Integer> list = new ArrayList<Integer>();
	static String[] operations;
	static int[] products;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numberOfOperations = s.nextInt();
		operations = new String[numberOfOperations];
		products = new int[numberOfOperations];
		for (int i=0; i<numberOfOperations; i++)
			operations[i]=s.next();
		s.nextInt();
		for (int i=0; i<numberOfOperations; i++) {
			if(operations[i].equals("push")) {
				push(s.nextInt());
			} else {
				pop(s.nextInt());
			} products[i] = getMin()*getMax();
		}
		for (int i=0; i<products.length; i++)
			System.out.println(products[i]);
	}
	
	public static void push(int x) {
		for (int i=0; i<list.size();i++) {
			int element=list.get(i);
			if (x <= element) {
				list.add(i,x);
				return;
			}
		} list.add(x); //if cannot find any element bigger than xi
	}
	
	public static void pop(int x) {
		list.remove(new Integer(x));
	}
	
	public static int getMax() {
		return list.get(list.size()-1);
	}
	
	public static int getMin() {
		return list.get(0);
	}
}
