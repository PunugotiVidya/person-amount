package com.personamount.sm.DAO;

import java.util.List;

import com.personamount.sm.api.Person;
import com.personamount.sm.api.PersonDTO;

public interface PersonDAO {
	
	public List<Person> loadPersons();
	public void savePerson(Person person);
	public void updatePerson(Person person);
	public void deletePerson(int id);
	public Person getPerson(int id);

}
