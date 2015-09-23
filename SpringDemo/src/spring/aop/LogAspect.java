package spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
//需要引入aspectjrt.jar
@Aspect
public class LogAspect {
	//spring..代表spring包下面的任意包及其子包，*.*代表类名不限，方法名不限
	@AfterReturning(returning="rvt",pointcut="execution(* spring..*.*(..))")
	public void log(Object rvt){
		System.out.println("获取目标方法的返回值:"+rvt);
		System.out.println("模拟日志");
		
	}
}
