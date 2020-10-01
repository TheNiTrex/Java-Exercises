public class Circle {	 	         	 	 	      	       	         	
    public double radius;	 	         	 	 	      	       	         	
    public double x;	 	         	 	 	      	       	         	
    public double y;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Circle(double x, double y, double radius) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.x = x;	 	         	 	 	      	       	         	
        this.y = y;	 	         	 	 	      	       	         	
        this.radius = radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateCircumference() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return 2* Math.PI * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double calculateSurfaceArea() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return Math.PI * radius * radius;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}