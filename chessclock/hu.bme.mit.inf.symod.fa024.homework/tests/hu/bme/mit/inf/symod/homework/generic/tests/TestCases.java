package hu.bme.mit.inf.symod.homework.generic.tests;

import org.junit.Test;

public class TestCases {
	public static void main(String[] args) {
		TestCases testCases = new TestCases();
		try{ testCases.test1(); }catch(AssertionError e) {}try{ testCases.test2(); }catch(AssertionError e) {}try{ testCases.test3(); }catch(AssertionError e) {}try{ testCases.test4(); }catch(AssertionError e) {}
	}
	
	@Test(timeout=10000)
	public void test1() {
		TesterAPI c = new TesterAPI("test1","Initially the display shows \"Hello Yakindu World!\"");
	c.expectText("Hello Yakindu World!");
	System.out.println("test1 Succeeded!");
	}
	
	@Test(timeout=10000)
	public void test2() {
		TesterAPI c = new TesterAPI("test2","After pressing a button it shows your individual task title");
	c.pushStart();
	c.expectText("FA024");
	System.out.println("test2 Succeeded!");
	}
	
	@Test(timeout=10000)
	public void test3() {
		TesterAPI c = new TesterAPI("test3","Pressing the button twice shows \"Hello Yakindu World!\"");
	c.pushStart();
	c.pushStart();
	c.expectText("Hello Yakindu World!");
	System.out.println("test3 Succeeded!");
	}
	
	@Test(timeout=10000)
	public void test4() {
		TesterAPI c = new TesterAPI("test4","Pressing the button three times shows your individual task title again");
	c.pushStart();
	c.pushStart();
	c.pushStart();
	c.expectText("FA024");
	System.out.println("test4 Succeeded!");
	}
	
}
