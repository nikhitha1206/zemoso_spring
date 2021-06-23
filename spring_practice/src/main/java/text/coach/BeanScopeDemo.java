package text.coach;

import com.luv2code.springdemo.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
        Coach myCoach=context.getBean("myCoach",Coach.class);
        Coach hisCoach=context.getBean("myCoach",Coach.class);
        System.out.println(myCoach);
        System.out.println(hisCoach);
        if(myCoach==hisCoach)
            System.out.println("same object");
        else
            System.out.println("different object");
    }
}
