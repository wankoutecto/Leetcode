import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		
		String array[] = {"plant", "plantation", "plantain", "place"};
		System.out.println(Arrays.toString(array));
		String prefix = longestCommonPrefix(array);
		System.out.printf("[%s]", prefix);

	}
	
	
	
	public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;    
    }

}
