package com.xantrix.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xantrix.webapp.entities.DettPromo;

public interface DettPromoRepository extends JpaRepository<DettPromo, Long> {
	
	@Query( value = "CALL Sp_SelPromoActive", 
			nativeQuery = true)
	public List<DettPromo> findDettPromoActive();

}
