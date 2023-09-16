// Квадратне рівняння
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("тримати розв'язок рівняння виду а*x^2+b*x+c:");
        try {
            System.out.print("Введи коефіцієнт A:");
            double a = sc.nextDouble();
            System.out.print("Введи коефіцієнт B:");
            double b = sc.nextDouble();
            System.out.print("Введи коефіцієнт C:");
            double c = sc.nextDouble();
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println(String.format("Отримуємо: x1 = %.3f; x2 =  %.3f", x1, x2));
            } else if (D == 0) {
                double x;
                x = (double) -b / (2 * a);
                System.out.println(String.format("Рівняння має один розв'язок: x =  %.3f",x));
            } else {
                System.out.println("Рівняння немає коренів!");
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Помилка перетворення з рядка в число");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
