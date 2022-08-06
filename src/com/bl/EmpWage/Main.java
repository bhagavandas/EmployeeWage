package com.bl.EmpWage;

public class Main {
	static int IS_FULLTIME = 2;
	static int RATE_PER_HOUR = 20;
	static int emp_hrs = 0;
	static int emp_wage = 0;
	static int FULL_DAY_HOURS = 8;
	static int IS_PARTTIME = 1;
	static int NUM_OF_WORKING_DAYS = 20;
	static int MAX_HRS_IN_MONTH = 100;
	static String Company_name;
	static int total_emp_Wage;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wages Computation");
		EmployeeWage obj = new EmployeeWage();
		obj.EmpCheck();
		obj.CalculateEmpWage();
		obj.UC3();
		obj.UC4();
		obj.UC5();
		obj.UC6(Company_name, FULL_DAY_HOURS, FULL_DAY_HOURS, FULL_DAY_HOURS);

		obj.getEmpWageOfMultipleCompanies();
		obj.EmpWageBuilder(Company_name, MAX_HRS_IN_MONTH, NUM_OF_WORKING_DAYS, RATE_PER_HOUR);

		EmployeeWage amazon = new EmployeeWage();
		EmployeeWage flipkart = new EmployeeWage();

		amazon.EmpWageBuilder("Amazon", 15, 4, 25);
		System.out.println(amazon);

		flipkart.EmpWageBuilder("Flipkart", 20, 2, 10);
		System.out.println(flipkart);

	}

	public void getEmpWageOfMultipleCompanies() {
		System.out.println("Emp Wage Details of Multiple companies ");
		System.out.println("Details of Amazon : ");
		EmployeeWage.UC6("Amazon", 20, 10, 100);
		toString();
		System.out.println("Details of Flipkart ");
		EmployeeWage.UC6("Flipkart", 25, 15, 100);

	}

}
