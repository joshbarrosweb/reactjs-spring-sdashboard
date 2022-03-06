package com.joshbarrosweb.sdashboard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.joshbarrosweb.sdashboard.dto.SaleSuccessDTO;
import com.joshbarrosweb.sdashboard.dto.SaleSumDTO;
import com.joshbarrosweb.sdashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.joshbarrosweb.sdashboard.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
				+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.joshbarrosweb.sdashboard.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
