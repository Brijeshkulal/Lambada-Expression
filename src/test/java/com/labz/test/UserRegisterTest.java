package com.labz.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterTest {

	@Test
	public void test() {
		UserRegister register = new UserRegister();
		String actual = register.firstName("Brijesh");
		Assert.assertEquals("Brijesh", actual);
	}

}
