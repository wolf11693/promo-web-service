package com.xantrix.webapp.controllertest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.junit.runners.MethodSorters;

import com.xantrix.webapp.Application;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PrezziPromoControllerTest {
	
	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;
    
    @Before
	public void setup(){
    	final DefaultMockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(wac);
		this.mockMvc = mockMvcBuilder.build();
    }
   
    @Test
	public void A_TestInserisciPromo() throws Exception {
    	final String JSON_DATA_OBJECT = "{\"idPromo\": \"481AD25F-ED20-40FA-B01F-B031B20EB47C\",    \r\n" + 
							    		" \"anno\": 2018,    \r\n" + 
							    		" \"codice\": \"TS01\",    \r\n" + 
							    		" \"descrizione\": \"PROMO TEST 1\",\r\n" + 
							    		" \"dettPromo\": [\r\n" + 
							    		" \r\n" + 
							    		"	{ \"id\": \"-1\", \r\n" + 
							    		"	  \"riga\": 1,            \r\n" + 
							    		"	  \"codart\": \"002000301\",            \r\n" + 
							    		"	  \"codfid\": null,            \r\n" + 
							    		"	  \"inizio\": \"2018-10-01\",            \r\n" + 
							    		"	  \"fine\": \"2018-12-31\",            \r\n" + 
							    		"	  \"oggetto\": \"0,29\",            \r\n" + 
							    		"	  \"isfid\": \"Si\",            \r\n" + 
							    		"	  \"tipoPromo\": {                \r\n" + 
							    		"		\"descrizione\": \"TAGLIO PREZZO\",\r\n" + 
							    		"		\"idTipoPromo\": \"1\"  }        \r\n" + 
							    		"	},\r\n" + 
							    		"	{ \"id\": \"-1\", \r\n" + 
							    		"	  \"riga\": 2,            \r\n" + 
							    		"	  \"codart\": \"000087101\",            \r\n" + 
							    		"	  \"codfid\": null,            \r\n" + 
							    		"	  \"inizio\": \"2018-10-01\",            \r\n" + 
							    		"	  \"fine\": \"2018-12-31\",            \r\n" + 
							    		"	  \"oggetto\": \"1,99\",            \r\n" + 
							    		"	  \"isfid\": \"Si\",            \r\n" + 
							    		"	  \"tipoPromo\": {                \r\n" + 
							    		"		\"descrizione\": \"TAGLIO PREZZO\",\r\n" + 
							    		"		\"idTipoPromo\": \"1\"  }        \r\n" + 
							    		"	},\r\n" + 
							    		"	{ \"id\": \"-1\", \r\n" + 
							    		"	  \"riga\": 3,            \r\n" + 
							    		"	  \"codart\": \"007288701\",            \r\n" + 
							    		"	  \"codfid\": null,            \r\n" + 
							    		"	  \"inizio\": \"2018-10-01\",            \r\n" + 
							    		"	  \"fine\": \"2018-12-31\",            \r\n" + 
							    		"	  \"oggetto\": \"3,29\",            \r\n" + 
							    		"	  \"isfid\": \"Si\",            \r\n" + 
							    		"	  \"tipoPromo\": {                \r\n" + 
							    		"		\"descrizione\": \"TAGLIO PREZZO\",\r\n" + 
							    		"		\"idTipoPromo\": \"1\"  }        \r\n" + 
							    		"	},\r\n" + 
							    		"	{ \"id\": \"-1\", \r\n" + 
							    		"	  \"riga\": 4,            \r\n" + 
							    		"	  \"codart\": \"002000301\",            \r\n" + 
							    		"	  \"codfid\": 67000028,            \r\n" + 
							    		"	  \"inizio\": \"2018-10-01\",            \r\n" + 
							    		"	  \"fine\": \"2018-12-31\",            \r\n" + 
							    		"	  \"oggetto\": \"0,27\",            \r\n" + 
							    		"	  \"isfid\": \"Si\",            \r\n" + 
							    		"	  \"tipoPromo\": {                \r\n" + 
							    		"		\"descrizione\": \"TAGLIO PREZZO\",\r\n" + 
							    		"		\"idTipoPromo\": \"1\"  }        \r\n" + 
							    		"	},\r\n" + 
							    		"	{ \"id\": \"-1\", \r\n" + 
							    		"	  \"riga\": 5,            \r\n" + 
							    		"	  \"codart\": \"000087101\",            \r\n" + 
							    		"	  \"codfid\": null,            \r\n" + 
							    		"	  \"inizio\": \"2018-09-01\",            \r\n" + 
							    		"	  \"fine\": \"2018-12-31\",            \r\n" + 
							    		"	  \"oggetto\": \"1,89\",            \r\n" + 
							    		"	  \"isfid\": \"Si\",            \r\n" + 
							    		"	  \"tipoPromo\": {                \r\n" + 
							    		"		\"descrizione\": \"TAGLIO PREZZO\",\r\n" + 
							    		"		\"idTipoPromo\": \"1\"  }        \r\n" + 
							    		"	}],\r\n" + 
							    		"	\"depRifPromo\": [\r\n" + 
							    		"		{\r\n" + 
							    		"			\"id\": 4,\r\n" + 
							    		"            \"idDeposito\": 525\r\n" + 
							    		"        }\r\n" + 
							    		"	]\r\n" + 
							    		"}";

    	
		MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.post("http://localhost:50061/api/promo/inserisci")
																			  .contentType(MediaType.APPLICATION_JSON)
																			  .content(JSON_DATA_OBJECT)
																			  .accept(MediaType.APPLICATION_JSON);

		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isCreated() )
				.andDo( print() );
	}
    
    @Test
	public void B_GetPrzCodArtInPromoTest() throws Exception {
    	final String codiceArticolo = "002000301";
		MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.get("http://localhost:50061/api/prezzo/promo/codice/" + codiceArticolo)
																			  .accept(MediaType.APPLICATION_JSON);
		
		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isOk() )
				.andExpect( content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) )
				.andExpect( jsonPath("$").value("0.29") ) 
				.andReturn();
    }

    @Test
	public void C_GetPrzCodArtInPromoTest2() throws Exception {
    	final String codiceArticolo = "000087101";
		MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.get("/prezzo/promo/codice/" + codiceArticolo)
																			  .accept(MediaType.APPLICATION_JSON);
		
		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isOk() )
				.andExpect( content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) )
				.andExpect( jsonPath("$").value("1.89") ) 
				.andReturn();
    }

    @Test
	public void D_GetPrzFidelityInPromoTest() throws Exception {
    	final String codiceFidelity = "67000028";
    	final String codiceArticolo = "002000301";
		MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.get("http://localhost:50061/api/prezzo/promo/fidelity/" + codiceFidelity + "/" + codiceArticolo)
																			  .accept(MediaType.APPLICATION_JSON);
		
		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isOk() )
				.andExpect( content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) )
				.andExpect( jsonPath("$").value("0.27") ) 
				.andReturn();
    }
    
    @Test
	public void E_GetPrzCodArtNonInPromoTest() throws Exception {
    	final String codiceArticolo = "000087102";
    	MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.get("http://localhost:50061/api//prezzo/promo/codice/" + codiceArticolo)
																			  .accept(MediaType.APPLICATION_JSON);
		
		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isOk() )
				.andExpect( content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) )
				.andExpect( jsonPath("$").doesNotExist() ) 
				.andReturn();
    }

    @Test
	public void F_GetPrzFidelityNonInPromoTest() throws Exception {
    	final String codiceFidelity = "67000029";
    	final String codiceArticolo = "002000301";
		MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.get("http://localhost:50061/api//prezzo/promo/fidelity/" + codiceFidelity + "/" + codiceArticolo)
																			  .accept(MediaType.APPLICATION_JSON);
		
		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isOk() )
				.andExpect( content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) )
				.andExpect( jsonPath("$").doesNotExist() ) 
				.andReturn();
    }
    
    @Test
	public void G_deletePromo() throws Exception {
    	final String codicePromo = "481AD25F-ED20-40FA-B01F-B031B20EB47C";
		MockHttpServletRequestBuilder mockHttpRequest = MockMvcRequestBuilders.delete("http://localhost:50061/api/promo/elimina/" + codicePromo)
																			  .accept(MediaType.APPLICATION_JSON);
		
		mockMvc
				.perform( mockHttpRequest )
				.andExpect( status().isOk() )
				.andExpect( content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) )
				.andDo( print() );
	}
}