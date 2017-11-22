package easy;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("snnn)((ssdsadsa)"));

	}

	static boolean isValid(String str) {
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				a++;
			} else if (str.charAt(i) == '{') {
				b++;
			} else if (str.charAt(i) == '[') {
				c++;
			}
			if (str.charAt(i) == ')') {
				if(a<=b) {
					return false;
				}
				a--;
			} else if (str.charAt(i) == '}') {
				b--;
			} else if (str.charAt(i) == ']') {
				c--;
			}

		}

		if (a == 0 && b == 0 && c == 0) {
			return true;
		}
		return false;
	}

}