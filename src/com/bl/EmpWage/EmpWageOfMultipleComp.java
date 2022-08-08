package com.bl.EmpWage;

public class EmpWageOfMultipleComp {
	
	static int ratePerHour;
	static int emp_hrs;
	static int emp_wage;
	static int FULL_DAY_HOURS = 8;
	
	static int numOfWorkingDays = 20;
	static int MAX_HRS_IN_MONTH = 100;
	static String company;
	static int total_emp_Wage;
	
	
	public static void addCompanyWage(String company,int ratePerHour,int numOfWorkingDays,int total_emp_Wage ) {
		EmployeeWage amazon = new EmployeeWage();
		EmployeeWage flipkart = new EmployeeWage();
		
		amazon.EmpWageBuilder("Amazon", 15, 4, 25);
		System.out.println(amazon);

		flipkart.EmpWageBuilder("Flipkart", 20, 2, 10);
		System.out.println(flipkart);

		
	}
	
	
	public static void computeEmpWage() {
		int dailywage = 0;
		int total_emp_Wage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
			int emp_check = (int) Math.floor(Math.random() * 10) % 3;
			switch (emp_check) {
			case 1:
				emp_hrs = 4;
				break;
			case 2:
				emp_hrs = 8;
				break;
			default:
				emp_hrs = 0;
				break;
			}
			dailywage = emp_hrs * ratePerHour;

			System.out.println("Days:" + totalWorkingDays + "   " + "Hours:" + emp_hrs + "    Wage is:" + dailywage);

			total_emp_Wage += dailywage;
		}
		System.out.println("Total Monthly Wage is: " + total_emp_Wage);

	}
	public static void getTotalWage() {
		
		EmpWageOfMultipleComp amazon = new EmpWageOfMultipleComp();
		EmpWageOfMultipleComp flipkart = new EmpWageOfMultipleComp();
		
		System.out.println("Emp Wage Details of Multiple companies ");
		System.out.println("Details of Amazon : ");
		amazon.addCompanyWage("Amazon", 20, 10, 100);
		
		System.out.println("Details of Flipkart ");
		flipkart.addCompanyWage("Flipkart", 25, 15, 100);
		
		EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
		empWageBuilderArray.addCompanyEmpWage("Amazon", 20, 4, 15);
		empWageBuilderArray.addCompanyEmpWage("Flipkart", 10, 2, 20);
		empWageBuilderArray.computeEmpWage();
		
	}
	
	public static void main(String[] args) {
		//String company; int ratePerHour; int numOfWorkingDays; int maxHrsPerMonth;
		
		addCompanyWage(company, ratePerHour, numOfWorkingDays, total_emp_Wage);

		computeEmpWage();

		getTotalWage();
	}

}
