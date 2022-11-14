package com.junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @BeforeAll executa o teste uma única vez antes dos outros testes;
 * @BeforeEach executa o teste sempre antes de um @Test ocorrer;
 * @AfterAll executa o teste uma única vez depois dos outros testes;
 * @AfterEach executa o teste sempre depois de um @Test ocorrer;
 * 
 * @Enableif
 * @Disableif
 * 
 * @EnableOn
 * 
 * Definir a ordem de testes (Colocar antes da classe):
 * 
 * @TestMethodOrder(Exemplo: MethodOrderer.OrderAnnotation.class)
 * 
 * @author marcelo
 *
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTest {
	
	@Order(1)
	@Test
	void testarCalculadora() {
		//Assumptions.assume *Só executará o teste se uma condição for atendida;
		Calculadora calculadora = new Calculadora (2.0,'*',4.0);
		Assertions.assertEquals(8.0, calculadora.operar());
	}
	
	@Order(2)
	@Test
	void testarSeRetornarParOuImpar() {
		Calculadora calculadoraPar = new Calculadora (2.0,'*',4.0);
		Calculadora calculadoraImpar = new Calculadora (3.0,'*',5.0);
		
		Assertions.assertTrue(calculadoraPar.isPar());
		Assertions.assertFalse(calculadoraImpar.isPar());
	}

}
