package SeleniumScripts;

import org.testng.annotations.Test;

/**
 * TESTNG Features:
 * 1)invocationCount:how many times we want to execute our testcase.if we write invocationCount=2,testcase will execute two times.
 * 2)dependsOnMethods:we can create dependency between two test methods.if testmethod is dependent on other test method and
 *  if that test method on which other test methods is depending on,if it is getting failed then test method which is dependent will be skipped
 */
public class TestNgCode2 {
	
	
	@Test(priority=1,invocationCount=2)
	public void test1() {
		System.out.println("test case-1");
		
	}
	@Test(priority=2)
	public void test2() {
//		int a=10/0;
		System.out.println("test case-2");
		
	}

	@Test(priority=3,dependsOnMethods="test2",groups="smoke")
	public void test3() {
		System.out.println("test case-3");
		
	}
	
	@Test(priority=4,groups="smoke")
	public void test4() {
		System.out.println("test case-4");
		
	}

}

