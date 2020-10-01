public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static String longestWord(String sentence) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        String longestString = "";	 	         	 	 	      	       	         	
        String[] splitString = sentence.split(" ");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        longestString = splitString[0];	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < splitString.length; i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            if (splitString[i].length() > longestString.length()) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                longestString = splitString[i];	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       System.out.println("The longest word is " + longestString);	 	         	 	 	      	       	         	
       return longestString;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}