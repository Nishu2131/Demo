import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
public class Basics2 {
	@Test
	public void AddandDelete() {
		RestAssured.baseURI="https://reqres.in";
		String text="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
		Response res=given().
		//queryParam("token","QpwL5tke4Pnpja7X4").
		body(text).
		when().
		post("/api/users").
	    then().assertThat().statusCode(201).and().contentType(ContentType.JSON).
	    extract().response();
		  String ResponseText=  res.asString();
		  System.out.println(ResponseText);
		  JsonPath js= new JsonPath(ResponseText);
		  String id1=js.get("id");
		  System.out.println(id1);
		  
		  
		  RestAssured.baseURI="https://reqres.in";
			given().
			//queryParam("token","QpwL5tke4Pnpja7X4").
			body("{{\r\n" + 
					"    \"id\": \"id1\",\r\n" + 
					"   \r\n" + 
					"}").
			when().
			post("/api/users/delete").
		    then().assertThat().statusCode(201).and().contentType(ContentType.JSON).and().
		    body("status",equalTo("ok"));
		
	
	}

}
