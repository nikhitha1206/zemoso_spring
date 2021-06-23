package test.springdemo;
import com.luv2code.springdemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
        public static void main(String args[])
        {
            AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.luv2code.springdemo");
            Coach myCoach=context.getBean("tennisCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());
            context.close();
        }

}
