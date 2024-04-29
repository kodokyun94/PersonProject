package test;

import KIM.walk;
import Moon.Student;
import student_eat.StudentSleep;

public class personTest {

	public static void main(String[] args) {

		Object [] personProject = new Object[4];
		
		Student moon = new Student();
		moon.speak();
		
		walk kim = new walk();
		kim.walk();
		
		StudentSleep ko = new StudentSleep();
		ko.sleep();
		
		personProject[0] = moon;
		personProject[1] = kim;
		personProject[2] = ko;
		
		for (Object object : personProject) {
			Object project = object;
			if(project instanceof Student) {
				Student test = (Student)project;
				System.out.println();
			} else if (project instanceof walk) {
				walk test = (walk)project;
				System.out.println();
			} else if (project instanceof StudentSleep) {
				StudentSleep test = (StudentSleep)project;
				System.out.println();
			}
		}

	}

}




