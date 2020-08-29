package com.wellsfargo.stockexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wellsfargo.stockexchange.models.StockExchange;

public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
