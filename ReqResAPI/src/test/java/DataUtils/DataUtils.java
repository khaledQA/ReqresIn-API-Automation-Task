package DataUtils;
import java.nio.file.Files;
import java.nio.file.Paths;



public class DataUtils {
    public static String readJsonFromFile(String filePath) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

}
