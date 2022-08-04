package com.bl.EmpWage;

public class EmployeeWage extends Main {
	public void EmpCheck() {
		double emp_check = Math.floor(Math.random() * 10) % 2;
		if (emp_check == IS_FULLTIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

	public void CalculateEmpWage() {

		double emp_check = Math.floor(Math.random() * 10) % 2;
		if (emp_check == IS_FULLTIME)
			emp_hrs = 8;
		else
			emp_hrs = 0;
		emp_wage = emp_hrs * RATE_PER_HOUR;
		System.out.println("Employee Wage: " + emp_wage);
	}

	public void UC3() {

		double emp_check = Math.floor(Math.random() * 10) % 3;
		if (emp_check == IS_PARTTIME)
			emp_hrs = 4;
		if (emp_check == IS_FULLTIME)
			emp_hrs = 8;
		else
			emp_hrs = 0;
		emp_wage = emp_hrs * RATE_PER_HOUR;
		System.out.println("Employee Wage: " + emp_wage);
	}
}
