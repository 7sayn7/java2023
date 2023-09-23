

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.java.Converter;

public class ConverterTest {
    @Test
    public void testConvertRomanToArabic() {
        int result = main.java.Converter.convertRomanToArabic("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testArabicToRoman() {
        String result = Converter.arabicToRoman(9);
        Assertions.assertEquals("IX", result);
    }

    @Test
    public void testUnexpectedNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.convertRomanToArabic("1"));
    }

    @Test
    public void testCorrectOperand() {
        boolean result = Converter.isMathOperation('*');
        Assertions.assertTrue(result);
    }

    @Test
    public void testIncorrectOperand() {
        boolean result = Converter.isMathOperation('.');
        Assertions.assertFalse(result);
    }

    @Test
    public void testCorrectRomanNumber() {
        boolean result = Converter.isRomanNumber("X");
        Assertions.assertTrue(result);
    }

    @Test
    public void testIncorrectRomanNumber() {
        boolean result = Converter.isRomanNumber("1");
        Assertions.assertFalse(result);
    }

    @Test
    public void testCorrectArabicNumber() {
        boolean result = Converter.isArabicNumber("1");
        Assertions.assertTrue(result);
    }

    @Test
    public void testIncorrectArabicNumber() {
        boolean result = Converter.isArabicNumber("X");
        Assertions.assertFalse(result);
    }

    @Test
    public void testCorrectNumber() {
        boolean result = Converter.isArabicNumber("1");
        Assertions.assertTrue(result);
    }

    @Test
    public void testIncorrectNumber() {
        boolean result = Converter.isArabicNumber("aaa");
        Assertions.assertFalse(result);
    }

}
