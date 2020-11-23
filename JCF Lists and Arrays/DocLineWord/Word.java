public class Word {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private boolean underlined;	 	         	 	 	      	       	         	
    private boolean bold;	 	         	 	 	      	       	         	
    private String text;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Constructor:	 	         	 	 	      	       	         	
    public Word(String text) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.text = text;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setUnderlined(boolean underlined) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.underlined = underlined;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public boolean isUnderlined() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.underlined;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setBold(boolean bold) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.bold = bold;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public boolean isBold() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.bold;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setText(String text) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.text = text;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getText() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.text;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}