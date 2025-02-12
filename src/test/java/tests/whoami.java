package tests;

import Base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class whoami extends BaseTest {

    @Test
    public void testWhoAmI() {
        authToken = getAuthToken();

        Response response = given()
                .header("Authorization", "Bearer " + authToken)
                .when()
                .get("/whoami");

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.getBody().asString().contains("merchant@foodics.com"));
    }
}
