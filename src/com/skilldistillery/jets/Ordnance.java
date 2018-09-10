package com.skilldistillery.jets;

import java.util.Scanner;

public class Ordnance extends Jet{

	public Ordnance() {
		
	}
	public Ordnance(String model, int speed, int range, int price) {
		super(model, speed, range, price);

	}
	
	public void isCombatReady() {
		System.out.println(this.getModel() + "is Combat Ready.");
	}
	
	public void executeGroundMission() {
		System.out.println("Select a Jet to complete mission: ");
		System.out.println("1.  Ground Support");
		System.out.println("2.  Bombing Run");
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		if (selection == 1) {
			System.out.println("A-10 Warthog has been deployed.  In the pipe, five by five.");
		}
		else if (selection == 2) {
			System.out.println("B2 Spirit has been deployed.  In the pipe, five by five.");
		}
		else {
			System.out.println("Select a valid option ( 1 or 2 )" );
		}
		scanner.close();
	}

	
	
}
