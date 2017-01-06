import java.util.Scanner;

/**
 * Created by Dmitrii on 06.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int bulls = 0;
        int cows = 0;
        int random = (int) ((Math.random() * 9000) + 1000);
        System.out.println(random);
        Scanner sc = new Scanner(System.in);
        boolean equal = false;
        int ra = random/1000;
        int rb = random/100%10;
        int rc = random/10%10;
        int rd = random/1%10;

        do {
        System.out.println("Введите ваше число");
        int number = sc.nextInt();
        int na = number/1000;
        int nb = number/100%10;
        int nc = number/10%10;
        int nd = number/1%10;

        if (na == ra) bulls++;
        if (na == rb || na == rc || na == rd) cows++;
        if (nb == rb) bulls++;
        if (nb == ra || nb == rc || nb == rd) cows++;
        if (nc == rc) bulls++;
        if (nc == rb || nc == ra || nc == rd) cows++;
        if (nd == rd) bulls++;
        if (nd == rb || nd == rc || nd == ra) cows++;
        if (bulls != 4) equal= true;
        System.out.println(bulls+" Быков  "+cows+" Коров");
        bulls = 0;
        cows = 0;
        } while (equal == true);
    }
}
