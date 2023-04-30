package Jira_API;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class Add_Attachment_ToFile {

	public static void main(String[] args) {
	RestAssured.baseURI="http://localhost:8080";
		
		SessionFilter session=new SessionFilter();
		String response = given()
	.header("Content-Type","application/json").log().all()
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
		
		
		//Add attcahmnets
		
		given()
		.header("X-Atlassian-Token","no-check").header("Content-Type","multipart/form-data").filter(session)
		.pathParam("key","10101")
		.multiPart("file",new File("jira.txt"))
		
		
		
		.when()
		.post("/rest/api/2/issue/{key}/attachments")
		
		
		.then()
		.log().all().assertThat()	.statusCode(200);
		
		
		
	}
}
