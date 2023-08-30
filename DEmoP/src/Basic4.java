import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basic4 {
	//ReusableMethod rs =new ReusableMethod();
	Properties prop = new Properties();
	@BeforeTest
	public void getData() throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\Nishant\\eclipse-workspace\\DEmoP\\src\\Resources\\env.properties");
		prop.load(fs);
	}
	@Test
	public void CreateIssue() {
		System.out.print("Nishant");
		//System.out.println(ReusableMethod.getKey());
		RestAssured.baseURI=("http://localhost:8080");
		
		Response res=given().log().all().
	   headers("Cookie", "JSESSIONID="+ReusableMethod.getKey()).
	   headers("Content-Type", "application/json").
	   body("{\r\n" + 
	   		"	\"fields\": {\r\n" + 
	   		"		\"project\": {\r\n" + 
	   		"			\"key\": \"TES\"\r\n" + 
	   		"		},\r\n" + 
	   		"		\"summary\": \"something's wrong in it\",\r\n" + 
	   		"		\"description\": \"description of the issue we need to update1\",\r\n" + 
	   		"		\"issuetype\": {\r\n" + 
	   		"			\"name\": \"Bug\"\r\n" + 
	   		"		}\r\n" + 
	   		"	}\r\n" + 
	   		"}").
	  when().post("/rest/api/2/issue").
	  then().assertThat().and().contentType(ContentType.JSON).
	    extract().response();
	  String ResponseText=  res.asString();
		  System.out.println(ResponseText);
		  JsonPath js= new JsonPath(ResponseText);
		  String id1=js.get("id");
		  System.out.println(id1);
	}

}
