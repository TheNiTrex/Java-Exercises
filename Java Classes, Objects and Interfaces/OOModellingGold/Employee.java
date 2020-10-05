public class Employee extends Person{	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private int id;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Constructor - When a new object of this Class is created initialise these values:	 	         	 	 	      	       	         	
    public Employee(String firstname, String surname, int id) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        // Call Superclass Constructor to initialize given name:	 	         	 	 	      	       	         	
        super(firstname, surname);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.id = id;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getId() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.id;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setId(int id) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.id = id;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String toString() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        // Call Superclass to get this object's given name	 	         	 	 	      	       	         	
        return super.toString() + ", " + this.id;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}