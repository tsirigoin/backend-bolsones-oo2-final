package model;

public class Crop {
	private String area;
	private boolean inHarvest;
	private int ammount;
	private String name;
	
	public Crop(String name, int ammount, String area, boolean inHarvest) {
		this.name = name;
		this.ammount = ammount;
		this.area = area;
		this.inHarvest = inHarvest;
	}
	
	public boolean inHarvest() {
		return this.inHarvest;
	}
	
	@Override
	public String toString() {
		return "| " + this.name + " |" ;
	}
}
