import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDiff  {
    public static void main(String[] args) {
        ArrayList<Integer> tmp = new ArrayList<>();
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {1}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {2}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {}, new int[] {1,2}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2,2,3}, new int[] {2}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {-20, 5, 5, 5, 5, 5, -11, 42, 0, 55, 0, 0, 1}, new int[] {-20, 5, -11, 42, 55, 0, 1}))); 
        System.out.println(Arrays.toString(arrayDiff(new int [] {13, 2, 26, 13, 2, 3, 3}, new int[] {2, 13}))); //should be {26, 3, 3}
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        Arrays.sort(b);
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
          boolean shouldInclude = true;
          for(int j = 0; j < b.length; j++){
            if (a[i] == b[j]){
                shouldInclude = false;
                break;
            }
          }
          if (shouldInclude){
              tmp.add(a[i]);
          }
        }
        a = new int[tmp.size()];
        for (int i = 0; i < a.length; i++){
            a[i] = tmp.get(i);
        }
        return a;
      }
}
