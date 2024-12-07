package S34.Springtool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
         Employee e1 = (Employee) context.getBean("emp1");
         System.out.println(e1);
         Employee e2 = (Employee) context.getBean("emp2");
         System.out.println(e2);
           System.out.println( "Hello World!" );
    }
}
