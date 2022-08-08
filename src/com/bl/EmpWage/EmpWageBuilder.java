package com.bl.EmpWage;

public class EmpWageBuilder {
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;

	static String COMPANY_NAME;
	static int WAGE_PER_HR;
	static int MAX_WORKING_DAYS;
	static int MAX_WORKING_HRS;

	int totalWage;

	/**
	 * @param cOMPANY_NAME
	 * @param wAGE_PER_HR
	 * @param mAX_WORKING_DAYS
	 * @param mAX_WORKING_HRS
	 */
	public EmpWageBuilder(String cOMPANY_NAME, int wAGE_PER_HR, int mAX_WORKING_DAYS, int mAX_WORKING_HRS) {
		COMPANY_NAME = cOMPANY_NAME;
		WAGE_PER_HR = wAGE_PER_HR;
		MAX_WORKING_DAYS = mAX_WORKING_DAYS;
		MAX_WORKING_HRS = mAX_WORKING_HRS;
		this.totalWage = totalWage;
	}

	int generateEmployeeType() {
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHrs(int empType) {
		switch (empType) {
		case FULL_TIME:
			return 8;
		case PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	public void calculateTotalWage(String string, int i, int j, int k) {

		System.out.println("Computation of total wage of " + COMPANY_NAME + " employee");

		System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
		int workingHrs;
		for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
				&& totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {

			int empType = generateEmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * WAGE_PER_HR;
			totalWage += wage;
			System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
		}
		
	}



	public String toString() {
		System.out.println("Details of " + COMPANY_NAME + " employee");
		System.out.println("-----------------------------------------------------");
		System.err.println("Wage per hour:" + WAGE_PER_HR);
		System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
		System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
		return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
	}

	public static void main(String args[]) {
	
		
		EmpWageBuilder amazon = new EmpWageBuilder("Amazon", 8, 20, 100);
		EmpWageBuilder flipkart = new EmpWageBuilder("Flipkart", 4, 30, 150);

		amazon.calculateTotalWage(COMPANY_NAME, WAGE_PER_HR, MAX_WORKING_DAYS, MAX_WORKING_HRS);
		System.out.println(amazon);

		flipkart.calculateTotalWage(COMPANY_NAME, WAGE_PER_HR, MAX_WORKING_DAYS, MAX_WORKING_HRS);
		System.out.println(flipkart);
	}
}