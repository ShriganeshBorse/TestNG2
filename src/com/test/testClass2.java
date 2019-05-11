package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass2 {
	@Test
	void test1()
	{
		Assert.assertEquals(30+20, 50);
		
	}
	
	@Test
	void test2()
	{
		Assert.assertEquals(30-20, 10);
		
	}
}
