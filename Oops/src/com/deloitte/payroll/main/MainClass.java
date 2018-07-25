package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Interns;

public class MainClass {

	public static void main(String[] args) {
		
		
		Accounts account= new Accounts();
		
		Employee q;
		HR w =new HR();
	    q = w.recruit('p');
	    account.processSalary(q);
	    
	    q = w.recruit('i');
	    account.processSalary(q);
	    
	    q = w.recruit('k');
	    account.processSalary(q);
		
    
		
	}
 
	

}
