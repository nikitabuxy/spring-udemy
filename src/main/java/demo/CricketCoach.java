package demo;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  private String emailAddress;
  private String team;

  public String getTeam(){
    return team;
  }

  public void setTeam(String team) {
    System.out.println("Cricket coach : setTeam setter");
    this.team = team;
  }

  public String getEmailAddress(){
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    System.out.println("Cricket coach : setEmailAddress setter");
    this.emailAddress = emailAddress;
  }

  public CricketCoach(){
    System.out.println("Cricket coach no - arg constructor ");
  }

  public void setFortuneService(FortuneService fortuneService){
    this.fortuneService = fortuneService;
  }
  @Override
  public String getDailyRoutine() {
    return "Cricket practice!! ";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  @Override
  public String getRandomFortune() {
    return fortuneService.getRandomFortune();
  }
}
