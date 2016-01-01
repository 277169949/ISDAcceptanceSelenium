package com.libo.test;

import com.libo.testcases.LoginTestCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestRunner extends TestCase {

	public static Test suite() {

		TestSuite suite = new TestSuite("All tests from part1");// 表明这个标识性东西
		suite.addTestSuite(LoginTestCase.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestRunner.suite());
	}
}
