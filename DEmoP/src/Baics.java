import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class Baics {
@Test
	public void Test() {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://maps.googleapis.com";
given().log().all().
        param("location","-33.8670522,151.1957362").
        param("radius","500").
        param("key","AIzaSyAZ98iOVleI3unVTnoEOseaBJHnBgk2kgg").
        when().
               get("/maps/api/place/nearbysearch/json").
               then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
              System.out.println("Status code is");


	}

}
