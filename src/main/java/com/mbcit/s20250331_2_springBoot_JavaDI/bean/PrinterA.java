package com.mbcit.s20250331_2_springBoot_JavaDI.bean;

public class PrinterA implements Printer {

	@Override
	public void print(String message) {
		System.out.println("PrinterA : " + message);

	}

}
