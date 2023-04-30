package Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Put_Patch_delete {

	@Test
	public void testput()
	{

		HashMap<String,Object> hashmap=new HashMap<String,Object>();

		
		JSONObject json=new JSONObject();
		json.put("name","dada");
		json.put("address","nagar");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in/api";
		given().
		body(json.toJSONString()).
		when().
		put("users/2").
		then().
		statusCode(200).log().all();
		System.out.println("Today tejal adding");
		System.out.println("Try to add");
		
	}

	@Test
	public void testpatch()
	{

		HashMap<String,Object> hashmap=new HashMap<String,Object>();

		
		JSONObject json=new JSONObject();
		json.put("name","kaka");
		json.put("address","nagar");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in";
		given().
		body(json.toJSONString()).
		when().
		patch("api/users/2").
		then().
		statusCode(200).log().all();
		
	}

}
