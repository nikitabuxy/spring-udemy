package demo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune(){
      return "Happy Day!!"  ;
    }

  @Override
  public String getRandomFortune() {
    return null;
  }
}
