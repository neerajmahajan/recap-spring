package learn.spring.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Before("execution(void learn.spring..*.set*(*))")
	public void logSetters(){
		System.out.println("Heloooooooooooooooooooo");
		logger.info("*********** Setter is called *************");
	}
	

}
