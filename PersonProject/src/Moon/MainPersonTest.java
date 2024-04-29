package Moon;

public class MainPersonTest {

	public static void main(String[] args) {
		Person moon = new Student();
		if(moon instanceof Student) {
			Student moonStudent = (Student)moon;
			moonStudent.speak();
			
		}

	}

}
