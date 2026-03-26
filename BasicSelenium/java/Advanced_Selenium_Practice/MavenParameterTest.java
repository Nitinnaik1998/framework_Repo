package Advanced_Selenium_Practice;

import org.testng.annotations.Test;

public class MavenParameterTest {
	@Test
	public void runtimeParameterTest() {
		String url=System.getProperty("url");
		System.out.println("Env data ==>URL ===="+url);
		
		
	
	}

}
