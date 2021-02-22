package com.xantrix.webapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xantrix.webapp.entities.DettPromo;
import com.xantrix.webapp.repository.DettPromoRepository;

@Service
public class DettPromoServiceImpl implements DettPromoService {
	
	private static Logger log = LoggerFactory.getLogger(DettPromoServiceImpl.class);
	
	@Autowired
	private DettPromoRepository dettPromoRepository;

	@Override
	public List<DettPromo> SelDettPromoByCodFid(String codFid) {
		log.info("SelDettPromoByCodFid - START - codFid={}", codFid);
		log.info("SelDettPromoByCodFid - END");
		return null;
	}

	@Override
	public List<DettPromo> SelDettPromoByCode(String codice) {
		log.info("SelDettPromoByCode - START - codice={}", codice);
		log.info("SelDettPromoByCode - END");
		return null;
	}

}
