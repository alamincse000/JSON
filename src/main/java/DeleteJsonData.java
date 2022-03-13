import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteJsonData {
    public static void main(String[] args) throws IOException, ParseException {
        deleteJSONData(2);

    }

   public static void deleteJSONData(int pos) throws IOException, ParseException {
       String fileName="./src/main/resources/student.json";
       JSONParser jsonParser = new JSONParser();
       Object obj = jsonParser.parse(new FileReader(fileName));
       JSONArray jsonArray = (JSONArray) obj;
       jsonArray.remove(pos);
       FileWriter file = new FileWriter(fileName);
       file.write(jsonArray.toJSONString());
       file.flush();
       file.close();
       System.out.println("Deleted!");
       System.out.print(jsonArray);

   }
}
