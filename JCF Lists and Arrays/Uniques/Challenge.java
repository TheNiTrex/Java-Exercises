import java.util.Set;	 	         	 	 	      	       	         	
import java.util.HashSet;	 	         	 	 	      	       	         	
import java.util.Iterator;	 	         	 	 	      	       	         	
import java.util.Collection;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static String[] uniques(String[] array) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Set<String> set = new HashSet<String>();	 	         	 	 	      	       	         	
        int i = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (String element : array) set.add(element);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        String[] uniquesArray = new String[set.size()];	 	         	 	 	      	       	         	
        Iterator<String> iterator = set.iterator();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        while(iterator.hasNext()) { // If iterator has another element to parse, return true and continue loop	 	         	 	 	      	       	         	
            uniquesArray[i] = iterator.next();	 	         	 	 	      	       	         	
            i++;	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return uniquesArray;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}