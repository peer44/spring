package spring.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RepairAspect {
	@AfterThrowing(throwing="ex",pointcut="execution(* spring..*.*(..))")
	public void doRecoveryActions(Throwable ex){
		System.out.println("目标方法抛出的异常："+ex);
		System.out.println("模拟Advice对异常的修复...");
	}
}
