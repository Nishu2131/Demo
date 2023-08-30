import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import io.restassured.response.Response;

public class ReusableMethod {
	Properties prop = new Properties();
	public void getData() throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\Nishant\\eclipse-workspace\\DEmoP\\src\\Resources\\env.properties");
		prop.load(fs);
	}
	public static String getKey() {
		RestAssured.baseURI=("http://localhost:8080");
		Response res=given().log().all().
				headers("Content-Type", "application/json").
				body("{ \"username\": \"nishant213\", \"password\": \"nishant213\" }").
				when().post("/rest/auth/1/session").
				then().assertThat().and().contentType(ContentType.JSON).and().statusCode(200).
			    extract().response();
		String text = res.asString();
		JsonPath js = new JsonPath(text);
		String sessionID=js.get("session.value");
		System.out.println(sessionID);
		return sessionID;
		
	}

}
