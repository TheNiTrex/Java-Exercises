import java.util.*;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static char firstNonRep(String str) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        int characters = 256;	 	         	 	 	      	       	         	
        char[] count = new char[characters];	 	         	 	 	      	       	         	
        char result = 'X';	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < str.length(); i++) count[str.charAt(i)]++;	 	         	 	 	      	       	         	
        for (int j = 0; j < str.length(); j++) if (count[str.charAt(j)] == 1) {	 	         	 	 	      	       	         	
            result = str.charAt(j);	 	         	 	 	      	       	         	
            break;	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return result;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}