package com.wellsfargo.stockmarket.stockexchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_x_stockexchange", schema = "stockexchange")
public class CompanyToStockExchangeMapper {

	@Id
	@Column(name = "stockcode")
	private String stockCode;
	
	@Column(name = "assoccompanycode")
	private Integer assocCompanyCode;
	
	@Column(name = "stockexchange")
	private String stockExchange;




	// Default Constructor
	public CompanyToStockExchangeMapper() {

	}

	// Parameterized Constructor
	
	public CompanyToStockExchangeMapper(Integer assocCompanyCode, String stockExchange, String stockCode) {
		super();
		this.assocCompanyCode = assocCompanyCode;
		this.stockExchange = stockExchange;
		this.stockCode = stockCode;
	}
	
	// Getters and Setters
	
	public Integer getAssocCompanyCode() {
		return assocCompanyCode;
	}

	public void setAssocCompanyCode(Integer assocCompanyCode) {
		this.assocCompanyCode = assocCompanyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
}
	
	
	
	

	