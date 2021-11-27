import java.util.ArrayList;
import java.util.List;

public class SmileFace {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        System.out.println(countSmileys(a)); //2
    }

    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        int count = 0;
        List<String> smiles = new ArrayList<String>();
        smiles.add(":)"); smiles.add(":D"); smiles.add(":-)"); smiles.add(":~)"); smiles.add(":-D"); smiles.add(":~D");
        smiles.add(";)"); smiles.add(";D"); smiles.add(";-)"); smiles.add(";~)"); smiles.add(";-D"); smiles.add(";~D");

        for (String str : arr){
            for (String s : smiles){
                if (str.equals(s)) {
                    count++;
                }
            }
        }
        return count;
    }
}
