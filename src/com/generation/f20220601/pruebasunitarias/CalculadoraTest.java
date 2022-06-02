package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12,42);//54
		
		//assertEquals(valorEsperado,Resultado);
		assertEquals(54, resultado);
		
	}
	@Test
	public void testRestaNotNull() {
	Calculadora calc = new Calculadora();
	int resultado = calc.resta(9, 4);
	assertNotNull(resultado);
	}
	@Test
	public void testRestaEquals() {
	Calculadora calc = new Calculadora();
	int resultado = calc.resta(9, 4);
	assertEquals("resta", resultado);
	}
	@Test
	public void testRestaNull() {
	Calculadora calc = new Calculadora();
	int resultado = calc.resta(9, 4);
	assertNull(resultado);
	}
	@Test
	public void testRestaNotEquals() {
	Calculadora calc = new Calculadora();
	int resultado = calc.resta(9, 4);
	assertNotEquals(9, resultado);
	}
	@Test
	public void testResto() {
	    Calculadora calc = new Calculadora();

	    String resultado = calc.resto(3);//54

	    //assertEquals("Es par", resultado);//cuando es par
	    //assertTrue("Es Par", Boolean.parseBoolean((resultado)));//cuando es par
	    assertFalse("Es Impar", Boolean.parseBoolean(resultado));//cuando es impar
	    assertNotEquals("Es Par", resultado);//cuando es impar
	    
	}
	
	public String resto(int numero1) {

	    int numero =3;

	    int resultadoResto = (numero % 2);// si el numero es par el resto es 0, si es impar es 1
	    String resultado = "";
	    if (resultadoResto == 0) {
	        resultado="Es par";
	    } else {
	        resultado="Es impar";
	    }

	    return resultado;
	}
	



@Test
public void multiplicacion() {
    Calculadora calc = new Calculadora();
    int resultado = calc.multiplicacion(2, 3);
    assertEquals(6,resultado);
    /*assertTrue(true);
    assertFalse(false);
    assertNull(null, resultado);
    assertNotNull(resultado);
    assertSame("Es igual" ,resultado);
    assertNotSame("No es igual", resultado);*/

}

@Test
public void division() {
    Calculadora calc = new Calculadora();
    String resultado = calc.division(10, 0);
    assertSame("No se puede dividir por 0", resultado);
}

@Test
public void suma() {

    Calculadora calc = new Calculadora();
    int resultado = calc.suma(24,33);
    assertEquals(57,
            resultado);

}
	
	
	@Test
	public void testSuma() {
		fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivision() {
		
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0, 0);
		
		assertEquals("No se puede dividir por cero", resultado);
		assertNotNull(resultado);//el assert valida, ofrece distintos tipos de validaciones
		//control espacio es para ver mas opciones
		assertNotEquals("0", resultado); 
		assertNull(resultado);
		
		
	}
		
		
	}


