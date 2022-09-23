import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class Ex5 {
    @Test
    public void Ex53() {
        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();
        List<Map> answers = response.getList("messages");
        System.out.println("Ex5:");
        System.out.println(answers.get(1).get("message"));
    }
}
