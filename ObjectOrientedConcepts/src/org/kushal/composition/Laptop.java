package org.kushal.composition;

public class Laptop {

	private String screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		this.screen = "15.5";
		this.processor = new Processor();
		this.ram = "8GB";
		this.hardDrive = "1TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "Multi Layer";
		this.keyboard = "BackLit";
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public Laptop(String screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	public Processor getProcessor() {
		return processor;
	}

}
