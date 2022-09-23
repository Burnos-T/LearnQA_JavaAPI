import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class My {
    @Test
    //+сделать GET-запрос,
    // Полученный JSON необходимо распечатать и изучить.
    // Мы увидим, что это данные с сообщениями и временем, когда они были написаны.
    // Наша задача вывести текст второго сообщения.
    public void Ex5() {
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .andReturn();
        response.prettyPrint();
    }
    @Test
    public void Ex51() {
        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();
        ArrayList answers = response.get("messages");

        for (Object answer: answers){
            System.out.println(answer);
        }
        System.out.println(answers.get(1));

    }


    @Test
    public void Ex52() {
        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();
        List<Map> answers = response.getList("messages");

        // Для и нфы как кпроходить по циклу и доставать элементы
        //for (Map answer: answers) {
        //    System.out.println(answer.get("message"));
        //    System.out.println(answer.get("timestamp"));
        //System.out.println("**********");
        //}

        // Само задание -
        System.out.println("Ex5:");
        //if (answers != null
        //        && answers.get(1) != null
        //        && answers.get(1).get("message") != null) {
            System.out.println(answers.get(1).get("message"));
        //}



    }
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