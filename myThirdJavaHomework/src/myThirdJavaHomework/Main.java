package myThirdJavaHomework;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ýrem");
		student1.setLastName("Ýlhan");
		student1.setEmail("irem.ilhan@gmail.com");
		student1.setReceivedCourse("Java");
		student1.setPassword("xxxxxx");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin.demirog@gmail.com");
		instructor.setTransCourse("C#");
		instructor.setPassword("xxxxxx");
		
		//polymorphism
		UserManager manager = new UserManager();
		manager.signIn(student1);
		manager.signIn(instructor);
		
		
		
		
		
	}

}
