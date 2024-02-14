package oopsSamples;

public abstract class Student { // the student class is defined as abstract
		String name;
		String address;
		float gpa;
		private double average;
		//static, it can't be changed(eg: student from the same clg belong to different courses)
		static final String college="IITC"; //once the variable is declared as final it can't be changed
		public Student() {
			
		}
		public Student(String strName) {
			name=strName;
		}
//		public void goToClass() {
//			System.out.println("Goto Class...");}
		
		public final double calculateCGP() {
			return 10.5;
		}

	public abstract void goToClass();
	
	public void  goToClass(String direction) {
		
	}
	}


