package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import spring.aop.Hello;

public class AopTest extends TestCase{
	
	public void testAop() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		Hello hello = ctx.getBean("hello",Hello.class);
		hello.addUser("张三丰", "123");
		hello.foo();
		
	}

}
