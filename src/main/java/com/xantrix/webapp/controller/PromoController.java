package com.xantrix.webapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xantrix.webapp.entities.Promo;
import com.xantrix.webapp.exception.NotFoundException;
import com.xantrix.webapp.service.PromoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/api/promo")
public class PromoController {
	
	private static final Logger log = LoggerFactory.getLogger(PromoController.class);

	@Autowired
	private PromoService promoService;

	@ApiOperation( value = "", 
		      	   notes = "",
		      	   response = Double.class
	)
	@ApiResponses( value = { @ApiResponse(  code = 200, 
						   				    message = "Chiamata Ok" )
				   }
	)
	@GetMapping( path = "/cerca/tutti",
				 produces = "application/json"
	)
	public ResponseEntity<?> listAllPromo() throws NotFoundException {
		log.info("==> GET /api/promo/cerca/tutti");
		log.info("listAllPromo - START");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		List<Promo> listPromo = this.promoService.SelTutti();
		if(listPromo == null || listPromo.isEmpty()) {
			String errorMsg = String.format("Non è stata trovata alcuna promozione!");
			log.info(errorMsg);
			throw new NotFoundException(errorMsg);
		}
		
		log.info("<== [{}]", listPromo != null? listPromo.size() + " items retrieved": null);
		log.info("listAllPromo - END");
		return new ResponseEntity<>(listPromo, headers, HttpStatus.OK);		 
	}

}
