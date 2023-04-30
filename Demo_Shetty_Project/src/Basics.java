import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Commoncode;
import files.payload;

public class Basics {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload.bodyforrequest())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server",equalTo("Apache/2.4.41 (Ubuntu)"))
	
		.extract().response().asString();
		System.out.println(response);
		
		JsonPath json=new JsonPath(response);
		String pathid=json.get("place_id");
		System.out.println(pathid);
		
		//Update Api //Put request
		
		String updatedaddress="Ahmednagar";
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+pathid+"\",\r\n"
				+ "\"address\":\""+updatedaddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		
		//get response place
		
		String ActualResponse = given().log().all().queryParam("key","qaclick123")
		.queryParam("place_id",pathid)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1=Commoncode.parsetojson(ActualResponse);
		String act=js1.get("address");
		System.out.println(act);
		
		

		Assert.assertEquals(act,updatedaddress);
	
		
	}
	
}
