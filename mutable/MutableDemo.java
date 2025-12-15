public class MutableDemo {
    public static void main(String[] args) {
  // Creating an object of mutable class.  
     Student st = new Student("John", 12);
     String name = st.getName();
     int rollNo = st.getRollNo();
     System.out.println("Name: " +name);
     System.out.println("Roll no: " +rollNo);
 
  // At this time, the instance variables store the values John and 12 which defines their states. 
  // Now we will change the values of instance variables using getter and setter methods.  
     st.setName("Rashmi");
     st.setRollNo(09); 
     String changeName = st.getName();
     int changeRollNo = st.getRollNo();
     System.out.println("Name after modification: " +changeName);
     System.out.println("Roll no after modification: " +changeRollNo);
  }
}

