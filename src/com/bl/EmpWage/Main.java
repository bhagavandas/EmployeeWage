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
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program");
		EmployeeWage obj = new EmployeeWage();
		obj.EmpCheck();
		obj.CalculateEmpWage();
		obj.UC3();
		obj.UC4();
		obj.UC5();
		obj.UC6();
	}
}
