package text.coach;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class HelloSpringApp {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach=(Coach)context.getBean("myCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }
}
