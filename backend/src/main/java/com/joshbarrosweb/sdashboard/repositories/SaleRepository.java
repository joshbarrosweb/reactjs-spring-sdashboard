package com.joshbarrosweb.sdashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joshbarrosweb.sdashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
