package no.awesome.model;

import no.awesome.controller.Hit;

public class Swordman extends Character{
	
	public Swordman() {
		this("unkown", 100, 100);
	}
	
	public Swordman(String name, int hp, int power) {
		super(name, hp, power);
		
		addAbility(new Hit());
	}
}
