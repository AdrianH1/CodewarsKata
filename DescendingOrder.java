import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(1234));
        System.out.println(betterSortDesc(1234));
    }

    public static int sortDesc(final int num) {
        String str = Integer.toString(num);
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder s = new StringBuilder();
        for (int i : arr) {
             s.append(i);
        }
        return Integer.parseInt(s.toString());
      }

      public static int betterSortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
