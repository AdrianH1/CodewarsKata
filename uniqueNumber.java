import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class uniqueNumber {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
    }

    public static double findUniq(double arr[]) {
        // Do the magic   
        Map<Double, Integer> hashmap = new HashMap<Double, Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            double key = arr[i];
            if (hashmap.containsKey(key))
            {
                int count = hashmap.get(key);
                count++;
                hashmap.put(key, count);
            } else
            {
                hashmap.put(key, 1);
            }
        }
        for(Entry<Double,Integer> val : hashmap.entrySet())
        {
            if (val.getValue() == 1){
                return val.getKey();
            }
        }
        return arr[0];
      }
}
