import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество символов \"*\":");
        int value = 0;
        if (sc.hasNextInt()) {
            value = sc.nextInt();
            if (value <= 0) {
                inputError();
            }
        }
        else {
            inputError();
        }
        sc.close();

        int i = 0;
        while (i++ < value)
            System.out.print("*");
        System.out.print("\n");
    }

    public static void inputError () {
        System.out.println("Требуется ввести положительное целое число");
        System.exit(0);
    }
}
