package collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        //Adding values to Map
        map.put("Bob", 1000);
        map.put("John", 1200);
        map.put("John", 1300);

        System.out.println("Map: " + map);

        // Get value from key
        System.out.println("Johns salary: " + map.get("John"));

        // Size
        System.out.println(map.size());

        // All key values
        System.out.println(map.keySet());

        // Check if Map contains key
        System.out.println(map.containsKey("Bob"));

        // Check if Map contains value
        System.out.println(map.containsValue(900));

        //Remove key / value pair from Map if exists
        map.remove("Bob");
        System.out.println(map);

        //Example 2
        Map<String, String> capitalCity = new HashMap<String, String >();
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Finland", "Helsinki");

        System.out.println(capitalCity.get("Latvia"));
        System.out.println();

        for (Map.Entry<String, String> entry : capitalCity.entrySet()){
            System.out.println("Map Entry key: " + entry.getKey());
            System.out.println("Map entry value: " + entry.getValue());
        }

    }
}
