public class Calculator {
    public static int calculate(int a, int b, char op){
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new UnsupportedOperationException("Недопустимая операция");
        };
    }
}