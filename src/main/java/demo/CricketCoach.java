package demo;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;
  @Override
  public String getDailyRoutine() {
    return "Cricket practice!! ";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
