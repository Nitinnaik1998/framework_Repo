package Advanced_Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleData_Driven_Testing {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\nitin\\OneDrive\\Desktop\\commonData.txt");
		Properties pObj=new Properties();
		pObj.load(fis);
		System.out.println(pObj.getProperty("Url"));
	}

}

