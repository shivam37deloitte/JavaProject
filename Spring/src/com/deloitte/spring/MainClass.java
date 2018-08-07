package com.deloitte.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.HelloIndia;
import com.deloitte.pojo.HelloWorld;
import com.deloitte.pojo.Point;
import com.deloitte.pojo.TextEditor;

public class MainClass {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");

	/*	Point point = (Point) context.getBean("pointBean");
		System.out.println(point);

		Point point2 = (Point) context.getBean("pointBean");
		point2.setX(2);
		point2.setY(7);
		System.out.println(point2);

		HelloWorld objA = (HelloWorld) context.getBean("HelloWorld");
		objA.getMessage1();
		objA.getMessage2();

		HelloIndia objB = (HelloIndia) context.getBean("HelloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
		
		TextEditor txt = (TextEditor) context.getBean("TextEditorCDI");
		txt.spellCheck();
		txt.getName();
		
		TextEditor txt1 = (TextEditor) context.getBean("TextEditorSDI");
		txt1.spellCheck();
		txt1.getName();
		
		TextEditor txt2 = (TextEditor) context.getBean("TextEditorASD");
		txt2.spellCheck();
		txt2.getName();
		
		TextEditor txt3 = (TextEditor) context.getBean("TextEditorCDIABC");
		txt3.spellCheck();
		txt3.getName();
		
		TextEditor txt4 = (TextEditor) context.getBean("TextEditorQAZ");
		txt4.spellCheck();
		txt4.getName();
*/
	}

}
