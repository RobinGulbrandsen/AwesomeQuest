package no.awesome.controller;

import no.awesome.model.Ability;
import no.awesome.model.Character;

public class Hit implements Ability {

	@Override
	public void invokeOnTarget(Character c) {
		c.loseHP(10);
	}
}
