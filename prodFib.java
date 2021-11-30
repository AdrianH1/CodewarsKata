public class prodFib{
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
        //F(n) * F(n+1) = prod

        //productFib(714) # should return (21, 34, true), 
        // # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

        long[] test = productFib(4895);
        for (long l : test){
            System.out.println(l);
        }
        
        // productFib(800) # should return (34, 55, false), 
        // # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
        
        test = bestProductFib(5895);
        for (long l : test){
            System.out.println(l);
        }
    }

    public static long[] productFib(long prod) {
        // your code
        long first = 0; long second = 1;
        while (true) {
            if (first * second == prod) {
                return new long[] {first, second, 1};
            } else if (first * second > prod) {
                return new long[] {first, second, 0};
            } else {
                long tmp = first + second;
                first = second;
                second = tmp;
            }
        }
    }

    public static long[] bestProductFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
          long tmp = a;
          a = b;
          b = tmp + b;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
       }
}