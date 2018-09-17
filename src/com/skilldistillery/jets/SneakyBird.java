package com.skilldistillery.jets;

import java.util.Scanner;

public class SneakyBird extends Jet{

	public SneakyBird() {
		
	}

	public static void executeReconnaissanceMission() {
		System.out.println("Select a Jet to complete mission: ");
		System.out.println("1.  Non-Hostile Recon");
		System.out.println("2.  Hostile Recon");
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		if (selection == 1) {
			System.out.println("Lockheed U2 has been deployed.  Gathering intel.");
		}
		else if (selection == 2) {
			System.out.println("SR-71 Blackbird has been deployed.  Hold on to your butts");
		}
		else {
			System.out.println("Select a valid option ( 1 or 2 )" );
		}
		scanner.close();
	}

	public SneakyBird(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		
	}
	
}
