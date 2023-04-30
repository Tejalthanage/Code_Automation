package Pojo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;


public class Get_Course_deatils {

	public static void main(String[] args) {
		
		String code="4%2F0AVHEtk71maX069gb3-7D1SotvVeXDGkssaGx3tkZirEAzzCoMOw9CiuOaDd9rkWf2HvZXA";
		System.out.println(code);
		System.out.println(code);
		String Actualcourse[]= {"Selenium Webdriver Java","Cypress","Protractor"};
		String response=given().urlEncodingEnabled(false)
		.queryParam("code",code)
		.queryParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
	    .queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
		.queryParam("grant_type","authorization_code")
		
		
		
		.when()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath jsonPath = new JsonPath(response);

	    String accessToken = jsonPath.getString("access_token");

	    System.out.println(accessToken);
		
	    Courses_Main r2_courses=    given().contentType("application/json").

	    		queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)
	    		//queryParams("access_token", accessToken)

	    		.when()

	    		           .get("https://rahulshettyacademy.com/getCourse.php").as(Courses_Main.class);
	    
	    

	    System.out.println(r2_courses.getLinkedIn());
	    System.out.println(r2_courses.getInstructor());
	    System.out.println(r2_courses.getExpertise());
	    System.out.println(r2_courses.getUrl());
	    System.out.println(r2_courses.getCourses().getWebAutomation().get(1).getPrice());
	    int count=r2_courses.getCourses().getWebAutomation().size();
	   
	    for(int i=0;i<count;i++)
	    {
	    	if(r2_courses.getCourses().getWebAutomation().get(i).getCourseTitle().equalsIgnoreCase("Protractor"))
	    	{
	    		System.out.println(r2_courses.getCourses().getWebAutomation().get(i).getPrice());
	    		
	    	}
	    }
	    
	    ArrayList<String> expectedarraylist=new ArrayList<String>();
	    int count_automation=r2_courses.getCourses().getWebAutomation().size();
	    for(int j=0;j<count_automation;j++)
	    {
	    	expectedarraylist.add(r2_courses.getCourses().getWebAutomation().get(j).getCourseTitle());
	    }
	
	    System.out.println(expectedarraylist);
	   
	    List<String> actula_coursearraylist=Arrays.asList(Actualcourse);
	    
	   Assert.assertEquals(expectedarraylist,actula_coursearraylist);
	    



	
	}
	}

