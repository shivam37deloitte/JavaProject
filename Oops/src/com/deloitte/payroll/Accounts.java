package com.deloitte.payroll;

public class Accounts {
	
	public void processSalary(Employee e1) {
		
		
		
		if(e1!=null) {
		e1.netSalary();
		if(e1 instanceof ConfirmedEmployee) {
			ConfirmedEmployee confirmedemployee =(ConfirmedEmployee)e1;
			confirmedemployee.transportFacility();
		}
		
	
		
	}

}
}