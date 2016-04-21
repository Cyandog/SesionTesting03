package cl.ubb.agil;

import org.junit.Before;
import org.junit.Test;
import cl.ubb.agil.Categoria;// Importa la clase Categoria de la cual presenta dependencia
import cl.ubb.agil.Existencia;//Importa la clase Existencia de la cual presenta dependencia
import cl.ubb.agil.Producto;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProductoTest {
	
	private Producto producto;
	private String nombre;
	private int minimo=10;
	private int maximo=50;
	private Categoria categoria;
	private Existencia existe;
	
	 @Before 
	 public void setup() throws Exception{
		/*arrange*/
		producto= new Producto(nombre,minimo, maximo, categoria);
	 }
	
	 @Test
	 public void getStock(){
		/*act*/
		int resultado=producto.getStock();
		/*assert*/ 
		assertThat(resultado,is(0));
	 }
	
	 @Test
	 public void isBajoStockProductoTrue(){
	 	/*arrange*/
	 	Producto producto;
	 	producto= new Producto(nombre,minimo,maximo);
	 	/*act*/	
	 	boolean resultado=producto.isBajoStock();
	 	/*assert*/
	 	assertThat(resultado,is(true));
	 }
	 
	 @Test
	 public void isBajoStockProductoFalse(){
		 /*arrange*/
		 Producto producto;
		 producto= new Producto(nombre,minimo,maximo);
		 /*act*/	
		 boolean resultado=producto.isBajoStock();
		 /*assert*/
		 assertThat(resultado,is(false));
	 }
	 
	 
}