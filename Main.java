public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.incProgress(1); //640
        user.incProgress(1); // 40
        user.incProgress(1); // 40
        user.incProgress(1); // 10 
        user.incProgress(1); // 10
        user.incProgress(2); // 40
        user.incProgress(2); // 40
        user.incProgress(-1); // 1
        user.incProgress(3); // 40
        user.incProgress(8); // 490
        user.incProgress(8); // 40
        user.incProgress(8); // 40
        user.incProgress(8); // 10
        user.incProgress(8); // 10
        user.incProgress(8); // 10
        user.incProgress(8); // 10
        user.incProgress(8); // 10
        user.incProgress(8); // 10
        user.incProgress(8); // 10
        user.incProgress(8); // 3

        System.out.println("rank " + user.rank());
        System.out.println("progress " + user.progress());
    }
}
