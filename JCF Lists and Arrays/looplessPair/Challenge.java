import java.util.ArrayList;	 	         	 	 	      	       	         	
import java.util.Arrays;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static boolean hasPair(String[] array) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       ArrayList<String> accumulator = new ArrayList<String>(); // Keeps track of unique elements	 	         	 	 	      	       	         	
       ArrayList<String> newArray = new ArrayList<String>(Arrays.asList(array)); // Convert Array to AL	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return hasDupe(newArray, accumulator);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static boolean hasDupe(ArrayList<String> arrayList, ArrayList<String> accumulator) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        if (arrayList.isEmpty()) { // if the AL is empty, that means there were no duplicates	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            return false;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } else { // Parse duplicates (If there are any):	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            // If the first element of the AL was is in the accumulator, that means it's a duplicate:	 	         	 	 	      	       	         	
            if (accumulator.contains(arrayList.get(0))) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                return true;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            } else {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                // If the first element is not a duplicate, add it to the accumulator, and remove it from the AL:	 	         	 	 	      	       	         	
                accumulator.add(arrayList.get(0));	 	         	 	 	      	       	         	
                arrayList.remove(arrayList.get(0));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                // Use Recursion to repeat this process until we get an answer:	 	         	 	 	      	       	         	
                return hasDupe(arrayList, accumulator);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}