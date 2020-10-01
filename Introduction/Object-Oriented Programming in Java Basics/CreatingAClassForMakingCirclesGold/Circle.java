public class Circle {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double radius;	 	         	 	 	      	       	         	
    public double x;	 	         	 	 	      	       	         	
    public double y;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Circle() {	 	         	 	 	      	       	         	
        this(1.0, 1.0, 1.0);	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // If all Parameters are known:	 	         	 	 	      	       	         	
    public Circle(double x, double y, double radius) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        // Use this. because the variable names are the same	 	         	 	 	      	       	         	
        this.x = x;	 	         	 	 	      	       	         	
        this.y = y;	 	         	 	 	      	       	         	
        this.radius = radius < 0 ? 1.0 : radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // If only the coordinates are known:	 	         	 	 	      	       	         	
    public Circle(double x, double y) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.x = x;	 	         	 	 	      	       	         	
        this.y = y;	 	         	 	 	      	       	         	
        this.radius = 1.0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // If only the radius is known:	 	         	 	 	      	       	         	
    public Circle(double radius) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.x = 1.0;	 	         	 	 	      	       	         	
        this.y = 1.0;	 	         	 	 	      	       	         	
        this.radius = radius < 0 ? 1.0 : radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateCircumference() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return 2* Math.PI * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateSurfaceArea() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return Math.PI * radius * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}