package com.huhytechnologies.pojos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("act.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

	    jc.getAddressList();
	    jc.getAddressSet();
	    jc.getAddressMap();
	    jc.getAddressProp();

	}

}
