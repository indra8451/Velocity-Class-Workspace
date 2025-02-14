package com.interview.collections;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Integer id;
	private String city;
	
	
	public Employee(String name, Integer id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	
	@Override
	public String toString() {
		return "Employee { name=" + name + ", id=" + id + ", city=" + city + "}";
	}

	@Override
	public int compareTo(Employee obj) {
		
		
		//return this.id.compareTo(obj.id);
		//return this.name.compareTo(obj.name);
		return this.city.compareTo(obj.city);
		
	}
	
	
	

}
