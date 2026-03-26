package Advanced_Selenium_Practice;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonTest {
	public static void main(String[] args) throws Throwable, IOException, ParseException {
		
		
		//step1:parse JSON physical file in to JAVA object using JSonParse class
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader(".\\commonData\\appCommonData.JSON"));
		//step2:convert java object in to JsonObject using down casting
		JSONObject map=(JSONObject)obj;
		
		
		//step3:get the value from json file using key
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("timeOut"));
	}

}
