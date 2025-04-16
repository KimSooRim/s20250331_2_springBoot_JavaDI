package com.mbcit.s20250331_2_springBoot_JavaDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mbcit.s20250331_2_springBoot_JavaDI.bean.Config;
import com.mbcit.s20250331_2_springBoot_JavaDI.bean.Member;
import com.mbcit.s20250331_2_springBoot_JavaDI.bean.Printer;

//	springBoot는 @SpringBootApplication 어노테이션에 의해서 자동으로 설정이 이루어지고 컴포넌트가 등록되기
//	때문에 수동으로 처리하기 위해 주석으로 처리한다.
//	@SpringBootApplication
public class S202503312SpringBootJavaDiApplication {

	public static void main(String[] args) {
		
//		컴포넌트를 수동으로 처리하기 위해 주석으로 처리한다.
//		SpringApplication.run(S202503312SpringBootJavaDiApplication.class, args);
		
//		의존성 주입(DI, Dependency Injection) 처리를 하기 위해 IoC(제어의 역전, Inversion of Control)
//		컨테이너를 만든다.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		String[] beans = context.getBeanDefinitionNames();
		
		for(String bean : beans) {
			System.out.println("bean : " + bean);
		}
		
//		member1 bean 가져오기
		Member member1 = (Member) context.getBean("member1");
		member1.print();
		
//		member2 bean 가져오기
		Member member2 = (Member) context.getBean("hello");
		member2.print();
		
//		PrinterA bean 가져오기
		Printer printerA = (Printer) context.getBean("printerA");
		printerA.print("sjflsfjlsjl");
		
//		PrinterB bean 가져오기
		Printer printerB = (Printer) context.getBean("printerB");
		printerB.print("십년 감수했네~~");
		
	}

}













