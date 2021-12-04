public class NumberExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(12)); //10 + 2
        System.out.println(expandedForm(42)); //40 + 2
        System.out.println(expandedForm(70304)); //70000 + 300 + 4
        System.out.println(expandedForm(9000000)); //900000
    }

    public static String expandedForm(int num) {
        int power = String.valueOf(num).length()-1;
        StringBuilder sb = new StringBuilder();
        while (power >= 0){
            int pow = (int) Math.pow(10, power); //10000
            int multiplier = num/pow; //7
            if (multiplier != 0){
                sb.append(String.valueOf(multiplier * pow) + " + ");
            }
            if (String.valueOf(num).length() == 1){
                sb.append(String.valueOf(num));
            }
            num = num - (multiplier * pow); //304
            power--;
        }
        return sb.toString();
    }

    // public static String expandedForm(int num) {
    //     String number = String.valueOf(num);
    //     int zeros = number.length()-1;
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < number.length(); i++){
    //         if (number.charAt(i) != '0'){
    //             sb.append(number.charAt(i)).toString();
    //             for(int j = 0; j < zeros; j++){
    //                 sb.append("0").toString();
    //             }
    //             if (i != number.length()-1){
    //                 sb.append(" + ");
    //             }
    //         }
    //         zeros--;
    //     }
    //     return sb.toString();
    // }
}
