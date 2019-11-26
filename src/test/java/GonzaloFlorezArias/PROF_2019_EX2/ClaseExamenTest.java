package GonzaloFlorezArias.PROF_2019_EX2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {

	@Test
	public void testSeis() throws EntradaInvalida {
		List<Integer> LISTA_CORRECTA = new ArrayList<Integer>();
		LISTA_CORRECTA.add(2);
		LISTA_CORRECTA.add(3);
		
		assertEquals("Correcto", LISTA_CORRECTA, ClaseExamen.primos(6));
	}
	
	@Test
	public void testTrece() throws EntradaInvalida {
		List<Integer> LISTA_CORRECTA = new ArrayList<Integer>();
		LISTA_CORRECTA.add(13);
		
		assertEquals("Correcto", LISTA_CORRECTA, ClaseExamen.primos(13));
	}
	
	@Test
	public void testVeinticinco() throws EntradaInvalida {
		List<Integer> LISTA_CORRECTA = new ArrayList<Integer>();
		LISTA_CORRECTA.add(5);
		LISTA_CORRECTA.add(5);
		
		assertEquals("Correcto", LISTA_CORRECTA, ClaseExamen.primos(25));
	}
	
	@Test(expected = EntradaInvalida.class)
	public void testInvalido() throws EntradaInvalida {
		//Pongo 1 como expected pero da igual, debe saltar excepción
		assertEquals("Error: el parámetro debe ser un entero positivo", 1, ClaseExamen.primos(0));
	}

}
