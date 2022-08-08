package com.bl.EmpWage;

import java.util.ArrayList;
import java.util.HashMap;

public class EmpWageCompute implements IComputeEmpWage{
	 public static final int PART_TIME = 1;
	    public static final int FULL_TIME = 2;
	    int empHrs = 0;
	    HashMap<String, Integer> totalEmpWages;
	    ArrayList<CompanyEmpWage> companies;
	    
		public EmpWageCompute(int i) {
			 companies = new ArrayList<>();
			 totalEmpWages = new HashMap<>();
	    }

	    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
	    
		
		
	    CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
        companies.add(company);
        totalEmpWages.put(companyName,0);
    }

	    
    int generateEmployeeType()
    {
        return (int) (Math.random() * 100) % 3;
    }
    
    
    int getWorkingHrs(int empType)
    {
        switch (empType)
        {
            case FULL_TIME:
                return empHrs = 8;
            case PART_TIME:
                return empHrs = 4;
            default:
                return empHrs = 0;
        }
    }
		    
		    public void calculateTotalWage()
		    {
		        for (CompanyEmpWage company : companies)
		        {
		            int totalWage = calculateTotalWage(company);
		            company.setTotalEmpWage(totalWage);
		            System.out.println(company);
		        }
		    }
		    
		    
		    int calculateTotalWage(CompanyEmpWage companyEmpWage)
		    {
		        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
		       
		        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
		        int workingHrs, totalWage = 0;
		        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
		                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
		        {
		            int empType = generateEmployeeType();
		            workingHrs = getWorkingHrs(empType);
		            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
		            totalWage += wage;
		            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
		        }
		        totalEmpWages.put(companyEmpWage.COMPANY_NAME, totalWage);
		        return totalWage;
		    }
		  
	      

	    void printTotalEmpWages()
	    {
	        System.out.println("The Companies and their total Employee Wages are:");
	        for (String companyName : totalEmpWages.keySet())
	        {
	            System.out.println(companyName + ": " + totalEmpWages.get(companyName));
	        }

	    }

		    public static void main(String args[])
		    {
		    	EmpWageCompute employeeWageComputation = new EmpWageCompute(4);
		          employeeWageComputation.addCompany("Amazon", 4, 30, 100);
		          employeeWageComputation.addCompany("Infosys", 5, 40, 170);
		          employeeWageComputation.addCompany("Apple", 9, 10, 70);
		          employeeWageComputation.addCompany("Flipkart", 9, 10, 70);
		          
		          employeeWageComputation.calculateTotalWage();
		          employeeWageComputation.printTotalEmpWages();
		    }
		

}
