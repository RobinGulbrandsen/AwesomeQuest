package no.awesome.model;

import java.util.ArrayList;
import java.util.List;

public class Character {

	private String name;
	private int hp;
	private int power;
	private List<Ability> abilities;

	public Character(String name, int hp, int power) {
		abilities = new ArrayList<Ability>();

		setName(name);
		setHp(hp);
		setPower(power);
	}

	// Name
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Health Points
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	// Power
	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void addAbility(Ability ability) {
		abilities.add(ability);
	}

	public Ability getAbility(int index) {
		return abilities.get(0);
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nHp: " + hp + "\nPower: " + power;
	}
}
