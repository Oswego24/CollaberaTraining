package com.collabera.mysql.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(name = "firstName")
	private String firstName;
	
	@NotNull
	@Column(name = "lastName")
	private String lastName;

	@NotNull
	@Column(columnDefinition = "char(4) default '####'")
	private String pin;
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Account> accounts;
	
	public Customer() {
		this(-1L, "n/a", "n/a", "####", new ArrayList<Account>());
	}
	
	public Customer(Long id, @NotBlank String firstName, @NotBlank String lastName, String pin, List<Account> accounts) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
		this.accounts = accounts;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		for(int i=0; i<accounts.size(); i++) {
			addAccount(accounts.get(i));
		}
	}
	
	private void addAccount(Account account) {
		account.setCustomer(this);
		accounts.add(account);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", pin=" + pin
				+ ", accounts=" + accounts + "]";
	}
}
