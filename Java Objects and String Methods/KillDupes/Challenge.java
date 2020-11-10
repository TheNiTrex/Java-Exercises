import java.util.*;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static String killDupes(String line) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        String dupedCharacters = "";	 	         	 	 	      	       	         	
        ArrayList<Character> killedLine = new ArrayList<Character>();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        int killedDupes = 0; // Keep track of how many times a dupe has been killed	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (char c : line.toCharArray()) killedLine.add(c); // Convert String Param to mutable Character AL	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < line.length(); i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            // Create a new ArrayList, iterate through the String parameter, and check if its current	 	         	 	 	      	       	         	
            // character exists in the ArrayList, if not, add the character to it. If it does exist, remove that	 	         	 	 	      	       	         	
            // character from the String:	 	         	 	 	      	       	         	
            if (dupedCharacters.contains(Character.toString(line.charAt(i)).toLowerCase())) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                killedLine.remove((i) - killedDupes);	 	         	 	 	      	       	         	
                killedDupes += 1;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            } else {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                dupedCharacters += Character.toLowerCase(line.charAt(i));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return (fromStringArrayListToString(killedLine));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static String fromStringArrayListToString(ArrayList<Character> stringArrayList) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        String convertedString = "";	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < stringArrayList.size() ; i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            convertedString += (stringArrayList.get(i) + "");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return convertedString;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}