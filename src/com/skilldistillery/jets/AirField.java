package com.skilldistillery.jets;

public class AirField {
	boolean MuleBird;
	Jet jet = null;
	Jet[] hangar = new Jet[40];

	public AirField() {

		hangar[0] = new MuleBird("C130_Cargo", 336, 2360, 12_000_000);
		hangar[1] = new MuleBird("G650_VIP", 610, 8050, 68_000_000);
		hangar[2] = new Ordnance("A10_AtS", 518, 2580, 18_800_000);
		hangar[3] = new Ordnance("B2_AtS", 560, 6000, 737_000_000);
		hangar[4] = new SneakyBird("SR-71_Rec", 2200, 2900, 34_000_000);
		hangar[5] = new SneakyBird("U2_Rec", 500, 6405, 950_000);
		hangar[6] = new SkyCleaner("F14_Fighter", 1544, 1840, 34_000_000);
		hangar[7] = new SkyCleaner("F35_Fighter", 1200, 1200, 120_000_000);

	}

	public void listFleet() {
		for (int i = 0; i < hangar.length; i++) {
			if (hangar[i] != null) {
				System.out.println(hangar[i]);
			}
		}
	}

	public void scrambleFleet() {
		for (int i = 0; i < hangar.length; i++) {
			if (hangar[i] != null) {
				System.out.println(hangar[i] + " Maximum Flight Time: " + (hangar[i].getRange() / hangar[i].getSpeed())
						+ " hours");
			}
		}
	}

	public void getSpeed() {
		int topSpeed = 0;
		for (int i = 0; i < hangar.length; i++) {
			if (hangar[i] != null) {
				if (hangar[i].getSpeed() > topSpeed) {
					topSpeed = hangar[i].getSpeed();
					jet = hangar[i];
				}

			}
		}
		System.out.println(jet);
	}

	public void getRange() {
		int topRange = 0;
		for (int i = 0; i < hangar.length; i++) {
			if (hangar[i] != null) {
				if (hangar[i].getRange() > topRange) {
					topRange = hangar[i].getRange();
					jet = hangar[i];
				}
			}
		}
		System.out.println(jet);
	}
	public boolean isMule() {
		return MuleBird;
	}
}