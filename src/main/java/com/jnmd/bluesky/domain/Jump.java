package com.jnmd.bluesky.domain;

public class Jump {
	private int r_id;
	private String position;
	private String describe;
	private String requirement;
	private String salary;
	private int number;
	public Jump() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jump(String position, String describe, String requirement, String salary, int number) {
		super();
		this.position = position;
		this.describe = describe;
		this.requirement = requirement;
		this.salary = salary;
		this.number = number;
	}
	public Jump(int r_id, String position, String describe, String requirement, String salary, int number) {
		super();
		this.r_id = r_id;
		this.position = position;
		this.describe = describe;
		this.requirement = requirement;
		this.salary = salary;
		this.number = number;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Jump [r_id=" + r_id + ", position=" + position + ", describe=" + describe + ", requirement="
				+ requirement + ", salary=" + salary + ", number=" + number + "]";
	}
	
}
