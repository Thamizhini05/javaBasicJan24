
package EmployeeProgram;

public class Programmer extends Employee{
	private String manageProject;
	public Programmer(String name, String address, double salary, String jobTitle,String manageProject){
		super(name, address, salary, jobTitle);
	     this.manageProject = manageProject;
	}
	public double calculateBonus() {
	     return getSalary() *1;
	 }
	 public String generatePerformanceReport() {
	     return getName() + ": Good";
	 }
	 public void manageProject() {
	     System.out.println(getName() + " is managing a project.");
	 }
}