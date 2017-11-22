package easy;

public class LongestSequence {
	
	public static void main(String[] args) {
		System.out.println(find("aaaaaaaaaaacfjkkkkkknv"));
		
	}

	
	static int find( String str) {
		
		char c= str.charAt(0);
		int count = 0;
		int longest = 0;
		
		for(int i =1; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}else {
				if(longest < count) {
					longest = count;
				}
				c = str.charAt(i);
				count =0;
			}
		}
		
		return longest;
	}
}
