package com.bl.EmpWage;

public interface IComputeEmpWage {
	 public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

	    public void calculateTotalWage();

}
