package files;

public class payload {

	public static String bodyforrequest()
	{
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"ManojShinde Hubpresent\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"Investment Office\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
	public static String body_for_putReq(String pathid,String updatedAddress)
	{
		return "{\r\n"
				+ "\"place_id\":\"6f2901fc198c844e5b338905c61e6649\",\r\n"
				+ "\"address\":\"Apune\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
	public static String complexjson()
	{
		return "{\r\n"
				+ "  \"dashboard\" :{\r\n"
				+ "    \"purchaseAmount\":910,\r\n"
				+ "    \"website\":\"manojshindeacademy.com\"\r\n"
				+ "  },\r\n"
				+ "  \"courses\":[\r\n"
				+ "{\r\n"
				+ "  \"title\":\"Automation\",\r\n"
				+ "  \"price\":50,\r\n"
				+ "  \"copies\":6\r\n"
				+ "  \r\n"
				+ "},\r\n"
				+ "    {\r\n"
				+ "  \"title\":\"cypress\",\r\n"
				+ "  \"price\":40,\r\n"
				+ "  \"copies\":4\r\n"
				+ "  \r\n"
				+ "},\r\n"
				+ "    {\r\n"
				+ "  \"title\":\"RPA\",\r\n"
				+ "  \"price\":45,\r\n"
				+ "  \"copies\":10\r\n"
				+ "  \r\n"
				+ "}\r\n"
				+ "    \r\n"
				+ "  ]\r\n"
				+ "}";
	}
	
	public static String Library_getPayload(String isbn,String aisle)
	{
		String payload="{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		return payload;
	}
}
