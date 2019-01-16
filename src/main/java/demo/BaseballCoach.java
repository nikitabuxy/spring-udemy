package demo;

public class BaseballCoach implements Coach {


  private FortuneService fortuneService;

  public BaseballCoach(FortuneService theFortuneService) {
    fortuneService = theFortuneService;
  }

  @Override
  public String getDailyRoutine() {
    return "Baseball practise";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
