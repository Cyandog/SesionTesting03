package cl.ubb.agil;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import cl.ubb.agil.Categoria;

public class CategoriaTest {

	private Categoria categoria;
	private String codigo = "xx001";
	private String nombre = "Televisor";
	

	@Before 
	public void setup() throws Exception{
		categoria= new Categoria(nombre, codigo);
		categoria.setCodigo(codigo);
		categoria.setNombre(nombre);
	}
	
	@Test
	public void getNombreTelevisor(){
		/*arrange*/
		
		/*act*/
		String resultado=categoria.getNombre();
		
		/*assert*/
		assertThat(resultado,is("Televisor"));
	 
	}

	@Test
	public void getCodigoxx001(){
		/*arrange*/
	
		/*act*/
		String resultado=categoria.getCodigo();
		
		/*assert*/
		assertThat(resultado,is("xx001"));
	 
	}
	
	@Test
	public void setNombre(){
		/*arrange*/
		/*act*/
		/*assert*/
	  	assertNotNull(categoria);
    	assertEquals(categoria.getNombre(), nombre);
   
	}
	
	@Test
	public void setCodigo(){
		/*arrange*/
		/*act*/
		/*assert*/
	  	assertNotNull(categoria);
    	assertEquals(categoria.getCodigo(),codigo);
   
	}
}
