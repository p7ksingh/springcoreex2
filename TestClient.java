package springcoreex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        // start IOC containet
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("****************************************************************");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println("EmpId: " + emp.getEid());
        System.out.println("EmpName: " + emp.getEname());
        System.out.println("EmpSalary: " + emp.getEsal());
    }
}
