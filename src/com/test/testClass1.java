package com.test;
// Test change in Git file take this change

//Another change


// THis is another change

// Yet another change 
import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass1 {
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
