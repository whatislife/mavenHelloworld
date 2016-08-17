package com.test.first_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest  {
	@Test
	public void tesHelloFriend() {
		App app = new App();
		String result = app.getName();
		assertEquals("songjian", result);
	}
}
