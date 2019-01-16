package demo;

public class TrackCoach implements Coach{

  private FortuneService fortuneService;

  public TrackCoach(FortuneService fortuneService){
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyRoutine(){
    return "Track practice";
  }

  @Override
  public String getDailyFortune() {
    return "Track coach : " + fortuneService.getFortune();
  }
}
