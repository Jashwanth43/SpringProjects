package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime date;
	
	
	static {
		System.out.println("WishMessageGeneratory.class file is loading");
	}


	public WishMessageGenerator() {
		System.out.println("WISH MESSAGE GENERATOR:: zero param constructor");
	}
	public String generateWishMessage(String user) {
		System.out.println("in method");
		
		int hours=date.getHour();
		if(hours<12) 
			return "Good Morning:: "+user;
		else if(hours<16)
			return "Good Afternoon:: "+user;
		else if(hours<20)
			return "Good Evening:: "+user;
		else 
			return "Good night:: "+user;
		

	}
}
