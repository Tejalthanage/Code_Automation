package files;

import org.apache.commons.lang3.RandomStringUtils;

import io.restassured.path.json.JsonPath;

public class Commoncode {

	public  static JsonPath parsetojson(String response)
	{
		JsonPath js1=new JsonPath(response);
		return js1;
	}
	
	public static String RandomStringGenration()
	{
		int length = 15;
	    boolean useLetters = true;
	    boolean useNumbers = false;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    return generatedString;

	}
}
