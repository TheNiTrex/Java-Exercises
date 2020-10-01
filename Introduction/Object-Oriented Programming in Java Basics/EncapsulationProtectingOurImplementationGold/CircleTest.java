public class CircleTest {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void main(String[] args) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Circle c1 = new Circle(2.0, 2.0, 2.0);	 	         	 	 	      	       	         	
        c1.setRadius(-3.0);	 	         	 	 	      	       	         	
        c1.setX(3.0);	 	         	 	 	      	       	         	
        c1.setY(3.0);	 	         	 	 	      	       	         	
        System.out.println(printCircle(c1));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static String printCircle(Circle c) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return "The circle is at x = " + c.getX() + " and y = " + c.getY() + " with a radius of " + c.getRadius();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}