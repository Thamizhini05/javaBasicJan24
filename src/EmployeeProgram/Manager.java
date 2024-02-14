package EmployeeProgram;
public class Manager extends Employee{
	private String manageProject;
	public Manager(String name, String address, double salary, String jobTitle, String manageProject) {
		super(name, address, salary, jobTitle);
		this.manageProject = manageProject;
	}
	public double calculateBonus() {
	     return getSalary() *10;
	 }
	public String generatePerformanceReport() {
	     return getName() + ": Excellent";
	 }
	public void manageProject() {
	     System.out.println(getName() + " is managing a project.");
	 }
}




