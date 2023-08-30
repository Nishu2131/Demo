import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class Basuc2 {
	@Test
	public void POSTRequest() {
		RestAssured.baseURI="https://reqres.in";
		given().
		//queryParam("token","QpwL5tke4Pnpja7X4").
		body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").
		when().
		post("/api/users").
	    then().assertThat().statusCode(201).and().contentType(ContentType.JSON);
	}

}
