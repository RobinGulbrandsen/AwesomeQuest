package no.awesome.model;

public class Archer extends Character {

	public Archer() {
		this("unknown", 0, 0);
	}

	// name, hp, power (action)
	public Archer(String name, int hp, int power) {
		super(name, hp, power);
	}

}
