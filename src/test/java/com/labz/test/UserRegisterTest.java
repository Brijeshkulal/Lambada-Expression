package com.labz.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterTest {

	@Test
	public void givenFirstName_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.firstName("Brijesh");
		Assert.assertEquals("Brijesh", actual);
	}
	
	@Test
	public void givenLastName_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.lastName("Kulal");
		Assert.assertEquals("Kulal", actual);
	}
	
	@Test
	public void givenEmailId_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.emailId("brijeshkulal534@gmail.com");
		Assert.assertEquals("brijeshkulal534@gmail.com", actual);
	}
}
