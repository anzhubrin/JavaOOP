package in.reqres;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.*;

public class ReqresTests {

    String  getSingleUser = "/api/users/2",
            getSingleUserNotFound = "/api/users/23",
            getListUsers = "/api/users?page=2",
            postCreateUser = "/api/users";

    String  bodyForCreateUser = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";


    @BeforeAll
    static void setUrl() {
        baseURI = "https://reqres.in";
    }


    @Test
    void testDataSingleUser (){
        get(getSingleUser)
                .then()
                .log().body()
                .body("data.email", is("janet.weaver@reqres.in"))
                .body("data.first_name", is("Janet"))
                .body("data.last_name", is("Weaver"));
    }

    @Test
    void  singleUserNotFound(){
        get(getSingleUserNotFound)
                .then()
                .log().body()
                .statusCode(404);
    }

    @Test
    void update(){
        given()
                .log().body()
                .body(bodyForCreateUser)
                .contentType(JSON)
                .put(getSingleUser)
                .then()
                .log().body()
                .statusCode(200)
                .body("name", is("morpheus"))
                .body("job", is("leader"));
    }

    @CsvSource(value = {
            "michael.lawson@reqres.in, Michael, Lawson",
            "george.edwards@reqres.in, George, Edwards",
            "rachel.howell@reqres.in, Rachel, Howell"
    })

    @ParameterizedTest(name = "Юзер {0} {1} есть в списке")
    void  listUsers(String email, String first_name, String last_name) {
        get(getListUsers)
                .then()
                .log().body()
                .body("data.email", hasItem(email))
                .body("data.first_name", hasItem(first_name))
                .body("data.last_name", hasItem(last_name));
    }

    @Test
    void createUser(){
        given()
                .log().body()
                .body(bodyForCreateUser)
                .contentType(JSON)
                .when()
                .post(postCreateUser)
                .then()
                .log().body()
                .statusCode(201)
                .body("name", is("morpheus"))
                .body("job", is("leader"));
    }
}
