package com.wellsfargo.stockmarket.stockexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.stockmarket.stockexchange.models.Company;
import com.wellsfargo.stockmarket.stockexchange.models.CompanyToStockExchangeMapper;
import com.wellsfargo.stockmarket.stockexchange.models.StockExchange;
import com.wellsfargo.stockmarket.stockexchange.repository.CompanyRepository;
import com.wellsfargo.stockmarket.stockexchange.repository.CompanyToStockExchangeMapperRepository;
import com.wellsfargo.stockmarket.stockexchange.repository.StockExchangeRepository;

@Service
public class StockExchangeService {

	@Autowired
	private StockExchangeRepository stockExchangeRepository;

	@Autowired
	private CompanyToStockExchangeMapperRepository companyToStockExchangeMapperRepository;

	@Autowired
	private CompanyRepository companyRepository;

	// Returns all the stock exchanges present in database
	public List<StockExchange> getStockExchangeList() {
		return stockExchangeRepository.findAll();
	}

	// Returns stock exchange with the specific id
	public StockExchange getStockExchange(Integer id) {
		return stockExchangeRepository.findById(id).get();
	}

	// Adds a Stock Exchange to our repository
	public void addStockExchange(StockExchange stockExchange) {
		stockExchangeRepository.save(stockExchange);
	}

	// Deletes the Stock Exchange from our repository
	public void deleteStockExchange(Integer id) {
		stockExchangeRepository.deleteById(id);
	}

	public List<CompanyToStockExchangeMapper> getAllCompaniesList(Integer id) {
		
		StockExchange stockExchange = new StockExchange();
		stockExchange = stockExchangeRepository.findById(id).get();
		return companyToStockExchangeMapperRepository.findAllByStockExchange(stockExchange.getStockExchange());

	}

	public List<Company> getCompanies() {

		return companyRepository.findAll();
	}
}
