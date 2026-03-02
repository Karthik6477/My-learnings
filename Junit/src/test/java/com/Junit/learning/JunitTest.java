package com.Junit.learning;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitTest {
	
	Java rev = new Java();
	
	JunitTest(){
		System.out.println("Instance is created");
	}

	@BeforeAll
	void init() {
		System.out.println("Before all test");
	}
	
	@BeforeEach
	void pre() {
		System.out.println("Before every test");
	}
	
	@Test
	void test01() {
		assertEquals("dlrow ot emocleW", rev.reversing("Welcome to world"));
		System.out.println("Test 01 is completed");
	}
	
	@Test
	void test02() {
		int actual = 3;
		assertTrue(actual<5);
		System.out.println("Test 02 is completed");
	}
	
	@Test
	void test03() {
		int actual = 6;
		assertFalse(actual<5,()->"The given number is less than 5");
		System.out.println("Test 03 is completed");
	}
	
	@Test
	void test04() {
		//int actualarr[] = {3,5,7};
		int actualarr[] = null;
		assertThrows(NullPointerException.class,()->rev.sortingarray(actualarr));
		System.out.println("Test 04 is completed");
	}
	
	@Test
	void test05() {
		assertTimeout(Duration.ofMillis(10),()->rev.adddummy(5));
		System.out.println("Test 05 is completed");
	}
	
	@AfterAll
	void end() {
		System.out.println("After all test");
	}
	
	@AfterEach
	void post() {
		System.out.println("After every test");
	}

}
