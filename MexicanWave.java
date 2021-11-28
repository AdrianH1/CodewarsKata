import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static void main(String[] args) {
        //{ "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        // wave("hello");
        // "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"
        String[] test = wave("two words");
        for (String s : test){
            System.out.println(s);
        }

        String[] test1 = bestWave("two words");
        for (String s : test1){
            System.out.println(s);
        }
    }

    public static String[] wave(String str) {
        ArrayList<String> result = new ArrayList<>();
        String[] arr = str.split("(?!^)");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < str.length(); j++){
                    if (i == j){
                        sb.append(arr[j].toUpperCase());
                    } else {
                        sb.append(arr[j]);
                    }
            }

            if (sb.toString().matches(".*[A-Z].*")){
                result.add(sb.toString());
            }
            sb.setLength(0);
        }
        return result.toArray(new String[result.size()]);
    }
    

    public static String[] bestWave(String str) {    
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (ch == ' ') continue;
          list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        return list.toArray(new String[0]);
      }
}
