package test;

import KIM.walk;
import Moon.Student;
import student_eat.StudentSleep;

public class personTest {

	public static void main(String[] args) {

		Object [] testMemberObjects = new Object[17];
		
		Student moon = new Student();
		moon.speak();
		
		walk kim = new walk();
		kim.walk();
		
		StudentSleep ko = new StudentSleep();
		ko.sleep();
		
		testMemberObjects[0] = moon;
		testMemberObjects[1] = kim;
		testMemberObjects[2] = ko;
		
		
		for (Object object : testMemberObjects) {
			Object object2 = object;
			if(object2 instanceof Student) {
				Student test = (Student)object2;
				System.out.println();
			} else if (object2 instanceof walk) {
				walk test = (walk)object2;
				System.out.println();
			} else if (object2 instanceof StudentSleep) {
				StudentSleep test = (StudentSleep)object2;
				System.out.println();
			}
		}

	}

}




