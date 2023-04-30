package Oauth;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class Test_Oauth {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","");
		
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=neomeansno");
	
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		
		String url=driver.getCurrentUrl();
		String arr1 = url.split("state=")[1];
		//String code = arr1.split("code=")[0];

		
		String code="4%2F0AVHEtk4lKkmM-7h6nhKekMc9oWf96AySM504Q5BbEXj7ibzZ3fUpwA0jkcR00pWvUAv1gg";
		System.out.println(code);
		System.out.println(code);
		
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
		
	    String r2=    given().contentType("application/json").

	    		queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)

	    		.when()

	    		           .get("https://rahulshettyacademy.com/getCourse.php")

	    		.asString();

	    		System.out.println(r2);


	}

}
