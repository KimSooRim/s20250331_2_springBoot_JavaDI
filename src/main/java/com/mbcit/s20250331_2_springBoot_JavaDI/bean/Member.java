package com.mbcit.s20250331_2_springBoot_JavaDI.bean;

public class Member {
	
	private String name;
	private String nickname;
	private Printer printer;
	// 기본 생성자
	public Member() { }
	// 생성자
	public Member(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", nickname=" + nickname + ", printer=" + printer + "]";
	}
	
	public void print() {
		printer.print("Hello " + name + ": " + nickname);
	}
	
	

}
