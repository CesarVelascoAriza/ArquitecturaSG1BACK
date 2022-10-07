package co.edu.ucentral.servicio.parametro;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.edu.ucentral.commons.model.Categoria;
import co.edu.ucentral.servicio.categoria.controller.ParametroController;

@SpringBootTest(classes = ParametroController.class)
@AutoConfigureMockMvc
class ServicioParametroApplicationTests {

	@MockBean
	private ParametroController controller;
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	void contextLoads() throws Exception {
		
		mockMvc.perform(get("/")
				.accept(MediaType.ALL)
		)
		.andDo(print())
		.andExpect(status().isOk()
		);
		
	}

	
	/*@Test
	@DisplayName("prueba dos con el post")
	void contextLoadspost() throws Exception {
		Categoria categoria = new Categoria();
		categoria.setNombre("prueba");
		mockMvc.perform(post("/")
				.accept(MediaType.APPLICATION_JSON)
				.characterEncoding("utf-8")
				.content(asJsonString(categoria))
				.contentType(MediaType.APPLICATION_JSON)
				
				
		)
		
		.andDo(print())
		.andExpect(status().isOk()
		);
		
	}
	*/
	 static String asJsonString(final Object obj) {
	        try {
	            return new ObjectMapper().writeValueAsString(obj);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

}
