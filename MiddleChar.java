public class MiddleChar {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));  
        System.out.println(getMiddle("testing"));  
        System.out.println(getMiddle("A"));  
    }

    public static String getMiddle(String word) {
        //Code goes here!
        int l = word.length();
        if (l % 2 == 0){
            return String.valueOf(word.charAt(l/2-1)) + String.valueOf(word.charAt(l/2));
        } else {
            return String.valueOf(word.charAt(l/2));
        }
      }
}
