package main.java;

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

    public static String arabicToRoman(int arabic) {

        /*  7 / 2 = 2
            7 % 2 = 3
            1021231232 % 100 = 2
            123123123 / 100 = 1231231
            ( 123123123 / 100 ) % 10 = 3
            100
        * */
        int h = arabic / 100;  // 100 - > 1 - сотен
        int t = (arabic / 10) % 10; // 100 -> 10 - > 0 - десятков
        int o = arabic % 10; // 100 -> 0
        String hundredsRoman = ""; // если не инициализируем, то просто создается ссылка которая никуда не указывает
        String tensRoman = "";
        String onesRoman = "";

        switch (h) {
            case 0 -> hundredsRoman = "";
            case 1 -> hundredsRoman = "C";
//            default -> hundredsRoman = "";
        }
        switch (t) {
            case 0 -> tensRoman = "";
            case 1 -> tensRoman = "X";
            case 2 -> tensRoman = "XX";
            case 3 -> tensRoman = "XXX";
            case 4 -> tensRoman = "XL";
            case 5 -> tensRoman = "L";
            case 6 -> tensRoman = "LX";
            case 7 -> tensRoman = "LXX";
            case 8 -> tensRoman = "LXXX";
            case 9 -> tensRoman = "XC";
        }
        switch (o) {
            case 0 -> onesRoman = "";
            case 1 -> onesRoman = "I";
            case 2 -> onesRoman = "II";
            case 3 -> onesRoman = "III";
            case 4 -> onesRoman = "IV";
            case 5 -> onesRoman = "V";
            case 6 -> onesRoman = "VI";
            case 7 -> onesRoman = "VII";
            case 8 -> onesRoman = "VIII";
            case 9 -> onesRoman = "IX";
        }
        return hundredsRoman + tensRoman + onesRoman;
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