package spring.aop;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloImpl implements Hello{
	public void foo(){
		System.out.println("执行hello的foo");
	}
	public int addUser(String username,String password){
		System.out.println("执行hello的addUser方法："+username);
		if(username.length()<3||username.length()>10){
			throw new IllegalArgumentException("username参数的长度必须大于3，小于10！");
		}
		return 20;
	}

}
