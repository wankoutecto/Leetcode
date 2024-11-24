import java.util.*;

public class removeDuplicates {

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
		int[] arr = removeDuplicates(nums);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] removeDuplicates(int[] nums) {
		int[]arr = new int[nums.length];
		int k = -1;
		boolean b = false;
		int i = 0;
		while(i < nums.length) {
			for(int j = 0; j < arr.length; j++) {
				if(nums[i] == arr[j]) {
					b = true;
					break;
				}
			}
			if(!b) {
				k++;
				arr[k] = nums[i];

			}
			b = false;
			i++;
		}
		return arr;
		   
    }
}
