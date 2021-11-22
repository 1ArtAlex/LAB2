import java.util.InputMismatchException;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int n = 0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число меньше 15: ");
            n = in.nextInt();
            in.close();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка");
            System.exit(1);
        }
        if (n >= 15) {
            System.out.println("Введены некорректыне данные");
        }
        else if ((0 <= n) & (n < 15)){
            int s = 1;
            for (int i = 1; i <= n; i++) {
                s = s * i;
            }
            System.out.println("Факториал равен:" + s);
        }
    }
}