package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String city;
	private String email;
	private Long phone;
	public Customer() {
	}
	public Customer(Long id, String name, String city, String email, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
}
