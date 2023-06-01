import java.util.Scanner;

public class CalculatorTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        run(s);
        //6 + 8 - > ["6", "+", "8"] - - - a operator b
        // "+" -> toCharArray -> ['+']
    }

    public static void run(String s) {
        String[] stringArray = s.split(" ");


        if (stringArray.length != 3) throw new IllegalArgumentException("Неверный формат");

        String a = stringArray[0];
        String b = stringArray[2];
        char op = stringArray[1].charAt(0);

        if (!(Converter.isNumber(a) && Converter.isNumber(b) && Converter.isMathOperation(op))) {
            throw new IllegalArgumentException("Не математическое выражение");
        }

        if (Converter.isRomanNumber(a) && Converter.isRomanNumber(b)) {
            int arabicA = Converter.convertRomanToArabic(a);
            int arabicB = Converter.convertRomanToArabic(b);
            int result = Calculator.calculate(arabicA, arabicB, op);
            if (result < 0) {
                throw new IllegalArgumentException("В римской системе нет отрицательных чисел");
            }
            System.out.println(a + " " + op + " " + b + " = " + Converter.arabicToRoman(result));
        } else if (Converter.isArabicNumber(a) && Converter.isArabicNumber(b)) {
            // "7" -> int a = 7;
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            int result = Calculator.calculate(a1, b1, op);
            System.out.println(a1 + " " + op + " " + b1 + " = " + result);
        } else {
            throw new IllegalArgumentException("Используются одновременно разные системы счисления");
        }
    }
}
