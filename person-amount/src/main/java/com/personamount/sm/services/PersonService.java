package com.personamount.sm.services;

import java.util.List;

import com.personamount.sm.api.Person;

public interface PersonService {
	public List<Person> loadPersons();
	public void savePerson(Person person);
	public void deletePerson(int id);
	public void updatePerson(Person person);
	public Person getPerson(int id);

}
