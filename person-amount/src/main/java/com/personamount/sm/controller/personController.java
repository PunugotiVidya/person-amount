package com.personamount.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.personamount.sm.api.Person;
import com.personamount.sm.services.PersonService;

@Controller
public class personController {
	
	@Autowired
	PersonService personservice;
	
	@GetMapping("/loadpersons")
	public String loadPersons(Model model) {
		List<Person> persons = personservice.loadPersons();
		model.addAttribute("persons", persons);
		return "person-list";
	}
	
	@GetMapping("/personAddList")
	public String personAddList(Model model) {
		//List<Person> persons = personservice.loadPersons();
		model.addAttribute("person", new Person());
		return "add-person";
	}
	
	
	@GetMapping("/updatePerson")
	public String updatePerson(@RequestParam("userId")int id,Model model) {
		System.out.println(id);
		model.addAttribute("person",personservice.getPerson(id));
		return "add-person";
		
	}
	
	@GetMapping("/deletePerson")
	public String deletePerson(@RequestParam("userId")int id) {
		personservice.deletePerson(id);
		return "redirect:/loadpersons";
		
	}
	@PostMapping("save-person")
	public String personSave(Person person) {
		System.out.println(person);
		
		if(person.getId()==0) {
			personservice.savePerson(person);
		}
		else {
			personservice.updatePerson(person);
		}
		return "redirect:/loadpersons";
	}
	
	
	 

}
