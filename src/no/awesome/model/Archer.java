package no.awesome.model;

import no.awesome.controller.Shoot;

public class Archer extends Character {

	public Archer() {
		this("Archer", 100, 100);
	}

	public Archer(String name, int hp, int power) {
		super(name, hp, power);
		
		addAbility(new Shoot());
	}
	
	
}
