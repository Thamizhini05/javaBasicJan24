package oopsSamples;
import java.util.ArrayList;//ArrayList can dynamically resize itself. It can grow or shrink as needed, making it more flexible for handling varying amounts of data.

public class StudentList {
	ArrayList<Student>studList;//studList: This is the name given to the ArrayList variable. 
								//specifying the creation of an ArrayList in Java that is designed to hold objects of the Student class or its subclasses. 
	public StudentList() {
		System.out.println("creating a student list..");//constructor
		studList=new ArrayList<>();//
	}
	public void addStudent(Student student) {
		System.out.println("Add student list ");
		studList.add(student);
	}
	public ArrayList getStudents() {
		return studList;
	}

}
