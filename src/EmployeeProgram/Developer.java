package EmployeeProgram;

public class Developer extends Employee{
	private String manageProject;
	public Developer(String name, String address, double salary, String jobTitle,String manageProject){
		super(name, address, salary, jobTitle);
	     this.manageProject = manageProject;
	}
	public double calculateBonus() {
	     return getSalary() *5;
	 }
	public String generatePerformanceReport() {
	     return getName() + ": V Good";
	 }
	public void manageProject() {
	     System.out.println(getName() + " is managing a project.");
	 }
}

