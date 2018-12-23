package learn.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import learn.spring.configuration.ControllerConfiguration;
import learn.spring.controller.Controller;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ControllerConfiguration.class)
public class SpringIntegrationTest {
	@Autowired
	ApplicationContext ctx;
	@Autowired
	Controller loginController;

	@Test
	public void test() {
		assertNotNull(ctx);
		assertNotNull(loginController);
	}

}
