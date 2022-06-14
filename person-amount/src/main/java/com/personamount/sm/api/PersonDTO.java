package com.personamount.sm.api;

public class PersonDTO {
	
	private Long id;
	private String name;
	private Double amount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		return "PersonDTO [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	

}
