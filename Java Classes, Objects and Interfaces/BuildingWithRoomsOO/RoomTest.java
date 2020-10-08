public class RoomTest {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void main(String args[]) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Room[] Rooms;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Room r1 = new Room();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        r1.setLevel(1);	 	         	 	 	      	       	         	
        r1.setWidth(2);	 	         	 	 	      	       	         	
        r1.setLength(2);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Room r2 = new Room();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        r2.setLevel(2);	 	         	 	 	      	       	         	
        r2.setWidth(3);	 	         	 	 	      	       	         	
        r2.setLength(3);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Rooms = new Room[]{r1, r2};	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Building b1 = new Building();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        b1.setStreetNumber(1);	 	         	 	 	      	       	         	
        b1.setStreetName("ABC");	 	         	 	 	      	       	         	
        b1.setPostCode("XYZ");	 	         	 	 	      	       	         	
        b1.setOwnerName("John Smith");	 	         	 	 	      	       	         	
        b1.setRooms(Rooms);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        System.out.println(b1.getTotalFloorSpace());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}