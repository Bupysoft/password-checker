package api;

import com.google.gson.Gson;
import dto.LoginDto;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class LoginTest {
    @Test
    public void SuccessfulLoginWithCorrectLoginAndPassword() {
        LoginDto LoginDto = new LoginDto("","");



        given()
                .header("Content-type", "application/json")
                .log().all()
                .when()
                .body(new Gson().toJson(LoginDto))
                .post("http://35.208.34.242:8080/login/student")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    public void UnuccessfulLoginWithIncorrectLoginAndPassword() {
        LoginDto LoginDto = new LoginDto("bob","p32YbfT82n");

        given()
                .header("Content-type", "application/json")
                .log().all()
                .when()
                .body(new Gson().toJson(LoginDto))
                .post("http://35.208.34.242:8080/login/student")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
}