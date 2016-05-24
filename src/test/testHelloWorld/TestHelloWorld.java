package testHelloWorld;



import hello.Hello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloWorld {

	@Test()
	public void testHelloWorld() {

		Hello obj = new Hello();
		String str = obj.funct1();

		Assert.assertNotNull(str);
		Assert.assertEquals(str, "triggering the builds on push test");

	}

}

