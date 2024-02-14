package EmployeeProgram;

public class Employee {
	private String name;
	private String address;
	private double salary;
	private String jobtitle;
	public Employee (String name, String address, double salary, String jobtitle){
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobtitle = jobtitle;
	}
	public String getName() {
	     return name;
	 }
	public String getAddress() {
	     return address;
	 }
	public double getSalary() {
	     return salary;
	 }
	public String getJobTitle() {
	     return jobtitle;
	 }
	public double calculateBonus() {
	     return 0;
	 }
	public String generatePerformanceReport() {
	      return "No performance report available.";
	  }
}