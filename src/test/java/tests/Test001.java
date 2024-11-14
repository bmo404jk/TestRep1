package tests;
import org.testng.annotations.Test;
import com.codeborne.selenide.Selenide;

import baseTest.BaseTest;

public class Test001 extends BaseTest {
	
	@Override
	public String setUrl() {
		return null;
	}
	@Test
	public void test1() {
		System.out.println("----Checking test1----");
		Selenide.sleep(10000);
	}

}
