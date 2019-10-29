package comm.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private RandomFortuneService fortuneService;
	@Autowired
	private HappyFortuneService happyFortuneService;
	@Autowired
	private SadFortuneService sadFortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}


	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return sadFortuneService.getFortune();
	}

}
