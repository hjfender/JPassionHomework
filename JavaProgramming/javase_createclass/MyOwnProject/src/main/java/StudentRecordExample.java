public class StudentRecordExample {
   
    public static void main(String[] args) {
       
        // Create three instances of Student class and initialize them
    	Student henry = new Student();
    	henry.setStudentID(1043973);
    	henry.setStudentRecord(new StudentRecord("Henry", 100, 100, 100));
    	Student.increaseStudentCount();
    	
    	Student raghu = new Student();
    	raghu.setStudentID(1039999);
    	raghu.setStudentRecord(new StudentRecord("Raghu", 0, 0, 0));
    	Student.increaseStudentCount();
    	
    	Student spencer = new Student();
    	spencer.setStudentID(1049999);
    	spencer.setStudentRecord(new StudentRecord("Spencer", 75, 80, 85));
    	Student.increaseStudentCount();
    	
    	System.out.println(henry.toString());
    	System.out.println(raghu.toString());
    	System.out.println(spencer.toString());
    	System.out.println("Student Count: "+Student.getStudentCount());
    }
   
}