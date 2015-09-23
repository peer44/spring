package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ReleaseAspect {
	@After("execution(* spring.aop.*.add*(..))")
	public void release(){
		System.out.println("模拟方法结束后资源的释放");
	}
}
