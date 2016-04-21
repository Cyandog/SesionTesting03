package cl.ubb.agil;

import org.junit.Before;
import org.junit.Test;
import cl.ubb.agil.Existencia;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ExistenciaTest {
	
	private Existencia existe;
	private String numero;

	@Before 
	public void setup() throws Exception{	
		existe= new Existencia(numero);
	}
	
	@Test
	public void TestgetNumeroCero(){
		/*arrange*/
		Existencia existTest=new Existencia("0");
		/*act*/
		String resultado=existTest.getNumero();
		/*assert*/
		assertThat(resultado,is("0"));
	}
	
	@Test
	public void TestgetNumeroDiez(){
		 /*arrange*/
		 Existencia existTest=new Existencia("10");
		 /*act*/
		 String resultado=existTest.getNumero();
		 /*assert*/
		 assertThat(resultado,is("10"));
	}
}