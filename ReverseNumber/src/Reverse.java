//to reverse 1234 for example
//you take the last number 4 by doing (1234 % 10) = 4)
//take the number before 4 (1234 / 10 = 123 and use the technical 123 % 10 = 3)
//add number 3 to 4 by doing (4 * 10 = 40 and 40 + 3 = 43)
//repeat the same and get 4321

public class Reverse {

	public static void main(String[] args) {

		int x = 1234;
		int reverse = 0;
		while (x > 0) {
			int lastDigit = x % 10; //get last number 4;
			reverse = (reverse * 10) + lastDigit; //store the number 4, then 3, then 2, then 1 
			x /= 10; //remove last digit 1234 become 123 
		}		
		System.out.println(reverse);

	}
}
 
