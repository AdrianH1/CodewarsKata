import java.util.Arrays;
import java.util.stream.IntStream;

public class User {

    private int rank = -8;
    private int progress = 0;
    private int[] ranks = new int[] {-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8};
    
    public int rank(){
        return rank;
    }

    public void gainRank(){
        if (rank() + 1 != 0){
            if (rank() < 8){
                rank += 1;
            }
        } else {
            rank += 2;
        }
    }

    public int progress() {
        return progress;
    }

    public void setProgress(int newProgress){
        if (progress() + newProgress >= 100){
            gainRank();
            progress = progress() + newProgress - 100;
        } else {
            progress = progress + newProgress;
        }
        System.out.println(progress);
    }

    public void incProgress(int activityRank) {
        if (IntStream.of(ranks).anyMatch(x -> x == activityRank)){
            int diff = activityRank - rank(); 
            setProgress(10 * diff * diff);
        }
    }

}
