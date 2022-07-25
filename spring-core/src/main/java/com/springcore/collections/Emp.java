package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		Address = address;
		this.courses = courses;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	private Set<String> Address;
	private Map<String, String> courses; 
}
