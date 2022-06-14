package com.personamount.sm.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.personamount.sm.api.Person;

public class personRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person =new Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setAmount(rs.getDouble("amount"));
		return person;
	}

}
