package Jira_API;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class Add_Comments_API {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter session=new SessionFilter();
		String response = given()
		.headers("Content-Type","application/json").log().all()
		.body("{\r\n"
				+ "     \"username\":\"tejalthanage21\",\r\n"
				+ " \"password\":\"jira@123\"\r\n"
				+ " \r\n"
				+ "  }")
		.filter(session)
		
		.when()
		.post("/rest/auth/1/session")
		.then()
		.extract().response().asString();
		
		
		given()
		.pathParam("key","10101").headers("Content-Type","application/json").log().all()
		.body("{\r\n"
				+ "    \"body\": \"This is my first comment\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(session)
		
		.when()
		.post("/rest/api/2/issue/{key}/comment")
		
		.then()
		
	.assertThat()	.statusCode(201);

	}

}
