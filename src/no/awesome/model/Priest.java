package no.awesome.model;

public class Priest extends Character {

	public Priest() {
		this("unkown", 0, 0);
	}

	public Priest(String name, int hp, int power) {
		super(name, hp, power);
	}
}
