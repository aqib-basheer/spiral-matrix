import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("chouri", "sheeti vuhur");
//        jsonObject.put("stapaal","hehar");
//        jsonObject.put("a",12);
//        jsonObject.put("b",1.4);
//
//
//        String c = jsonObject.getString("");

        Student student = new Student("a","23","5th");
        Student student2 = new Student("a");
        String name = student.getName();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("student.json"), student);
    }
}
