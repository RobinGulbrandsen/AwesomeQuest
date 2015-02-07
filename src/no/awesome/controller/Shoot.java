package no.awesome.controller;

import no.awesome.model.Ability;
import no.awesome.model.Character;

public class Shoot implements Ability {
	
	
	public void invokeOnTarget(Character c) {
		c.loseHP(10);
	}
}
