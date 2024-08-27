package com.ProjetoTestCalculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 10 + 7 = 17")
	void testsoma() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 10D;
		double valor2 = 7D;
		double esperado = 17D;
		
		double resultado = calc.soma(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "10 + 7 não gerou o valor 17");
	}
	@Test
	@DisplayName(" Teste 10 - 7 = 3")
	void testmenos() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 10D;
		double valor2 = 7D;
		double esperado = 3D;
		
		double resultado = calc.menos(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "10 - 7 não gerou o valor 3");
	}
	@Test
	@DisplayName(" Teste 10 * 7 = 70")
	void testmultiplicacao() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 10D;
		double valor2 = 7D;
		double esperado = 70D;
		
		double resultado = calc.multiplicacao(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "10 * 7 não gerou o valor 70");
	}
	@Test
	@DisplayName(" Teste 10 / 2 = 5")
	void testdivisao() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 10D;
		double valor2 = 2D;
		double esperado = 5D;
		
		double resultado = calc.divisao(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "10 / 2 não gerou o valor 5");
	}
}
