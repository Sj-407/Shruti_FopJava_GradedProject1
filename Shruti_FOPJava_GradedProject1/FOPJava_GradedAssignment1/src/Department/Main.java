package Department;

public class Main {
	
	public static void main(String[] args) {		
		//Admin department calling methods
		
		Admin_department admin_department = new Admin_department();
		admin_department.departmentName();
		admin_department.getTodaysWork();
		admin_department.getWorkDeadline();
		admin_department.isTodayAHoliday();
		
		System.out.println();
		
		//Hr department calling methods
		
		Hr_department hr_department = new Hr_department();
		
		hr_department.departmentName();
		hr_department.doActivity();
		hr_department.getTodaysWork();
		hr_department.getWorkDeadline();
		hr_department.isTodayAHoliday();
		
		System.out.println(); 
		
		//Tech department calling methods
		
		Tech_department tech_department = new Tech_department();
		
		tech_department.departmentName();
		tech_department.getTodaysWork();
		tech_department.getWorkDeadline();
		tech_department.getTechStackInformation();
		tech_department.isTodayAHoliday();
		
		
	}

}
