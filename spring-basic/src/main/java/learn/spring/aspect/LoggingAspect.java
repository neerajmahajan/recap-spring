package learn.spring.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Before("execution(void learn.spring..*.set*(*))")
	public void logSetters(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		String args = joinPoint.getArgs()[0].toString();
		
		logger.info("*********** Method called  is  " + methodName);
		logger.info("*********** Arguments passed is  " + args);
		logger.info("*********** Setter is called *************");
	}
	

}
