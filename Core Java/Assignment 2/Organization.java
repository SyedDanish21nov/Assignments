import java.util.*;

public class Organization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		Labour labour = new Labour();
		
		manager.addSalary();
		manager.addIncentive();
		
		labour.addSalary();
		labour.addOvertime();
		
		manager.salary();
		labour.salary();
		
		class Employee{
			int salary;
			
			public void salary() {
				System.out.println(salary);
			}
		}
			
		class Manager extends Employee{
			int incentive;
			public void addSalary() {
				System.out.println("Enter salary for Manager: ");
				salary=sc.nextInt();
			}
			public void addIncentive() {
				System.out.println("Add Incentive: ");
				incentive=sc.nextInt();
			}
			public void Salary() {
				System.out.println("Total Salary of Manager: "+ (salary+incentive));
			
			}
		}
		
		class Labour extends Employee{
			int overtime;
			
			public void addSalary() {
				System.out.println("Enter salary for Labour: ");
				salary=sc.nextInt();
			}
			public void addOvertime() {
				System.out.println("Add Overtime: ");
				overtime=sc.nextInt();
			}
			public void Salary() {
				System.out.println("Total Salary of Labour: "+ (salary+overtime));
			
			}
		}
	}
}
