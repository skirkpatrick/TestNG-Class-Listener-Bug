package com.github.skirkpatrick.testng_class_listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Simple test demonstrating IClassListener executing onBeforeClass methods
 * before every method.
 */
@Listeners(ClassListener.class)
public class TestNGClassListenerTest {

	@Test
	public void test_1() {
		System.out.println("test 1");
	}
	
	@Test
	public void test_2() {
		System.out.println("test 2");
	}

}
