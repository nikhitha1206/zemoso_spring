package Testfiles;

import com.luv2code.springdemo.CricketCoach;
import com.luv2code.springdemo.CricketConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValuesFromPropertyFile {
    public static void main(String args[])
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CricketConfig.class);
        CricketCoach myCoach=context.getBean("cricketCoach",CricketCoach.class);
        System.out.println(myCoach.getEmail());
        System.out.println(myCoach.getName());
        context.close();
    }
}
