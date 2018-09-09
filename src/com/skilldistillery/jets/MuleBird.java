package com.skilldistillery.jets;

import java.util.Scanner;

public class MuleBird extends Jet {

	public MuleBird() {
		
	}

	public void executeTransportMission() {
		System.out.println("Select a Jet to complete mission: ");
		System.out.println("1.  Cargo Transport");
		System.out.println("2.  VIP Transport");
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		if (selection == 1) {
			System.out.println("C-130 loaded and launched.  Cargo en route.");
		}
		else if (selection == 2) {
			System.out.println("G650 loaded and launched.  VIPs en route.");
		}
		else {
			System.out.println("Select a valid option ( 1 or 2 )" );
		}
		scanner.close();
	}

	public MuleBird(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		
	}
}
