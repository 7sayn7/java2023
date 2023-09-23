import java.util.Scanner;

public class sin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = in.nextLine();
        System.out.println("Здравствуйте, " + name);

        System.out.println("Угол (градусы)\tСинус");
        System.out.println("-----------------------");

        for (int angle = 0; angle <= 45; angle += 5) {
            double radians = java.lang.Math.toRadians(angle);
            double sinValue = java.lang.Math.sin(radians);

            System.out.printf("%d\t\t%.4f\n", angle, sinValue);
        }
    }
}
