package Advanced_Selenium_Practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromTestNGxmlTest {
    
	@Test
	public void sampleTest(XmlTest test) {
		System.out.println("Execute sample test");
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("url"));
		System.out.println(test.getParameter("username"));
		System.out.println(test.getParameter("password"));
		
	}
}
