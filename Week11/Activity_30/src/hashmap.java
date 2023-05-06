import java.util.HashMap;
import java.util.Map;

public class hashmap
{
    private Map<String, String> map = new HashMap<>();

    public void addKeyValuePair(String key, String value)
    {
        map.put(key, value);
    }

    public void removeKeyValuePair(String key)
    {
        map.remove(key);
    }

    public String getValueByKey(String key)
    {
        return map.get(key);
    }

    public void displayKeyValuePairs()
    {
        for (Map.Entry<String, String> a : map.entrySet())
        {
            System.out.println("Key: " + a.getKey() + ", Value: " + a.getValue());
        }
    }
}