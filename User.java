import java.util.stream.IntStream;

import javax.swing.Action;

public class User {

    private static int rank = -8;
    private static int progress = 0;
    private static int[] ranks = new int[] {-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8};
    
    public static int rank(){
        return rank;
    }

    public static void gainRank(){
        if (rank() + 1 != 0){
            if (rank() < 8){
                rank += 1;
            }
        } else {
            rank += 2;
        }
    }

    public static int progress() {
        return progress;
    }

    public static void setProgress(int newProgress){
        System.out.println(newProgress);

        if (progress() + newProgress >= 100){
            int newLvl = newProgress / 100;
            while (newLvl > 0){
                gainRank();
                newLvl--;
            }
            progress = progress() + newProgress - 100;
        } else {
            progress = progress + newProgress;
        }
    }

    public static void incProgress(int activityRank) {
        if (activityRank == 0 || activityRank > 8 || activityRank < -8){
            throw new IllegalArgumentException();
        } else {
            if (activityRank > rank()){
                int diff = activityRank - rank(); 
                setProgress(10 * diff * diff);
            } else if (activityRank == rank()){
                setProgress(3);
            } else if (activityRank == rank()-1){
                setProgress(1);
            }
        }
    }

}
