
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();


        map.put("india", 120);
        map.put("us", 30);
        map.put("china", 150);

        System.out.println(map);

        map.put("china", 180);
        System.out.println(map);


        //search
        if(map.containsKey("china")){
            System.out.println("key is present in the map");
            
        }
        else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("china")); //get exists
        System.out.println("indonesia"); //not exists

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("china");
        System.out.println(map);
    }
}
