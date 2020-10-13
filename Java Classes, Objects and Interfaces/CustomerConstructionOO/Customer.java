import java.util.*;	 	         	 	 	      	       	         	
public class Customer {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private final List<String> givenNamesList;	 	         	 	 	      	       	         	
    private final String familyName;	 	         	 	 	      	       	         	
    private final String[] givenNamesArray;	 	         	 	 	      	       	         	
    private final String[] addressLines;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Constructor:	 	         	 	 	      	       	         	
    public Customer(String name, String address) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        // Parse name:	 	         	 	 	      	       	         	
        givenNamesList = new ArrayList<>(Arrays.asList(name.split(" ")));	 	         	 	 	      	       	         	
        familyName = givenNamesList.get(givenNamesList.size() -1);	 	         	 	 	      	       	         	
        givenNamesList.remove(givenNamesList.size() -1);	 	         	 	 	      	       	         	
        givenNamesArray = givenNamesList.toArray(new String[givenNamesList.size()]);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        // Parse Address:	 	         	 	 	      	       	         	
        addressLines = address.split(", ");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getFamilyName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return familyName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String[] getGivenNames() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return givenNamesArray;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String[] getAddressLines() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return addressLines;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getGivenName(int index) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return givenNamesArray[index - 1];	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getAddressLine(int index) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return addressLines[index - 1];	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
}