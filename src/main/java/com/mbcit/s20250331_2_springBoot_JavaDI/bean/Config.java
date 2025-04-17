package com.mbcit.s20250331_2_springBoot_JavaDI.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Member member1() {
		Member member = new Member();
		member.setName("고길동");
		member.setNickname("고보살");
		member.setPrinter(new PrinterA());	// setter를 이용한 의존성 주입
		return member;
	}
	
	@Bean(name = "hello")
	public Member member2() {
		
		Member member = new Member("신데렐라", "공주님", new PrinterB());	// 생성자를 이용한 의존성 주입
		
		return member;
	}
	
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
	
	
	
	
	

}
