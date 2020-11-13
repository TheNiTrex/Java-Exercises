public class Course {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private String name;	 	         	 	 	      	       	         	
    private String department;	 	         	 	 	      	       	         	
    private int durationInYears;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private Module[] Modules; // Many Modules in a Course	 	         	 	 	      	       	         	
    private Student[] Students; // Many Students in a Course	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private Lecturer Lecturer; // One Lecturer in a Course	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setName(String name) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.name = name;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.name;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setDepartment(String department) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.department = department;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getDepartment() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.department;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setDurationInYears(int durationInYears) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.durationInYears = durationInYears;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getDurationInYears() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.durationInYears;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setModules(Module[] Modules) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.Modules = Modules;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Module[] getModules() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.Modules;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setStudents(Student[] Students) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.Students = Students;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Student[] getStudents() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.Students;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setLecturer(Lecturer Lecturer) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.Lecturer = Lecturer;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Lecturer getLecturer() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.Lecturer;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
}