import java.util.stream.IntStream;

public class FindOdd {

    public static void main(String[] args) {
        // System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        // System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        // System.out.println(FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        // System.out.println(FindOdd.findIt(new int[]{10}));
        // System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        // System.out.println(FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
        System.out.println(xorFindIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

    public static int findIt(int[] a) {
        for (int i : a){
            long count = IntStream.of(a).filter(x -> x == i).count();
            if (count%2 != 0){
                return i;
            }
        }
        return 0;
    }

    public static int xorFindIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
          xor ^= A[i];
        }
        return xor;
      }
}
