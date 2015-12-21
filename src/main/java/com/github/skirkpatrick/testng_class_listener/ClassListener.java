package com.github.skirkpatrick.testng_class_listener;

import org.testng.IClassListener;
import org.testng.IMethodInstance;
import org.testng.ITestClass;

public class ClassListener implements IClassListener {

	public void onBeforeClass(ITestClass arg0, IMethodInstance arg1) {
		System.out.println("onBeforeClass");
	}

	public void onAfterClass(ITestClass arg0, IMethodInstance arg1) {
		System.out.println("onAfterClass");
	}

}
