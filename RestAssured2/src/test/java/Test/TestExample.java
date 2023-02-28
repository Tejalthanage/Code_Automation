package Test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.assertion.BodyMatcher;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TestExample {

	@Test
	public void Test_1()
	{
		Response responce=get("https://reqres.in/api/users?page=2");
		System.out.println(responce.getBody().asString());
		System.out.println(responce.getTime());
		int a=responce.getStatusCode();
		System.out.println(a);
		System.out.println(responce.getHeader("content-Type"));
		
		Assert.assertEquals(200, a);
		
	}
	
	@Test
	public void Test_2()
	{
		baseURI="https://reqres.in/api";
		given()
		.get("users?page=2")
		.then().statusCode(200).body("data[1].id",equalTo(8)).log().all();
		
		
	}

	
	
	
}
