package day4Assignment;

public class EmploymentWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IsFullTime = 1;
		int wagesPerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int Salary = 0;
		int workingDayForMonth = 20;
		int SalaryForMonth = 0;
		
		int empCheck = (int) (Math.floor(Math.random() *10) % 3);
		
		if (empCheck == IsFullTime)
		{
			System.out.println("Employee is Present");
	
		switch (empCheck)
		{
		
		case 1 :
		Salary = wagesPerHour * fullDayHour;
		SalaryForMonth = workingDayForMonth * Salary ;
		System.out.println("Full day Salary of Employee Rs :"+Salary);
		System.out.println("Montly Salary of Employee Rs :"+SalaryForMonth);
		break;
		
		case 2 :
		Salary = wagesPerHour * halfDayHour;
		SalaryForMonth = workingDayForMonth * Salary ;
		System.out.println("Full day Salary of Employee Rs :"+Salary);
		System.out.println("Montly Salary of Employee Rs :"+SalaryForMonth);
		break;
		
		case 3 :
		System.out.println("Employee is absent");
		break;
		}
			
		}
		else
		{
			System.out.println("Employee is Absent");
		}	
	}
}


