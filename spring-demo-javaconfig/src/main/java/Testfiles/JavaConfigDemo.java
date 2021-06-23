package Testfiles;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class JavaConfigDemo {
        public static void main(String args[])
        {
            AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
            Coach myCoach=context.getBean("swimCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());
            context.close();
        }

}
