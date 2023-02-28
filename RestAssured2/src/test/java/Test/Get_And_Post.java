package Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class Get_And_Post {

	@Test(enabled = true)
	public void testGet()
	{
		baseURI="https://reqres.in/api";
		given().
		get("users?page=2").
		then().
		statusCode(200).
		body("data[1].id", equalTo(8));
	}
	
	@Test(enabled = false)
	public void testpost()
	{

		HashMap<String,Object> hashmap=new HashMap<String,Object>();
//		
//		hashmap.put("name", "Manoj");
//		hashmap.put("address", "nagar");
//		
		//System.out.println(hashmap);
		
		JSONObject json=new JSONObject();
		json.put("name","dada");
		json.put("address","nagar");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in/api";
		given().
		body(json.toJSONString()).
		when().
		post("/user").
		then().
		statusCode(201).log().all();
		
	}
}
