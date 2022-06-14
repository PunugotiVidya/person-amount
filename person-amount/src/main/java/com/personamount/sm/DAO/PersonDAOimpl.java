package com.personamount.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.personamount.sm.api.Person;
import com.personamount.sm.rowMapper.personRowMapper;

@Repository
public class PersonDAOimpl implements PersonDAO {


	@Autowired
	JdbcTemplate jdbctemplate;

	
	
	public List<Person> loadPersons() {
		String sql = "SELECT * FROM PERSON";
		List<Person> persons = jdbctemplate.query(sql,new personRowMapper());
		return persons;
	}

	public void savePerson(Person person) {
		Object[] args = {person.getName(),person.getAmount()};
		String sql = "insert into person(name,amount) values(?,?)";
		jdbctemplate.update(sql,args);
		System.out.println("1 row inserted.......");
		
	}

	public void deletePerson(int id) {
		String query ="DELETE FROM PERSON WHERE ID=?";
		jdbctemplate.update(query,id);

	}
	
	public void updatePerson(Person person) {
		String query = "UPDATE PERSON SET NAME=?,AMOUNT=? WHERE ID=?";
		Object [] args = {person.getName(),person.getAmount(),person.getId()};
		jdbctemplate.update(query,args);

	}

	public Person getPerson(int id) {
		String query = "SELECT * FROM PERSON WHERE ID=?";
		Person person = jdbctemplate.queryForObject(query, new personRowMapper(), id);
		return person;
	}


}
