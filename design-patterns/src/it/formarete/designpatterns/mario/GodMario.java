package it.formarete.designpatterns.mario;

import it.formarete.designpatterns.Mario.*;
import it.formarete.designpatterns.KeyCode;
import it.formarete.designpatterns.Mario;

import org.junit.jupiter.api.Test;

public class GodMario implements Mario {

	
	public GodMario(Type type)  {
		
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return "CROUCH";
		case JUMP:
			return "JUMP";
		case ACTION:
			return "RUN";
		default:
			return "";
		}
		
		
	}
	public String onKeyPressed1(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return "CROUCH";
		case JUMP:
			return "JUMP";
		case ACTION:
			return "RUN";
		default:
			return "";
		}
		
		
	}

}
