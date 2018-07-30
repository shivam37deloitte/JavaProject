package com.deloitte.abc;


import java.util.Collection;
import java.util.Iterator;

import com.deloitte.daos.User;
import com.deloitte.daos.UserDAO;

	public class MainClass {

		public static void main(String[] args) {
			UserDAO udao = new UserDAO();
			User user = new User(1,"shivamm46","Shivam","mishra","pass","E");
			
			udao.save(user);
			Collection<User> users= udao.getAll();
			Iterator<User> userIterator=users.iterator();
			while(userIterator.hasNext()) {
				user= userIterator.next();
				System.out.println(user);
			}
			

		}

	}

