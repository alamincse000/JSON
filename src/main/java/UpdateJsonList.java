import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateJsonList {
    public static void main(String[] args) throws IOException, ParseException {
        updateJSONList(2);

    }
    public static void updateJSONList(int pos) throws IOException, ParseException {
        String fileName="./src/main/resources/student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        System.out.print(jsonArray);
        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);

        jsonObject.put("Salary",90000);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Updated");
        System.out.print(jsonArray);

    }
}
