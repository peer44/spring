package spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//定义一个切面
@Aspect
public class AuthAspect {
	//* spring.aop.*.add*(..) 第一个*代表返回值为任意类型
	//第二个*代表aop包下面的任意类，第三个*代表以add开头的任意方法，两个..代表任意个数，类型不限的形参
	@Before("execution(* spring.aop.*.add*(..))")
	public void authority(){
		System.out.println("开始模拟权限检查");
	}

}
