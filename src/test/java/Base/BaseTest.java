package Base;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static String baseURL = "https://pay2.foodics.dev/cp_internal";
    protected static String authToken;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = baseURL;
    }

    protected String getAuthToken() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        String payload = "{ \"email\": \"merchant@foodics.com\", \"password\": \"123456\" }";

        Response response = request.body(payload)
                .post("/login");

        return response.jsonPath().getString("token");
    }
}
