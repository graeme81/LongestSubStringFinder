package dailyProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	
	@Test
	void test1() {
		int result = Main.longetstSubString("abba", 2);
		assertEquals(4, result);
	}
	
	@Test
	void test2() {
		int result = Main.longetstSubString("abcba", 2);
		assertEquals(3, result);
	}
	
	@Test
	void test3() {
		int result = Main.longetstSubString("eeefeeeceeef", 2);
		assertEquals(7, result);
	}
	
	@Test
	void test4() {
		int result = Main.longetstSubString("abcabcdefabc", 3);
		assertEquals(6, result);
	}
	
	@Test
	void test5() {
		int result = Main.longetstSubString("txtuvwxyz", 5);
		assertEquals(7, result);
	}
	
	@Test
	void test6() {
		int result = Main.longetstSubString("abcdefghij", 1);
		assertEquals(1, result);
	}

}
