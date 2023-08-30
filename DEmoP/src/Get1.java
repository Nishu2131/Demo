import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get1 {
@Test
public void tset() {
	RestAssured.baseURI="https://reqres.in";
	
	given().
	param("id","2").
	when().
	get("/api/users").
	then().assertThat().statusCode(200).and().body("data.email",equalTo("janet.weaver@reqres.in")).
	extract().response();
}
}
