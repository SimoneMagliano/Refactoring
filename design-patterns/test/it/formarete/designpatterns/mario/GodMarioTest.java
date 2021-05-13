package it.formarete.designpatterns.mario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mario.god.GodMario;
import it.formarete.designpatterns.mario.god.Type;

public class GodMarioTest {
	@Test
	public void testBaseMario() {
		Mario mario = new GodMario(Type.BASE);

		TestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new GodMario(Type.SUPER);
		
		TestHelper.testSuperMario(mario);
	}
	
	@Test
	public void testFireMario() {
		Mario mario = new GodMario(Type.FIRE);

		TestHelper.testFireMario(mario);
	}
	@Test
	public void testCapeMario() {
		Mario mario = new GodMario(Type.CAPE);

		TestHelper.testCapeMario(mario);
	}
	@Test
	public void testUltraMario() {
		Mario mario = new GodMario(Type.ULTRA);
		TestHelper.testUltraMario(mario);
	}
	@Test
	public void testMushroom() {
		Mario mario = new GodMario(Type.BASE);

		assertEquals("crouch", mario.onKeyPressed(KeyCode.DOWN));
		((GodMario)mario).setType(Type.SUPER);
		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
	}
}
