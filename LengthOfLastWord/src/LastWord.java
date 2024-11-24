
public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The last world if house ";
		 int count = 0 ;
		 int start = 0;
	    for(int i = s.length() - 1; i >= 0  ; i--){
	        // Hello World--
	       if(s.charAt(i) == ' ' && count != 0){
	    	   start = i + 1;
	            break;
	       } 
	       if(s.charAt(i) != ' ' ){
	            count++ ;
	       } 
	    }
	    String str = s.substring(start, start + count);
	    System.out.println("The last word is: " + str);
	    System.out.println("The length of " + str + " is: " + count);
	}
}
