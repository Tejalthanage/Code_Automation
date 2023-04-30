package serilization;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_New_place {

	public static void main(String[] args) {
		
		Pojo_Library objpojo=new Pojo_Library();
		objpojo.setAccuracy(50);
		objpojo.setName("Rahi shinde");
		objpojo.setPhone_number("(+91) 983 893 3937");
		objpojo.setAddress("29, side layout, cohen 09");
		List<String> l=new ArrayList<String>();
		l.add("Investment Office");
		l.add("shop");
		
		objpojo.setTypes(l);
		
		objpojo.setWebsite("http://google.com");
		objpojo.setLanguage("French-IN");
		
		Location l1=new Location();
		l1.setLat(-38.383494);
		l1.setLng(33.427362);
		objpojo.setLocation(l1);
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	Response	res=(Response) given()
		.queryParam("key","qaclick123").log().all().body(objpojo)
		
		.when()
		.post("/maps/api/place/add/json")
		
		.then()
		.log().all()
		.assertThat().statusCode(200).extract().response();
	
		
		
		
	}
}
