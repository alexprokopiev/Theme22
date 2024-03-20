public class Task4 {

    public static void main(String[] args) {

        // Напечатать числа в виде следующей таблицы:
        // 1 2 ... 10
        // 1 2 ... 10
        // 1 2 ... 10
        // 1 2 ... 10
        int i = 0;
        while (++i <= 4) {
            printString();
        }
    }

    public static void printString() {
        // Печать строки 1 2...10
        int i = 0;
        while (++i <= 10) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(" ");
            } else {
                System.out.print("\n");
            }
        }
    }
}
