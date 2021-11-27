public class Pin {
    public static void main(String[] args) {
        System.out.println(checkPin("-111"));
        System.out.println(checkPin("+111"));
    }

    public static boolean checkPin(String str){
        if (str.length() == 4 || str.length() == 6) {
                try {
                    String[] arr = str.split("", 0);
                    for (String s : arr) {  
                        Integer.parseInt(s);  
                    }  
                    return true;
                }
                catch(NumberFormatException e) {
                    return false;
                }
            }
        return false;
    }
}
