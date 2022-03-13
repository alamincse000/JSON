import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyWrite {
    public static void main(String[] args) throws IOException {
        myWriteFile();
        readFile();


    }
    public static void myWriteFile() throws IOException {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello java!");
            writer.write("\r\n");
            writer.write("Hello Java!");
            writer.write("\r\n");
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void readFile() throws IOException {

            FileReader reader =new FileReader("MyFile.txt");
            int character;
            while ((character = reader.read()) !=-1){
                System.out.println((char) character);
            }
            reader.close();


        }
    }

