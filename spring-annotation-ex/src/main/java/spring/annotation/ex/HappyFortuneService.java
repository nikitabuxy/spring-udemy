package spring.annotation.ex;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Happy days!!";
  }
}
