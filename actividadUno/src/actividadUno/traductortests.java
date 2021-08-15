package actividadUno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class traductortests {
	
	static String  textodeprueba;
	static String TextoNoTrad;
	static String TextoconMay;
	traductor trad = new traductor();

	@BeforeAll
	static void setUp() {
		textodeprueba= "Hola mundo";
		TextoNoTrad = "123456789";
		TextoconMay= "HOLA COMO ESTAS?";
	}

	//TraduceAUnitTestCases
	
	@Test
	void testTraduceA() {
		String resultado = trad.traduceA(textodeprueba);
		assertEquals("H@l@ m@nd@", resultado);
	}
	
	@Test
	void testNOTraduceA() {
		String resultado = trad.traduceA(TextoNoTrad);
		assertEquals("123456789", resultado);
	}
	
	@Test
	void testTraduceAConMAY() {
		String resultado = trad.traduceA(TextoconMay);
		assertEquals("H@L@ C@M@ @ST@S?", resultado);
	}
	
	//TraduceNumUnitTestCases

	@Test
	void testTraduceNum() {
		String resultado = trad.TraduceNum(textodeprueba);
		assertEquals("H0l4 mund0", resultado);
	}
	
	@Test
	void testNOTraducenNum() {
		String resultado = trad.TraduceNum(TextoNoTrad);
		assertEquals("123456789", resultado);
	}
	
	@Test
	void testTraduceNumConMAY() {
		String resultado = trad.TraduceNum(TextoconMay);
		assertEquals("H0L4 C0M0 E5T45?", resultado);
	}


}
