import files.payload;
import io.restassured.path.json.JsonPath;

public class Validation1_complex {

	public static void main(String[] args) {
		JsonPath js=new JsonPath(payload.complexjson());
		
		//Find number of course in json
		int numberofcourse=js.getInt("courses.size()");
		System.out.println("total Nuber of course "+ numberofcourse);
		
		//find total amount payble
		int totalpurchaseAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println("total purchase amount is " + totalpurchaseAmount);
		
		//Title of the first course
		String TitleOF_first_Course = js.get("courses[0].title");
		System.out.println(TitleOF_first_Course);
		
		//title of the All Courses along with their prize
		
		for(int i=0;i<numberofcourse;i++)
		{
		String allcourse_title=	js.get("courses["+i+"].title");
		int allcourse_prise=js.getInt("courses["+i+"].price");
		
		System.out.println("title = " + allcourse_title + "|| " + " prise is " + allcourse_prise);
		}
		
		
		//find number copies sold by rpa course only
		for(int i=0;i<numberofcourse;i++)
		{
		String title=js.get("courses["+i+"].title");
		System.out.println(title);
		if(title.contentEquals("RPA"))
		{
		
		System.out.println("number of copies sold by rpa =" +js.getInt("courses["+i+"].copies"));
		break;
		}
		
		}
		
		//verify all amount and purchase copies value equal to purchaseamount
		int sum=0;
		for(int i=0;i<numberofcourse;i++)
		{
			int prise=js.getInt("courses["+i+"].price");
			int copies=js.getInt("courses["+i+"].copies");
			int totalamount=prise*copies;
			sum=sum+totalamount;
		}
		
		System.out.println(sum);
		
		if(totalpurchaseAmount==sum)
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		
	}
	
	
}
