package Tests;


import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static utils.Steps.*;

public class TestReqres {

    @BeforeSuite
    public void testSetUp() {

        baseURI = "https://reqres.in/API";
    }

    @Test
    public void testListUsers(){
        String url = "/users?page=2";

        Response response = GET(url);

        isStatusCodeValid(response, 200);

        /*given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200);*/

    }
    @Test
    public void testSingleUser(){

        String url = "/users/2";
        Response response = GET(url);
        isStatusCodeValid(response, 200);

    }
    @Test
    public void testCreate(){

        String url = "/users";
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        Response response = POST(body,url);
        isStatusCodeValid(response, 201);
    }
    @Test
    public void testPut(){

        String url = "/users/2";
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        Response response = PUT(body,url);
        isStatusCodeValid(response, 200);
    }
    @Test
    public void testDelete(){

        String url = "/users/2";
        Response response = DELETE(url);
        isStatusCodeValid(response, 204);

    }
    @Test
    public void testPatch(){

        String url = "/users/2";
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        Response response = PUT(body,url);
        isStatusCodeValid(response, 200);
    }
}
