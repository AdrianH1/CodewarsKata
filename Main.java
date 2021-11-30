public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.rank()); // => -8
        System.out.println(user.progress()); // => 0
        user.incProgress(-7);
        System.out.println(user.progress()); // => 10
        user.incProgress(-5); // will add 90 progress
        System.out.println(user.progress()); // => 0 // progress is now zero
        System.out.println(user.rank()); // => -7 // rank was upgraded to -7
    }
}
