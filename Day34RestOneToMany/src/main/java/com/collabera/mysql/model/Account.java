package com.collabera.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.collabera.mysql.types.AccountType;

@Entity
public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(columnDefinition = "integer default 0")
	private Integer amount;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private AccountType type;
	
	@ManyToOne
	@JoinColumn
	private Customer customer;

	public Account() {
		this(-1L, 0, AccountType.CHECKING);
	}
	public Account(Long id, @NotNull Integer amount, @NotNull AccountType type) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
