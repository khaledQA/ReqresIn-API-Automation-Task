package reqres.in;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import DataUtils.DataUtils;
import io.restassured.response.Response;
import org.apache.groovy.json.internal.IO;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreationFlowTest {
    private static final String testDataPath = "src/test/resources/TestData/validUser.json";

    @Test
    public void test() throws Exception {
        baseURI = "https://reqres.in/";
        String requestBody = DataUtils.readJsonFromFile(testDataPath);
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"))
                .extract().response();

        System.out.println("Response" + response.getBody().asString());

    }
}
