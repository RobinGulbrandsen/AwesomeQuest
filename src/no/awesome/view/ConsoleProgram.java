package no.awesome.view;

import java.util.ArrayList;

import no.awesome.controller.GameEngine;
import no.awesome.model.Archer;
import no.awesome.model.Character;
import no.awesome.model.Swordman;

public class ConsoleProgram {
	
	public static void main(String[] args) {
		ArrayList<Character> teamA = new ArrayList<Character>();
		teamA.add(new Swordman());
		
		ArrayList<Character> teamB = new ArrayList<Character>();
		teamB.add(new Archer());
		
		new GameEngine(teamA, teamB).start();
	}

}
