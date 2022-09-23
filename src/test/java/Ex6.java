import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Ex6 {
    @Test
    public void Ex6(){
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();
        response.prettyPrint();
    }
}
