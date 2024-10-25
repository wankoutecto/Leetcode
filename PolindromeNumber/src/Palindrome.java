
public class Palindrome {

	public static void main(String[] args) {
		boolean bool = Palindrome.isPalindrome(12231);
		System.out.println(bool);
		System.out.println(bool);

	}

	public static boolean isPalindrome(int x) {
		String intToString = String.valueOf(x);
		int j = 0;
		for(int i = intToString.length() - 1; i >= 0; i--) {
			if(intToString.charAt(i) != intToString.charAt(j))
			{
				return false;
			}
			j++;
		}
			
		return true;
	}
}

