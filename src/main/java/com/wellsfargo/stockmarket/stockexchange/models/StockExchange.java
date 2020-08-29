package com.wellsfargo.stockmarket.stockexchange.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_exchange")
public class StockExchange {
	
	@Id
	private Integer id;
	private String name;
	private String brief;
	private String address;
	private String remarks;
	
	//Default Constructor
	public StockExchange() {
		//do nothing
	}
	
	//Constructor
	public StockExchange(Integer id, String name, String brief, String address, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
	}
	
	//Getters and Setters
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	


}
