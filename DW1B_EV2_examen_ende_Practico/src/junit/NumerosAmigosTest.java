package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos n1 = new NumerosAmigos(221,284);
		assertFalse(n1.amigo());
	}

	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos n2 = new NumerosAmigos(496,496);
		assertTrue(n2.amigo());
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos n3 = new NumerosAmigos(0,20);
		assertNull(n3.esN1IgualAN2());
	}
	
	@Test
	public void testN1yN2sonIguales() {
		NumerosAmigos n4 = new NumerosAmigos(221,221);
		assertEquals(1,n4.esN1IgualAN2(),0);
	}

	@Test
	public void testN1yN2NosonIguales() {
		NumerosAmigos n5 = new NumerosAmigos(20,221);
		assertNotEquals(1,n5.esN1IgualAN2(),0);
	}
}
