package com.skilldistillery.jets;

import java.util.Scanner;

public class SkyCleaner extends Jet{

	public SkyCleaner() {
		
	}
	public static void executeDogFightMission() {
		System.out.println("Select a Jet to complete mission: ");
		System.out.println("1.  Aerial targets: low support, down n dirty");
		System.out.println("2.  Aerial targets:  air superiority required");
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		if (selection == 1) {
			System.out.println("F-14 Tomcat has been deployed.  In the pipe, five by five.");
		}
		else if (selection == 2) {
			System.out.println("F-35 Lightning has been deployed.  Give 'em hell boys.  In the pipe, five by five.");
		}
		else {
			System.out.println("Select a valid option ( 1 or 2 )" );
		}
		scanner.close();
	}
	public void isCombatReady() {
		System.out.println(this.getModel() + "is Combat Ready.");
	}
	public SkyCleaner(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		
	}
	public static boolean isSkyCleaner() {
		return true;
	}
}
