package sendEmailPackage;

/**
 * @author jigarsony
 * date : 18 Nov'19
 */

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SampleEmailSent {

	@Test
	public void test() {
		int a = 10;
		// int b = 10;
		int b = 20;
		Assert.assertEquals(a, b);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Class Started");
	}

	@AfterClass
	public void afterClass() {
		try {
			SendEmail.sendEmail();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		System.out.println("Class Ended");
	}
}
