package com.bl.EmpWage;

public class CompanyEmpWage {
	public final String company;
	public final int ratePerHour;
	public final int numOfWorkingDays;
	public final int maxHrsPerMonth;
	public int total_emp_Wage;
	
	public CompanyEmpWage(String company,int ratePerHour,int numOfWorkingDays,int maxHrsPerMonth) {
		this.company = company;
		this.ratePerHour = ratePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
		
	}


	public void setTotal_emp_Wage(int total_emp_Wage) {
		this.total_emp_Wage = total_emp_Wage;
	}


	@Override
	public String toString() {
		return "Employee Wage for company " + company + " is : " + total_emp_Wage;
	}


		
}