package org.kushal.composition;

public class GraphicsCard {

	private String brand;
	private String series;
	private String memory;
	public GraphicsCard() {
		this.brand = "Nvidia";
		this.series = "940";
		this.memory = "2GB";
	}
	public GraphicsCard(String brand, String series, String memory) {
		
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

}
