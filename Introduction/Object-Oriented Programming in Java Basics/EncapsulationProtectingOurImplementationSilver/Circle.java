public class Circle {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private double radius;	 	         	 	 	      	       	         	
    private double x;	 	         	 	 	      	       	         	
    private double y;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Default Constructor:	 	         	 	 	      	       	         	
    public Circle() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        // Use this() to refer to the Constructor with three Parameters,	 	         	 	 	      	       	         	
        // (The one after this one)	 	         	 	 	      	       	         	
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
	 	         	 	 	      	       	         	
        this(x, y, 1.0);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // If only the radius is known:	 	         	 	 	      	       	         	
    public Circle(double radius) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this(1.0, 1.0, radius);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double getRadius() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setRadius(double radius) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.radius = radius < 0 ? this.radius : radius;;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double getX() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.x;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setX(double x) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.x = x;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double getY() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.y;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setY(double y) {	 	         	 	 	      	       	         	
        this.y = y;	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateCircumference() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return 2* Math.PI * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateSurfaceArea() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return Math.PI * radius * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}