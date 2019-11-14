package com.collabera.jdbcdemo.model;

public class City {
	private int id;
	private String name;
	private String disctrict;
	private int population;
	private String countryCode;
	public City() {
		super();
	}
	
	public City(int id, String name, String disctrict, int population, String countryCode) {
		super();
		this.setId(id);
		this.setName(name);
		this.setDisctrict(disctrict);
		this.setPopulation(population);
		this.setCountryCode(countryCode);
	}
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
	public String getDisctrict() {
		return disctrict;
	}

	public void setDisctrict(String disctrict) {
		this.disctrict = disctrict;
	}
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", disctrict=" + disctrict + ", population=" + population
				+ ", countryCode=" + countryCode + "]";
	}
	
}
