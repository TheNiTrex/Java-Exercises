public class Circle {	 	         	 	 	      	       	         	
    public double radius;	 	         	 	 	      	       	         	
    public double x;	 	         	 	 	      	       	         	
    public double y;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateCircumference() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return 2* Math.PI * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateSurfaceArea() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return Math.PI * radius * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}