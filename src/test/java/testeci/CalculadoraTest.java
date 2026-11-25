package testeci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		// arrange
		
		// act
		float resultado = new Calculadora().somar(4f, 4f);
		
		// assert
		Assertions.assertEquals(9f, resultado);
	}

}
