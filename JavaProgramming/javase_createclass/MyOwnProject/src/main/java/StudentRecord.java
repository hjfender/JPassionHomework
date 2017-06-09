public class StudentRecord {

	// Declare instance variables.
	private String name;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;

	public StudentRecord(String name, double mathGrade, double englishGrade, double scienceGrade) {
		super();
		this.name = name;
		this.mathGrade = mathGrade;
		this.englishGrade = englishGrade;
		this.scienceGrade = scienceGrade;
	}
	
	/**
	 * Returns the name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes the name of the student
	 */
	public void setName(String temp) {
		name = temp;
	}

	/**
	 * Computes the average of the english, math and science grades
	 */
	public double getAverage() {
		double result = 0;
		result = (getMathGrade() + getEnglishGrade() + getScienceGrade()) / 3;
		return result;
	}

	// Instance methods
	public double getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}

	public double getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(double englishGrade) {
		this.englishGrade = englishGrade;
	}

	public double getScienceGrade() {
		return scienceGrade;
	}

	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
	
	//Overloaded myprint(..) methods
	public void myprint(){
		System.out.println("First overloaded method: Nothing is passed on");
	}
	
	public void myprint(String name){
		System.out.println("Second overloaded method: Name: "+name);
	}
	
	public void myprint(String name, double averageGrade){
		System.out.print("Third overloaded method: Name: "+name+" ");
		System.out.println("Average Grade: "+averageGrade);
	}
	
	@Override
	public String toString(){
		return "Name: "+this.name+", Math Grade: "+this.mathGrade+", English Grade: "+this.englishGrade+", Science Grade: "+this.scienceGrade;
	}

}