public class PrintErrors {
    
    public static void main(String[] args) {
        // Character str = 'm';
        // int ascii = (int) str;
        // System.out.println(ascii);
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(s)); // 3/56
    }

    public static String printerError(String s) {
        // your code
        int total = 0, error = 0;
        char[] arr = s.toCharArray();
        for (char c : arr){
            int i = (int) c;
            if (i > 109){
                error++;
            }
            total++;
        }
        return String.valueOf(error) + "/" + String.valueOf(total);
    }
}
