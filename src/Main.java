import java.util.Scanner;

/**
 * Created by Dmitrii on 06.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игра Быки и Коровы");
        System.out.println("Введите ваше число");
        PartiotionNumber pn = new PartiotionNumber(sc.nextInt());
        pn.solve();

    }
}
