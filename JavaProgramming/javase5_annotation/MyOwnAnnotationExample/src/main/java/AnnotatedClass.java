public class AnnotatedClass {
	
	@RequestForEnhancement(id = 123456,
						   synopsis = "Find bugs",
						   engineer = "Javasson",
						   date = "7/11/2012")
	public void myMethod(){
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		RequestForEnhancement annotation = AnnotatedClass.class.getMethod("myMethod").getDeclaredAnnotation(RequestForEnhancement.class);
			
		System.out.println("id = " + annotation.id());
		System.out.println("synopsis = " + annotation.synopsis());
		System.out.println("engineer = " + annotation.engineer());
		System.out.println("date = " + annotation.date());
	}
}
