package com.deloitte.springhibernate.SpringMVCHibernate.service;

import java.util.List;

import com.deloitte.springhibernate.SpringMVCHibernate.model.Person;





public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
