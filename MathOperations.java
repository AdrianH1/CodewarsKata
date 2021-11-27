public class MathOperations {
    public static void main(String[] args) {
        basicMath("+", 4, 7); //is(11));
        basicMath("-", 15, 18);//, is(-3));
        basicMath("*", 5, 5);//, is(25));
        basicMath("/", 49, 7);//, is(7));
    }

    public static Integer basicMath(String op, int v1, int v2)
    {
        Integer result = 0;
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;   
                break;
            case "/":
                result = v1 / v2;
                break;
            default:
                break;
        }
        System.out.println(result);
        return result;
    }
}
