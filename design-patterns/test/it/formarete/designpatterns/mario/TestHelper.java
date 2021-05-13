package it.formarete.designpatterns.mario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import it.formarete.designpatterns.mario.god.GodMario;
import it.formarete.designpatterns.mario.god.Type;

public class TestHelper {
	static void testBaseMario (Mario mario) {
		assertEquals("crouch", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("jump", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("run", mario.onKeyPressed(KeyCode.ACTION));
}
	static void testSuperMario(Mario mario2) {
		Mario mario = new GodMario(Type.SUPER);

		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("jump", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("run", mario.onKeyPressed(KeyCode.ACTION));
}
	static void testFireMario(Mario mario2) {
		Mario mario = new GodMario(Type.FIRE);

		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("jump", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("shoot", mario.onKeyPressed(KeyCode.ACTION));
	}
	static void testCapeMario(Mario mario2) {
		Mario mario = new GodMario(Type.CAPE);

		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("glide", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("run", mario.onKeyPressed(KeyCode.ACTION));
	}
	static void testUltraMario(Mario mario2) {
		Mario mario = new GodMario(Type.ULTRA);

		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("glide", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("shoot", mario.onKeyPressed(KeyCode.ACTION));
	}
	static void testMushroom() {
		Mario mario = new GodMario(Type.BASE);

		assertEquals("crouch", mario.onKeyPressed(KeyCode.DOWN));
		((GodMario)mario).setType(Type.SUPER);
		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
	}
}