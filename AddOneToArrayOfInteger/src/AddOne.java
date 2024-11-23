/*Given an integer array nums sorted in non-decreasing order, 
*remove the duplicates in-place such that
*Input: nums = [1,1,2]
*Output: 2, nums = [1,2,_]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOne {

	public static void main(String[] args) {
		int[]arr = {1,2,9};
		int[]newArr;
		int num = 0;
		int reverseNum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			num = (num * 10) + arr[i];
		}
		num = num + 1;
		String strNum = String.valueOf(num);
		//String reverse = new StringBuilder(strNum).reverse().toString();
		
		
		newArr = new int[strNum.length()];
		int i = 0;
		while(i < strNum.length()) {
			newArr[i] = strNum.charAt(i) - '0';
			i++;
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
