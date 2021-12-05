public class NumberExpandedForm {
    public static void main(String[] args) {
        int j = 9000000%10;

        System.out.println(expandedForm(12)); //10 + 2
        System.out.println(expandedForm(42)); //40 + 2
        System.out.println(expandedForm(70304)); //70000 + 300 + 4
        System.out.println(expandedForm(9000000)); //900000

        System.out.println(bestPracticeExpandedForm(12)); //10 + 2
        System.out.println(bestPracticeExpandedForm(42)); //40 + 2
        System.out.println(bestPracticeExpandedForm(70304)); //70000 + 300 + 4
        System.out.println(bestPracticeExpandedForm(9000000)); //900000
    }

    public static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();
        int length = String.valueOf(num).length();
        int power = String.valueOf(num).length()-1;
        while (length > 0){
            int powOfTen = (int) Math.pow(10, power);
            int multiplier = num/powOfTen;
            if (String.valueOf(num).charAt(0) != '0'){
                sb.append(String.valueOf(multiplier * powOfTen));
            }
            num = num - (multiplier * powOfTen);
            if (num != 0){
                sb.append(" + ");
            }
            if (num > 0 && num < 10){
                sb.append(String.valueOf(num));
                break;
            } else if (num == 0) {
                break;
            } else {
                length = String.valueOf(num).length();
                power = String.valueOf(num).length()-1;
            }
        }
        return sb.toString();
    }

    public static String bestPracticeExpandedForm(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;
        
        return outs;
    }

    public static String OtherSolutionExpandedForm(int num)
    {
      StringBuffer res = new StringBuffer();
      int d = 1;
      while(num > 0) {
        int nextDigit = num % 10;        
        num /= 10;
        if (nextDigit > 0) {
          res.insert(0, d * nextDigit);
          res.insert(0, " + ");
        }
        d *= 10;
      }
      
      return res.substring(3).toString();
    }
}
