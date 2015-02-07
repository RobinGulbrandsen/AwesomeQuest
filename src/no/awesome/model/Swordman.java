package no.awesome.model;

public class Swordman extends Character{
	
	public Swordman() {
		this("unkown", 0, 0);
	}
	
	public Swordman(String name, int hp, int power) {
		super(name, hp, power);
	}
}
