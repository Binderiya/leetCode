package easy;

public class ImplementStr {

	public static void main(String args[]) {
		
		System.out.println(strStr("hell", "ll"));
		
	}
	
	static  int strStr(String haystack, String needle) {
        
        int count = needle.length();
        
        for(int i = 0; i < haystack.length()-count+1; i ++){
            if(haystack.substring(i, i+count).equals(needle)){
            	System.out.println("i:"+i);
                return i;
            }
        }
        return -1;
        
    }
}
