package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TemplateTest extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc() throws EmailException {
		System.out.println("This is a message from the template test.");
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}
	
	public void testAddBccNull() throws EmailException {

		System.out.println("Function: testAddBccNull UTSAID: gcoxxx\n\t This test to see if the Bcc is of a null value.");
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
		try {
			String[] abc = null;
			testEmail.addBcc(abc);
			fail("An exception should be thrown!");
		}catch(EmailException e) {
			;//do nothing
		}
		

	}

	
	public void testAddBccZero() throws EmailException {
		System.out.println("Funtion: testAddBccZero UTSAID: gcoxxx\n\t This tests to see if nothing was inputed into the Bcc field.");

		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
		try {
			String[] abc = new String[0];
			testEmail.addBcc(abc);
			fail("An exception should be thrown!");
		}catch(EmailException e) {
			;//do nothing
		}
		
	}
}
