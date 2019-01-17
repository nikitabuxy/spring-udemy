package demo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService extends HappyFortuneService implements FortuneService {

  @Override
  public String getRandomFortune() {
    String fortunes[] = new String[]{"Fortune 1", "Fortune 2", "Fortune 3"};
    return fortunes[ThreadLocalRandom.current().nextInt(0, 3)];
  }
}
