import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSONFileWrite {
    public static void main(String[] args) throws IOException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("Name","Md. Alamin Mondol");
        jsonObj.put("Department","IT");
        jsonObj.put("Designation","Software testing");

        JSONObject jsonAdd =new JSONObject();
        jsonAdd.put("PO","Shobujbagh");
        jsonAdd.put("Area","Bashabo");
        jsonObj.put("address",jsonAdd);
        jsonObj.put("Phone_number","01773003468");

        FileWriter fw =new FileWriter("./src/main/resources/employee.json");
        fw.write(jsonObj.toJSONString() );
        fw.flush();
        System.out.println(jsonObj);

    }
}
