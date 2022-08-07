package com.bl.EmpWage;

public class EmpWageBuilderArray extends Main{
	
	
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
		
	}
	void addCompanyEmpWage(String company,int ratePerHour,int numOfWorkingDays,int maxHrsPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, ratePerHour, numOfWorkingDays, maxHrsPerMonth);
		numOfCompany++;
	}
	
	void computeEmpWage() {
		for(int i=0; i<numOfCompany; i++) {
			companyEmpWageArray[i].setTotal_emp_Wage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		int emp_hrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int emp_check = (int) Math.floor(Math.random() * 10) % 3;
			switch (emp_check) {
			case IS_PARTTIME:
				emp_hrs = 4;
				break;
			case IS_FULLTIME:
				emp_hrs = 8;
				break;
			default:
				emp_hrs = 0;
				break;
			}
			totalEmpHrs += emp_hrs;
			
			System.out.println("Days:" + totalWorkingDays + "   " + "Emp Hours:" + emp_hrs);
		}
			return totalEmpHrs* companyEmpWage.ratePerHour;
		
				}
	
	
}
