import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = Roman.romanToInt("IM");
		System.out.println(num);
	}
	
	
	public static int romanToInt(String str) {
		Integer num = 0;
		Map<Character, Integer> symbol = new HashMap<>() {{
				put('I',1);
				put('V',5);
				put('X',10);
				put('L',50);
				put('C',100);
				put('D',500);
				put('M',1000);
				}};
		
		int i = 0;
		while(i < str.length()) {
			if((i + 1 < str.length() && str.charAt(i) == 'I') && (str.charAt(i + 1) == 'V' || str.charAt(i + 1) == 'X')) {
				num += symbol.get(str.charAt(i + 1)) - symbol.get(str.charAt(i));
				i += 2;
			}else if(i + 1 < str.length() && (str.charAt(i) == 'X') && (str.charAt(i + 1) == 'L' || str.charAt(i + 1) == 'C')){
				num += symbol.get(str.charAt(i + 1)) - symbol.get(str.charAt(i));
				i += 2;		
			}else if(i + 1 < str.length() && (str.charAt(i) == 'C') && (str.charAt(i + 1) == 'D' || str.charAt(i + 1) == 'M')) {
				num += symbol.get(str.charAt(i + 1)) - symbol.get(str.charAt(i));
				i += 2;
			}else {
				num += symbol.get(str.charAt(i));
				i++;
			}
		}	
		return num;
	}


	private static Entry entry(char c, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
