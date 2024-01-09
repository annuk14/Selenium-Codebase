package SeleniumScripts;

import org.testng.annotations.Test;




/**
 *  TESTNG -Priority Concept :Priority is used to execute testcases in sequencing manner.it can be negative.
 *  CASE -1- if priority is not given,the testcase will execute in alphabetical order.
 *  CASE -2- if priority is given,-ve priority is also given and also priority is not given then 1st testcase will execute 
 *  in alphabetical order then -ve priority testcase will execute then at last testcase with +ve priority will be executed.
 */

public class TestNgCode1 {
	
	
	@Test(priority=1)
	public void test() {
		System.out.println("hi");
		
	}
	@Test(priority=2)
	public void test1() {
		System.out.println("login");
	}
	@Test()
	public void Hometest() {
		System.out.println("home");
	}

	@Test(priority=-1)
	public void Dashboardtest() {
		System.out.println("dashboard");
	}
	
	

}

/**
 * OUTPUT:
dashboard
home
hi
login
PASSED: Hometest
PASSED: test1
PASSED: test
PASSED: Dashboardtest
 * 
 */