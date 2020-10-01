public class Citizen {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private String givenName;	 	         	 	 	      	       	         	
    private String familyName;	 	         	 	 	      	       	         	
    private int age;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void main(String[] args) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Full-Arg Constructor:	 	         	 	 	      	       	         	
    public Citizen(String givenName, String familyName, int age) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.givenName = givenName;	 	         	 	 	      	       	         	
        this.familyName = familyName;	 	         	 	 	      	       	         	
        this.age = age < 0 ? 18 : age;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getFullName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.givenName + " " + this.familyName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getTaxableYears() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.age < 18 ? 0 : this.age - 18;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getGivenName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.givenName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setGivenName(String givenName) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.givenName = givenName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getFamilyName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.familyName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setFamilyName(String familyName) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.familyName = familyName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getAge() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.age;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setAge(int age) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.age = age < 0 ? 18 : age;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
}