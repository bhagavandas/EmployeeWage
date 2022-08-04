package com.bl.EmpWage;

public class EmployeeWage extends Main {
	public void EmpCheck() {
		double emp_check = Math.floor(Math.random() * 10) % 2;
		if(emp_check == IS_FULLTIME) 
			System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");	
	}

}
