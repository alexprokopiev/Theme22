import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        // Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
        // (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)

        // Ввод и валидация данных
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны первого треугольника");
        int a1 = checkSide(sc);
        int b1 = checkSide(sc);
        int c1 = checkSide(sc);
        checkTriangle(a1,b1,c1);
        System.out.println("Введите стороны второго треугольника");
        int a2 = checkSide(sc);
        int b2 = checkSide(sc);
        int c2 = checkSide(sc);
        checkTriangle(a2,b2,c2);
        sc.close();

        // Сумма периметров
        int p1 = a1+b1+c1;
        int p2 = a2+b2+c2;
        int sumP = p1+p2;
        // Сумма площадей
        double sumS = Math.sqrt((double) p1 /2*((double) p1 /2-a1)*((double) p1 /2-b1)*((double) p1 /2-c1))
                + Math.sqrt((double) p2 /2*((double) p2 /2-a2)*((double) p2 /2-b2)*((double) p2 /2-c2));

        System.out.println("Сумма периметров: "+sumP);
        System.out.println("Сумма площадей: "+sumS);
    }

    public static void checkTriangle(int a, int b, int c) {
        // Проверка существования треугольника с заданными сторонами
        if ((a+b<=c)||(b+c<=a)||(a+c<=b)) {
            inputError("Треугольник с заданными сторонами не существует");
        }
    }
    public static int checkSide(Scanner sc) {
        // Проверка, является ли значение стороны треугольника целым положительным числом
        int side = 0;
        if (sc.hasNextInt()) {
            side = sc.nextInt();
            if (side <= 0) {
                inputError("Требуется ввести три положительных целых числа");
            }
        } else {
            inputError("Требуется ввести три положительных целых числа");
        }
        return side;
    }
    public static void inputError (String message) {
        // Обработка ошибки ввода данных
        System.out.println(message);
        System.exit(0);
    }
}
