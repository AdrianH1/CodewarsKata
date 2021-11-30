public class Main {
    public static void main(String[] args) {
        User user = new User();

        // user.incProgress(-8);
        // user.incProgress(-7);
        // user.incProgress(-6);
        // user.incProgress(-5);
        // user.incProgress(-3);
        // user.incProgress(-5);
        // user.incProgress(5);

        user.incProgress(1);
        System.out.println("rank " + user.rank());
    }
}
