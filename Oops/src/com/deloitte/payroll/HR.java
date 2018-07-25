package com.deloitte.payroll;

public class HR extends Employee
{

	public Employee recruit (char empType)
	{
		Employee employee=null;
		if(empType=='I' || empType=='i') {
			employee = new Interns();
		}else if(empType=='P'|| empType=='p' ) {
			employee = new ConfirmedEmployee();
		}else if(empType=='C' || empType=='c') {
			employee = new ContractEmployee();
		}
		return employee;
		
	}

	@Override
	public void netSalary() {
		
		
	}
	
}
