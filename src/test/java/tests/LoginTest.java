package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;

import static io.restassured.RestAssured.given;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        Response response = given()
                .header("Content-Type", "application/json")
                .body("{ \"email\": \"merchant@foodics.com\", \"password\": \"123456\" ,}")
                .when()
                .post("/login");

        // Assertions
        System.out.println("Redirect Location: " + response.getHeader("Location"));
        Assert.assertEquals(response.getStatusCode(), 200);
        authToken = response.jsonPath().getString("token");
        Assert.assertNotNull(authToken, "Token should not be null");
    }
}
