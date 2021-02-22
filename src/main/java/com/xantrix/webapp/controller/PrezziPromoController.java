package com.xantrix.webapp.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xantrix.webapp.exception.NotFoundException;
import com.xantrix.webapp.service.DettPromoServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/api/prezzo/promo")
public class PrezziPromoController {
	
	private static final Logger log = LoggerFactory.getLogger(PrezziPromoController.class);
 
	@Autowired
	private DettPromoServiceImpl dettPromoServiceImpl;

	@ApiOperation( value = "", 
		      	   notes = "",
		      	   response = Double.class
	)
	@ApiResponses( value = { @ApiResponse(  code = 200, 
						   				    message = "Chiamata Ok" )
				   }
	)
	@GetMapping( path = "/fidelity/{codFid}/{codArt}")
	public Optional<Double> getPricePromoFid(
				@PathVariable("codFid") String codiceFidelity,
				@PathVariable("codArt") String codiceArticolo ) throws NotFoundException {
		log.info("==> GET /api/prezzo/promo/fidelity/{}/{}", codiceFidelity, codiceArticolo);
		log.info("getPricePromoFid - START - codiceFidelity={}, codiceArticolo={}", codiceFidelity, codiceArticolo);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// TODO
		
		
//		log.info("<== [{}]", listPromo.size() + "items retrieved");
		log.info("getPricePromoFid - END");
		return null;
	}

}
