
public class Student {

	// Declare static variables
	private static int studentCount = 0;
	
	//Declare instance variables
	private StudentRecord studentRecord;
	private Integer studentID;
	
	public StudentRecord getStudentRecord() {
		return studentRecord;
	}
	public void setStudentRecord(StudentRecord studentRecord) {
		this.studentRecord = studentRecord;
	}
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	
	/**
	 * Returns the number of instances of StudentRecords This is a static method.
	 */
	public static int getStudentCount() {
		return studentCount;
	}

	/**
	 * Increases the number of instances of StudentRecords. This is a static
	 * method.
	 */
	public static void increaseStudentCount() {
		studentCount++;
	}
	
	@Override
	public String toString(){
		return this.studentRecord.toString()+", Student ID: "+this.studentID;
	}
	
}
