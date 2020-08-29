package com.wellsfargo.stockmarket.stockexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.stockmarket.stockexchange.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	

}
