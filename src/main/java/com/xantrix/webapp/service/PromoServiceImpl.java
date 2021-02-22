package com.xantrix.webapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xantrix.webapp.entities.Promo;
import com.xantrix.webapp.repository.PromoRepository;

@Service
public class PromoServiceImpl implements PromoService {
	
	private static Logger log = LoggerFactory.getLogger(PromoServiceImpl.class);
	
	@Autowired
	private PromoRepository promoRepository;

	@Override
	public List<Promo> SelTutti() {
		log.info("SelTutti - START");
		log.info("SelTutti - END");
		return null;
	}

	@Override
	public Promo SelByIdPromo(String idPromo) {
		log.info("SelByIdPromo - START - idPromo={}", idPromo);
		log.info("SelTutti - END");
		return null;
	}

	@Override
	public void InsPromo(Promo promo) {
		log.info("InsPromo - START - promo={}", promo);
		log.info("SelTutti - END");
	}

	@Override
	public void DelPromo(Promo promo) {
		log.info("DelPromo - START - promo={}", promo);
		log.info("SelTutti - END");
	}
}