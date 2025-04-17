package com.mbcit.s20250331_2_springBoot_JavaDI.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//	springBoot 설정에 사용되는 클래스는 @Configuration 어노테이션을 붙여준다.
@Configuration
public class Config {
	
//	bean 설정에 사용되는 메서드는 @Bean 어노테이션을 붙여준다.
//	Member 클래스의 bean을 만든다.
	@Bean
	public Member member1() {
		Member member = new Member();
		member.setName("고길동");
		member.setNickname("고보살");
		member.setPrinter(new PrinterA());	// setter를 이용한 의존성 주입
		return member;
	}
	
//	@Bean 어노테이션의 name 속성을 생성할 bean의 이름을 지정할 수 있다.
//	name 속성을 사용하지 않으면 메서드 이름이 bean의 이름으로 등록된다.
	@Bean(name = "hello")
	public Member member2() {
		
		Member member = new Member("신데렐라", "공주님", new PrinterB());	// 생성자를 이용한 의존성 주입
		
		return member;
	}
	
//	PrinterA 클래스의 bean을 만든다.
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	
//	PrinterB 클래스의 bean을 만든다.
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
	
	
	
	
	

}
