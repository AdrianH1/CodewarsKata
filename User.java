import java.util.stream.IntStream;

import javax.swing.Action;

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
        System.out.println(newProgress);
        if ((progress() + newProgress) >= 100){
            int newLvl = (progress() + newProgress) / 100;
            progress = progress() + newProgress - (newLvl*100);
            while (newLvl > 0){
                gainRank();
                newLvl--;
            }
        } else {
            progress = progress + newProgress;
        }
    }

    public void incProgress(int activityRank) {
        if (activityRank == 0 || activityRank > 8 || activityRank < -8){
            throw new IllegalArgumentException();
        } else {
            if (activityRank > rank()){
                int diff = 0;
                if (activityRank > 0 && rank() < 0){
                    diff = activityRank - rank() - 1; 
                } else {
                    diff = activityRank - rank(); 
                }
                setProgress(10 * diff * diff);
            } else if (activityRank == rank()){
                setProgress(3);
            } else if (activityRank == rank()-1){
                setProgress(1);
            } else if (activityRank < 0 && rank() > 0){
                if (activityRank == rank() -2){
                    setProgress(1);
                }
            }
        }
    }

}
