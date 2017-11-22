package easy;
import java.util.HashMap;

public class NonRepeatedChar {

	public static void main(String[] args) {

		String str = "GeeksGs";
		System.out.println(find(str));
		
	}

	static String find(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		if(map.containsValue(1)==false) {
			return "None";
		}else{
		   for(int l = 0; l < str.length(); l++) {
			   if(map.get(str.charAt(l))==1) {
				   return ""+str.charAt(l);
			   }
		   }
		}
		return "";
		
	}

}
