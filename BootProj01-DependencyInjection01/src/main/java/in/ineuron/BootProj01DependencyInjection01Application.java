package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependencyInjection01Application {
	static {
		System.out.println("BOOTProj01DependencyInjectionApplication.class file loading");
	}
	public BootProj01DependencyInjection01Application() {
		System.out.println("OBJECT CREATED:: ");
	}
	@Bean
	public LocalDateTime createLocalDateTimeObj() {
		System.out.println("getting method");
		LocalDateTime dt=LocalDateTime.now();
		
		return dt;
		
	}

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootProj01DependencyInjection01Application.class, args);
		System.out.println("Implementation class:: "+context.getClass().getName());
		System.out.println("****************Container started************");
		WishMessageGenerator wmg=context.getBean(WishMessageGenerator.class);
		String msg=wmg.generateWishMessage("jashwanth");
		System.out.println(msg);
		System.out.println("****************Container stopped************");
		((AbstractApplicationContext) context).close();
		
	}
	

}
