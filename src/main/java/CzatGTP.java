import org.json.JSONObject;
public class CzatGTP {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key1", "value1");
        jsonObject.put("key2", JSONObject.NULL);
        System.out.println(jsonObject.toString());
    }
}
