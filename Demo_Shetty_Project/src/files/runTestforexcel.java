package files;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class runTestforexcel {

	@Test(priority = 1,enabled = true, dataProvider = "BookDataprovider")
	public void AddBook(String a,String b)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().log().all().header("Content-Type","application/json")
		//.body(payload.Library_getPayload("isbn"+Commoncode.RandomStringGenration()+ a,"aisle"+Commoncode.RandomStringGenration()+b))
		.body(payload.Library_getPayload(a,b))
		.when().post("Library/Addbook.php")
		.then().log().all().statusCode(200)
		.extract().response().asString();
		
		JsonPath js=Commoncode.parsetojson(response);
		String id=js.get("ID");
		System.out.println(id);
		
		
	}
	@DataProvider(name="BookDataprovider")
	public Object[][] BookData() throws IOException
	{
		
		String path=".\\Data\\LibraryData.xlsx";
		UtilityXL util=new UtilityXL(path);
		int row=util.getRowCount("Sheet1");
		int col=util.getColumnCount("Sheet1", 1);
		Object logindata[][]=new String[row][col];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<col;j++)
			{
				logindata[i-1][j]=util.getData("Sheet1", i, j);
				
			}
		}
		return logindata;
		
	}
	
	
}
