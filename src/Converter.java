public class Converter {
    public static boolean isMathOperation(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    public static int convertRomanToArabic(String number) { // конвертирует римское в арабское
        return switch (number) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new IllegalArgumentException("Неверный символ");
        };
    }

    public static boolean isRomanNumber(String number) {
        return number.matches("I|II|III|IV|V|VI|VII|VIII|IX|X");
    }

    public static boolean isArabicNumber(String number) {
        return number.matches("[1-9]|10");
    }

    public static boolean isNumber(String number) {
        return isRomanNumber(number) || isArabicNumber(number);
    }
}