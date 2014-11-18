package demo;

import com.ofg.infrastructure.base.MvcWiremockIntegrationSpec;
import com.ofg.infrastructure.base.MvcWiremockIntegrationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class) // FIXME: Very ugly hack
@IntegrationTest
public class ApplicationTests extends MvcWiremockIntegrationTest {

	@Test
	public void contextLoads() {
	}

}
