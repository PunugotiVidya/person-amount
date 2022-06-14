package com.personamount.sm.api;

public class Person {
	
	private int id;
	private String name;
	private Double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	
	

}
