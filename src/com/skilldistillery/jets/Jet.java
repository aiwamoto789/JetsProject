package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private int speed;
	private int range;
	private int price;
	private static boolean MuleBird;
	private static boolean SkyCleaner;
	private static boolean SneakyBird;
	private static boolean Ordnance;
	
	
	public Jet() {
	}
	public Jet(String model, int speed, int range, int price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public boolean isMule() {
		return MuleBird;
	}
	public boolean isSkyCleaner() {
		return SkyCleaner;
	}
	public boolean isRecon() {
		return SneakyBird;
	}
	public boolean isOrdnance() {
		return Ordnance;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Jet model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price;
	}
	
	
	
}
