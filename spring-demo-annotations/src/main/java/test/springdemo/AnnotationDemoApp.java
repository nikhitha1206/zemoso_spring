package test.springdemo;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach=context.getBean("tennisCoach",Coach.class);
        /*Coach hisCoach=context.getBean("tennisCoach",Coach.class);
        System.out.println(myCoach);
        System.out.println(hisCoach);
        if(myCoach==hisCoach)
            System.out.println("same");
        else
            System.out.println("Different");*/
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        context.close();
    }
}
