import java.util.ArrayList;

public class SquareEveryDigit {
    public static void main(String[] args) {
        squareDigits(0);
    }

    public static int squareDigits(int n){
        if(n == 0){
            return 0;
        }
        int length = String.valueOf(n).length();
        String[] tmp = new String[length];
        // ArrayList<String> tmp = new ArrayList<>(); 
        while (n > 0){
            // System.out.println(n%10);
            int digit = n%10;
            tmp[length-1] = String.valueOf(digit*digit);
            n = n / 10;
            length--;
        }
        StringBuffer sb = new StringBuffer();
        for(String str : tmp){
            System.out.println(str);
            sb.append(str);            
        }
        String combined = sb.toString();
        Integer.parseInt(combined);
        System.out.println(combined);
        return 0;
    }
}
