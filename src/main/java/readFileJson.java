import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFileJson {
    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/main/resources/employee.json"));
        JSONObject eobj = (JSONObject) obj;
        System.out.println(eobj);
        String Name = (String) eobj.get("Name");
        System.out.println(Name);
        String Department =(String) eobj.get("Department");
        System.out.println(Department);
        String designation = (String) eobj.get("Designation");
        System.out.println(designation);

        JSONObject addressObj = (JSONObject) eobj.get("address");
        String Area=(String) addressObj.get("Area");
        System.out.println(Area);
        String PO=(String) addressObj.get("PO");
        System.out.println(PO);
        String present_address=(String) addressObj.get("present_address");
        System.out.println(present_address);

        String Phone_number = (String) eobj.get("Phone_number");
        System.out.println(Phone_number);


    }
}
