public class Student {
 // Declare data members as private.	
    private String name;
    private int rollNo;
   
    public Student(String name, int id)
    {
       this.name = name;
       this.rollNo = id;
    }
 // Declare getter and setter methods for each private variable.
    public String getName() {
		return name; 
    }
    public int getRollNo() {
		return rollNo; 
    } 
    public void setName(String name) {
		this.name = name;
     }
    public void setRollNo(int rollNo) {
	 	this.rollNo = rollNo;
    }
 }

