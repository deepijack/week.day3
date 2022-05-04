package week.day2;

public class EmployeeName {
	public void printEmployeeName(String empName,int empId) {
		System.out.println("The employee is:"+empName);
		System.out.println("The empId is:"+empId);
	
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("The empl Address:"+empAddress);
	}
    public void printEmployeeSalary(double employeeSalary) {
    	System.out.println("The employee Salary:"+employeeSalary);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmployeeName  emp=new EmployeeName();
		 emp.printEmployeeName("deepika", 2029);
		 emp.getEmployeeAddress("3a, gandhiji st");
		 emp.printEmployeeSalary(330000);
		 
	}

}
