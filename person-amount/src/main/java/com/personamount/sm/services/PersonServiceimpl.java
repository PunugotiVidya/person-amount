package com.personamount.sm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.personamount.sm.DAO.PersonDAO;
import com.personamount.sm.api.Person;
import com.personamount.sm.rowMapper.personRowMapper;

@Service
public class PersonServiceimpl implements PersonService {
	
	@Autowired
	private PersonDAO personDAO;
	

	public List<Person> loadPersons() {
		List<Person> persons = personDAO.loadPersons();
		return persons;
	}

	public void savePerson(Person person) {
		personDAO.savePerson(person);

	}


	public void updatePerson(Person person) {
		personDAO.updatePerson(person);
		
	}

	public void deletePerson(int id) {
		personDAO.deletePerson(id);
		
	}

	public Person getPerson(int id) {
		Person person = personDAO.getPerson(id);
		return person;
	}


}
