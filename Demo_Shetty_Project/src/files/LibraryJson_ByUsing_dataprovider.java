package files;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileOutputStream;
import java.io.IOException;


//@Test
public class LibraryJson_ByUsing_dataprovider {

	static Logger logger=(Logger) LogManager.getLogger(LibraryJson_ByUsing_dataprovider.class);
	
	@BeforeTest
	public void CreateData_Into_excel() throws IOException, InterruptedException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
	    XSSFSheet Sheet = workbook.createSheet("Sheet1");
	    Object Bookdata1[] []= {{"isbn","aisle"},
	    		{"isbn"+Commoncode.RandomStringGenration(),"aisle"+Commoncode.RandomStringGenration()},
	    		{"isbn"+Commoncode.RandomStringGenration(),"aisle"+Commoncode.RandomStringGenration()},
	    		{"isbn"+Commoncode.RandomStringGenration(),"aisle"+Commoncode.RandomStringGenration()},
	    			    };
	      int row = Bookdata1.length;
	      int col =Bookdata1[0].length;
	      System.out.println(row);
	      System.out.println(col);
	      for(int r=0;r<row;r++)
	      {
	    	  XSSFRow SheetRow = Sheet.createRow(r);
	    	  for(int c=0;c<col;c++)
	    	  {
	    		  XSSFCell Sheetcell = SheetRow.createCell(c);
	    		  Object value = Bookdata1[r][c];
	    		  if(value instanceof String)
	    			  Sheetcell.setCellValue((String)value);
	    		  if(value instanceof Integer)
	    			  Sheetcell.setCellValue((Integer)value);
	    		  if(value instanceof Boolean)
	    			  Sheetcell.setCellValue((Boolean)value);
	    		  
	    	  }
	      }
	      String FilePath=".\\Data\\Bookdata1.xlsx";
	      FileOutputStream outputStream =new FileOutputStream(FilePath);
	     workbook.write(outputStream);
	     outputStream.close();
	     
	     System.out.println("Bookdata is created");
	     logger.info("Data is genrated with row = "+ row + "Coulumn is = " + col);
	     
	     Thread.sleep(10000);

	}
	
	
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
		
		String path=".\\Data\\Bookdata1.xlsx";
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
	
	
	
	
	
	@AfterTest
	public void teardown()
	{
		System.out.println("Complet Automation");
	}
	
	
	
}
