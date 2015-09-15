package test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import spring.ioc.SpringAction;
import spring.ioc.test.Home;
import spring.ioc.test.JdbcProperties;
import spring.ioc.test.User;
import spring.ioc.test.UserHome;
import spring.ioc.test.Users;

public class IocTest extends TestCase {

	public void testioc() {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		/*
		 * // 对象注入 SpringAction springAction = (SpringAction)
		 * ctx.getBean("springAction"); springAction.ok(); // 普通用户注入 User user =
		 * (User) ctx.getBean("user"); System.out.println(user.getUsername());
		 * // List注入 Users users = (Users) ctx.getBean("users"); for (String
		 * name : users.getUsername()) { System.out.println(name); } //
		 * Properties注入 JdbcProperties jdbcProperties = (JdbcProperties)
		 * ctx.getBean("jdbcProperties"); Iterator<?> it =
		 * jdbcProperties.getProps().entrySet().iterator(); while (it.hasNext())
		 * {
		 * 
		 * @SuppressWarnings("rawtypes") Map.Entry entry = (Map.Entry)
		 * it.next(); Object key = entry.getKey(); Object value =
		 * entry.getValue(); System.out.println(key + ":" + value); }
		 */
		UserHome userHome = ctx.getBean("userHome",UserHome.class);
		System.out.println("***********普通属性注入***********");
		System.out.println(userHome.getUsername());
		System.out.println(userHome.getAge());
		System.out.println("***********数组注入***********");
		Home[] userHomes = userHome.getHomes();
		for (int i = 0; i < userHomes.length; i++) {
			System.out.println("家庭住址: " + userHomes[i].getHomeAddr());
		}
		System.out.println("***********List注入***********");
		List homesList = userHome.getHomesList();
		for (int i = 0; i < homesList.size(); i++) {
			System.out.println(homesList.get(i));
		}
		System.out.println("***********Set注入***********");
		Set homesSet = userHome.getHomesSet();
		Iterator itrSet = homesSet.iterator();
		while (itrSet.hasNext()) {
			System.out.println(itrSet.next());
		}
		System.out.println("***********Map注入***********");
		Map homesMap = userHome.getHomesMap();
		Home home = (Home) homesMap.get("1");
		System.out.println(home.getHomeAddr());
		
		for (Object key : homesMap.keySet()) {
			Object value = homesMap.get(key);
			System.out.println("Key = " + key + ", Value = " + value);
		}

	}

}
