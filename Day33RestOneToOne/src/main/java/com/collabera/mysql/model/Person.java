package com.collabera.mysql.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "person_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	@Column(name = "firstName")
	private String firstName;
	
	@NotBlank
	@Column(name = "lastName")
	private String lastName;
	
	@NotNull
	@Column(name = "date_of_birth")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern= "yyyy-MM-dd", timezone="CST")
	private Date dob;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Address address;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Person() {
		this(-1, "N/A", "N/A", new Date(0), new Address());
	}

	public Person(long id, @NotBlank String firstName, @NotBlank String lastName, @NotNull Date dob, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob +  "address" + address + "]";
	}
}
