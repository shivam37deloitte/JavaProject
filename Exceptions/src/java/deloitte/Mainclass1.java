package java.deloitte;
import java.util.Scanner;


public class Mainclass1 {
			
			public static void main (String[] args) {
			int a;
			int b;
			Scanner sc=new Scanner(System.in);
			a=Integer.parseInt(args[0]);
			a=sc.nextInt();
			b=Integer.parseInt(args[1]);
			b=sc.nextInt();
			try 
			{
			System.out.println(a+b);
			System.out.println("end of try block");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("please enter");
			}catch(NumberFormatException e2) {
				System.out.println("please enter valid numbers");
			}catch(ArithmeticException e3) {
				System.out.println("cannot be divided by zero");
			}
			sc.close();
		}
	}

