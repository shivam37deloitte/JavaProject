package java.deloitte.abc;


	
	import java.util.ArrayList;

	
	import java.util.Collections;
	import java.util.Scanner;

	
	public class EmployeeMain {
		public EmployeeMain() {

		}

		public static void main(String[] args) {
			EmployeeBo b = new EmployeeBo();
			EmployeeSort s = new EmployeeSort();

			Scanner sc = new Scanner(System.in);

			System.out.println("enter the number of Employees");
			int number = sc.nextInt();

			ArrayList<EmployeeVo> list = new ArrayList<EmployeeVo>();

			try {
				for (int i = 0; i < number; i++) {
					System.out.println("enter The ID"+(i+1));
					int id = sc.nextInt();
					System.out.println("enter The EmpName"+(i+1));
					String EmpName = sc.next();
					System.out.println("enter The AnnualIncome"+(i+1));
					double annual = sc.nextDouble();
					list.add(new EmployeeVo(id, EmpName, annual, 0));
					b.CalincomeTax(list.get(i));
				}
			} catch (Exception e) {
				
				System.out.println("enter correctly");
			}
			
			for (EmployeeVo emplyeeVo : list) {
				System.out.println(emplyeeVo);
			}
			Collections.sort(list, s);
			
			System.out.println("sorted listed is");
			for (EmployeeVo emplyeeVo : list) {
				System.out.println(emplyeeVo);
			}
			sc.close();

		}

	}


