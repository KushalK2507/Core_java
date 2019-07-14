package org.kushal.composition;

public class Processor {

	private String brand;
	private String series;
	private String generation;
	private String cores;
	private String threads;
	private String cacheMemory;
	private String frequency;
	private String minFequency;
	private String maxFrequency;

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public String getGeneration() {
		return generation;
	}

	public String getCores() {
		return cores;
	}

	public String getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFequency() {
		return minFequency;
	}

	public String getMaxFrequency() {
		return maxFrequency;
	}

	public Processor() {
		this.brand = "intel";
		this.series = "7200";
		this.generation = "7";
		this.cores = "2";
		this.threads = "4";
		this.cacheMemory = "4MB";
		this.frequency = "2.5Ghz";
		this.minFequency = "2.5Ghz";
		this.maxFrequency = "3.1";
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFequency=" + minFequency + ", maxFrequency=" + maxFrequency + "]";
	}

	public Processor(String brand, String series, String generation, String cores, String threads, String cacheMemory,
			String frequency, String minFequency, String maxFrequency) {

		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFequency = minFequency;
		this.maxFrequency = maxFrequency;
	}

}
