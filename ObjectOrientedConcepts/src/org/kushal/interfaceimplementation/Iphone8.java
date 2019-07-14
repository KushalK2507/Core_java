package org.kushal.interfaceimplementation;

public class Iphone8 implements Phone {

	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public String os() {
		return "iOS";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
