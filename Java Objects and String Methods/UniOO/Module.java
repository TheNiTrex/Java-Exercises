public class Module {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Many relations in Course	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private String name;	 	         	 	 	      	       	         	
    private String lectureVenue;	 	         	 	 	      	       	         	
    private String dayOfWeek;	 	         	 	 	      	       	         	
    private String time;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private Lecturer Lecturer; // One Lecturer in a Module	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setName(String name) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.name = name;	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.name;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setLectureVenue(String lectureVenue) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.lectureVenue = lectureVenue;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getLectureVenue() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.lectureVenue;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setDayOfWeek(String dayOfWeek) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.dayOfWeek = dayOfWeek;	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getDayOfWeek() {	 	         	 	 	      	       	         	
        return this.dayOfWeek;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setTime(String time) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.time = time;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getTime() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.time;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setLecturer(Lecturer Lecturer) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.Lecturer = Lecturer;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Lecturer getLecturer() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.Lecturer;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
}