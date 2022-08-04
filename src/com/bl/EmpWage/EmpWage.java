package com.bl.EmpWage;

public class EmpWage {
	static int IS_FULLTIME = 2;
	static int RATE_PER_HOUR=20;
	static int emp_hrs = 0;
	static int emp_wage = 0;
	static int FULL_DAY_HOURS = 8;
	static int IS_PARTTIME = 1;
	static int NUM_OF_WORKING_DAYS = 20;
	static int MAX_HRS_IN_MONTH = 100;
	
	public static void CalculateEmpWage() {
		int dailywage = 0;
		int total_emp_Wage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {
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
			dailywage = emp_hrs * RATE_PER_HOUR;

			System.out.println("Days: " + totalWorkingDays + " " + "Hours: " + emp_hrs + " Wage is : " + dailywage);

			total_emp_Wage += dailywage;
		}
		System.out.println("Total Monthly Wage : " + total_emp_Wage);

	}
	
	public static void main(String[] args) {
		CalculateEmpWage();
	}
	

}
