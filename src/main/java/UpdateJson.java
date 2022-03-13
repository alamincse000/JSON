import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateJson {
    public static void main(String[] args) throws IOException, ParseException {


        String fileName="./src/main/resources/employee.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONObject empObj = (JSONObject) obj;
//        System.out.println(empObj);



        empObj.put("Salary","50000");
        FileWriter file = new FileWriter(fileName);
        file.write(empObj.toJSONString());
        file.flush();
        file.close();
        System.out.println("Updated!");
        System.out.print(empObj);

    }
}
