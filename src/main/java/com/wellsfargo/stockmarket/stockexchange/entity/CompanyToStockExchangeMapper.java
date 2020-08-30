package com.wellsfargo.stockmarket.stockexchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_x_stockexchange", schema ="stockexchange")
public class CompanyToStockExchangeMapper {

	@Id
	@Column(name = "stockcode")
	private String stockCode;

	@Column(name = "assoccompanyid")
	private Integer assocCompanyId;

	@Column(name = "stockexchange")
	private String stockExchange;

	//Parameterized Constructor
	public CompanyToStockExchangeMapper(String stockCode, Integer assocCompanyId, String stockExchange) {
		super();
		this.stockCode = stockCode;
		this.assocCompanyId = assocCompanyId;
		this.stockExchange = stockExchange;
	}

	//Default Constructor
	public CompanyToStockExchangeMapper() {

	}
	
	//Getters and Setters
	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public Integer getAssocCompanyId() {
		return assocCompanyId;
	}

	public void setAssocCompanyId(Integer assocCompanyId) {
		this.assocCompanyId = assocCompanyId;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	
	
}
