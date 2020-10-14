package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
        int[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4, 12, 12, 12, 12};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
       for(int i = 0; i<data.length; i++){
           if(histogram.containsKey(data[i])){
               histogram.put(data[i], histogram.get(data[i]) + 1);
           }else{
               histogram.put(data[i], 1);
           }
       }
        
        Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = "+ entry.getKey() + " value = "+ entry.getValue());
        }
    }
    
}
