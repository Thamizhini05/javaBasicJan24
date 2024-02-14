package oopsSamples;

import java.util.ArrayList;//tells the compiler that the code will be using the ArrayList



public class StudentDriver {

	public static void main(String[] args) {

//		Student s1= new Student("Tamil");
//		s1.address="salem";
//		s1.gpa=8.66f;
//		Student s2= new Student("Aishma");
//		s2.address="Attur";
//		s2.gpa=9.89f;
//		System.out.println("Student1 details: " + s1.name +" "+ s1.gpa+ " " +s1.address);
//		System.out.println("Student2 details: " + s2.name +" "+ s2.gpa+ " " +s2.address);
		//Creating instances of specialized Student classes (MNCStudend, PayStudent, AuditStudent)
		//dynamic binding
		Student mStud=new MNCStudend("Mike");// creates an instance of class for Student
		mStud.gpa=8.99f;//assigning a value to the gpa attribute of an object referred to as mStud
		Student pStud=new PayStudent("Rosy");// creates an instance of class for Student
		pStud.gpa=8.69f;
		Student aStud=new AuditStudent("John");// creates an instance of class for Student
		//To invoke interface's method
		MNCStudend mncStud=new MNCStudend("Tamil");
		System.out.println(mncStud.calculateAtten());
		
		mStud.goToClass();// Invoking the goToClass method for MNCStudent and PayStudent
		pStud.goToClass();//Demonstrates polymorphism by calling the goToClass method on instances of different student types.
		
	
		StudentList studList =new StudentList();// creates an instance of class for StudentList
		
//		adding instances of different types of students as argument (mStud, pStud, and aStud)
		studList.addStudent(mStud);//Calls the addStudent method on the studList object.
		studList.addStudent(pStud);
		studList.addStudent(aStud);
		
		ArrayList<Student> list=studList.getStudents();//Calls the getStudents method on the studList object.
		for(Student stud:list) {//Initiates a for-each loop to iterate over each element (student) in the list
			stud.getClass();
			stud.goToClass("Next Building...");//goToClass method on the stud object and passes the string argument "Next Building..."
			System.out.println(stud.calculateCGP());//calculateCGP method on the stud object.
		}
	}



    
}

