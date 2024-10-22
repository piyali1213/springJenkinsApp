package springJenkins.springJenkinsApp;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsAppApplicationTests {
	public static Logger logger = (Logger) LoggerFactory.getLogger("SpringJenkinsAppApplicationTests.class");
	@Test
	void contextLoads() {
logger.info("Test case executing....");

		assertEquals(true,true);
	}
	}