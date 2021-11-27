import java.rmi.server.RemoteRef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Tribonacci {
    
    public static void main(String[] args) {
        sequence(new double[] {8,4,17}, 1);
        sequence(new double[] {1,1,1}, 10);
        sequence(new double[] {0,0,1}, 10);
    }

    public static double[] sequence(double[] signature, int n){
        if (signature.length == 0){
            return signature;
        }

        List<Double> tmp = new ArrayList<Double>();
        if (n < 3){
            for (int i = 0; i < n; i++){
                tmp.add(signature[i]);
            }
        } else {
            for (double b : signature){
                tmp.add(b);
            }
        }
        int i = 0;
        while (i < n-3){
            double nextVal = tmp.get(i) + tmp.get(i+1) + tmp.get(i+2);
            tmp.add(nextVal);
            i++;
        }
        System.out.println(tmp);
        double[] result = tmp.stream().mapToDouble(Double::doubleValue).toArray();
        return result;

    }
}
