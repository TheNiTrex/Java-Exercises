public class Building {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private int streetNumber;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private String streetName;	 	         	 	 	      	       	         	
    private String postCode;	 	         	 	 	      	       	         	
    private String ownerName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private Room[] Rooms;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setStreetNumber(int streetNumber) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.streetNumber = streetNumber;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getStreetNumber() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.streetNumber;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setStreetName(String streetName) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.streetName = streetName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getStreetName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.streetName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setPostCode(String postCode) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.postCode = postCode;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getPostCode() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.postCode;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setOwnerName(String ownerName) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.ownerName = ownerName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getOwnerName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.ownerName;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setRooms(Room[] Rooms) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.Rooms = Rooms;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double getTotalFloorSpace() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        double totalFloorSpace = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < Rooms.length; i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            totalFloorSpace += (Rooms[i].getWidth() * Rooms[i].getLength());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return totalFloorSpace;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}