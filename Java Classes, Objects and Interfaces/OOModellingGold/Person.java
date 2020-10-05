public abstract class Person {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private String surname;	 	         	 	 	      	       	         	
    private String firstname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Person(String firstname, String surname) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.firstname = firstname;	 	         	 	 	      	       	         	
        this.surname = surname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getSurname() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.surname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setSurname(String surname) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.surname = surname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getFirstname() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.firstname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setFirstname(String firstname) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.firstname = firstname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String toString() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.firstname + ", " + this.surname;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}