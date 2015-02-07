package no.awesome.model;

public class Character {
	
		private String name;
		private int hp;
		private int power;
		
		public Character(String name, int hp, int power) {
			setName(name);
			setHp(hp);
			setPower(power);
		}
		// Name
		public void setName(String name) {
			setName(name);
		}

		public String getName() {
			return name;
		}

		// Health Points
		public void setHp(int hp) {
			setHp(hp);
		}

		public int getHp() {
			return hp;
		}

		// Power
		public void setPower(int power) {
			setPower(power);
		}

		public int getPower() {
			return power;
		}
}
