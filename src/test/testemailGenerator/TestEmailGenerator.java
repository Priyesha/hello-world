package testemailGenerator;

import org.testng.Assert;
import org.testng.annotations.Test;

import emailGenerator.RandomEmailGenerator;

public class TestEmailGenerator {

	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "myfeedback@yoursite.com");

	}

}

