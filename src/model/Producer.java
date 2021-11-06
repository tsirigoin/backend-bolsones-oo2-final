package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Producer {
	private String name;
	private ArrayList<Crop> crops = new ArrayList<Crop>();
	
	public Producer(String name) {
		this.name = name;
	}
	
	public void addCrop(Crop crop) {
		this.crops.add(crop);
	}
	
	
	public List getHarvestingCrops() {
		return this.crops.stream().filter(crop -> crop.inHarvest()).collect(Collectors.toList());
		
	}

	public String getName() {
		return name;
	}
}
