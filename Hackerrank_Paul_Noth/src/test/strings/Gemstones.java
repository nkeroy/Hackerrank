package test.strings;

public class Gemstones {
	static int gemstones(String[] arr) {
        int count = 0;
        String duplicates = "";
        for (int i=0; i<arr[0].length(); i++) {
            String ref = arr[0].substring(i,i+1);
            if (duplicates.contains(ref)) // need to check if got duplicate letters cos may overcount
                continue;
            for (int j=1; j<arr.length;j++){
                if(arr[j].contains(ref) && j==arr.length-1)
                    count++;
                else if (arr[j].contains(ref))
                    continue;
                else
                    break;
            }
            duplicates += ref;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
