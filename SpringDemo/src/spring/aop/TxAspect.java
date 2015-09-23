package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TxAspect {

	@Around("execution(* spring.aop.*.add*(..))")
	public Object processTx(ProceedingJoinPoint jp){
		Object[] args = jp.getArgs();
		System.out.println("开启事务");
		Object rvt = null;
		try {
			rvt = jp.proceed(args);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束事务");
		return rvt;
		
	}
}
