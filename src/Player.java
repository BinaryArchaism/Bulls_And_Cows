import java.util.Scanner;

/**
 * Created by Dmitrii on 28.01.2017.
 */
public class Player {
    public int getNumber(){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
}
