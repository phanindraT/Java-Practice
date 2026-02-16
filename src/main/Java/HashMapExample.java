import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
HashMap (most used) :
Stores key-value
Allows one null key
Fast (O(1) average)

LinkedHashMap :
Maintains insertion order

TreeMap :
Sorted by key
No null keys allowed

ConcurrentHashMap (important for SDET) :
Thread-safe
No locking entire map
Used in multi-threaded test frameworks

Hashtable : legacy, synchronized
 */

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("Hashmap:");

        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("turvo","turvo software");
        hashmap.put("lineage","lineage software");

        System.out.println("for-each loop with keySet()");
        for (String key : hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }

        System.out.println("for-each loop with entrySet()");
        for(Map.Entry<String,String> entry : hashmap.entrySet() ){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("Using Iterator with entry set");
        Iterator<Map.Entry<String,String>> iterator = hashmap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String ,String > entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("for-each with lambda expressions for concise iteration");
        hashmap.forEach((qa,qe)->
                {
                    System.out.println(qa + ":" + qe);
                }
        );

    }
}