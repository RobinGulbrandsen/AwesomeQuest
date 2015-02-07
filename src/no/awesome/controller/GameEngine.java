package no.awesome.controller;

import java.util.List;
import no.awesome.model.Character;

public class GameEngine {
	
	private List<Character> teamA, teamB;
	
	public GameEngine(List<Character> teamA, List<Character> teamB) {
		this.teamA = teamA;
		this.teamB = teamB;
	}
	
	public void start() {
		
		while(teamIsAlive(teamA) && teamIsAlive(teamB)) {
			Character charactersTurn = teamA.get(0);
			Character targetToInvoke = teamB.get(0);
			
			charactersTurn.getAbility(0).invokeOnTarget(targetToInvoke);
			
			System.out.println(teamB.get(0));
			
		}
	}
	
	private boolean teamIsAlive(List<Character> team) {
		for(Character c : team) {
			if(c.getHp() > 0) {
				return true;
			}
		}
		return false;
	}
}
