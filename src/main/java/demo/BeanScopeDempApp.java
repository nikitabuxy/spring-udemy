package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDempApp {

  public static void main(String args[]){

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

    Coach coachA = context.getBean("myCoach", Coach.class);
    Coach coachB = context.getBean("myCoach", Coach.class);
    boolean result = (coachA == coachB) ? true : false;
    System.out.println(" ---- Same result ---- \n" +  result);
    System.out.println(" Coach A ----" +  coachA);
    System.out.println(" Coach B ----" +  coachB);
  }

}
