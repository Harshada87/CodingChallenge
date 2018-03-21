package harshada.iss.com.demo.Utility;

/**
 * Created by Amit on 1/19/2018.
 */

public class url {

    private static String base_URL = "http://api.open-notify.org/";
    private static String final_URL = base_URL+"iss-pass.json";

    public static String getBase_URL( String base_URL) {
        return base_URL;
    }
}
