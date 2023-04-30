package files;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
public class LibraryApi {

	@Test
	public void AddBook()
	{
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().log().all().header("Content-Type","application/json")
		.body(payload.Library_getPayload("isbn"+Commoncode.RandomStringGenration(),"aisle"+Commoncode.RandomStringGenration()))
		.when().post("Library/Addbook.php")
		.then().log().all().statusCode(200)
		.extract().response().asString();
		
		JsonPath js=Commoncode.parsetojson(response);
		String id=js.get("ID");
		System.out.println(id);
		
		
	}
}
