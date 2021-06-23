package text.coach;

import com.luv2code.springdemo.AdditionOfTwoNumbers;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddDemo {
    public static void main(String aargs[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanAddition.xml");
        AdditionOfTwoNumbers add=context.getBean("addition", AdditionOfTwoNumbers.class);
        System.out.println("result is:"+add.getResult());
        context.close();
    }
}
