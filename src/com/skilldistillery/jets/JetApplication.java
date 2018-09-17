package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApplication {

	public static void main(String[] args) {
		launch();

	}

	private static void launch() {
		displayUserMenu();
	}

	private static void displayUserMenu() {
		AirField airField = new AirField();

		int option;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Select an Option or Deploy a Mission");
			System.out.println("1:  List Fleet");
			System.out.println("2:  Scramble the fleet");
			System.out.println("3:  View Fastest Bird");
			System.out.println("4:  View Longest Range Bird");
			System.out.println("5:  Load all Cargo Planes");
			System.out.println("6:  Launch Reconnaissance Mission");
			System.out.println("7:  Launch Ground Target Mission");
			System.out.println("8:  Launch Dogfight Mission");
			System.out.println("9:  Park additional plane in the airfield");
			System.out.println("10:  Quit menu");
			System.out.println();
			option = scanner.nextInt();

			switch (option) {
			case 1:
				airField.listFleet();
				break;
			case 2:
				airField.scrambleFleet();
				break;
			case 3:
				airField.getSpeed();
				break;
			case 4:
				airField.getRange();
				break;
			case 5:
				airField.isMule();
				break;
			case 6:
				SneakyBird.executeReconnaissanceMission();
				break;
			case 7:
				Ordnance.executeGroundMission();
				break;
			case 8:
				SkyCleaner.executeDogFightMission();
				break;
			case 9:
				AirField.addToFleet();
				break;
			case 10:
				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid option");
				return;
			}

		} while (option != 10);
		System.out.println("Please enter a valid option.");
	}
}
