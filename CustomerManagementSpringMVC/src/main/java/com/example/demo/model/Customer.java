package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private Long phone;
	private String address;
	public Customer(String name, String email, Long phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
}
