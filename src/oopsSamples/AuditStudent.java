package oopsSamples;

public class AuditStudent extends Student {
	public AuditStudent(String strName) {
		name=strName;
	}
//	method overloading
	public void goToClass() {
	}
		public void goToClass(String direction) {
			System.out.println("Goto class after audit class");
			System.out.println("The Class is in "+ direction);
		}
	}


