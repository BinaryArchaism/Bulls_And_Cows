import java.util.Scanner;

/**
 * Created by Dmitrii on 28.01.2017.
 */

public class Player {
    FourNumbers fourNumbers;

    public void getNumber(){
        Scanner sc = new Scanner(System.in);
        do {
            fourNumbers = new FourNumbers(sc.nextInt());
        } while (!fourNumbers.playerCheckingNumber());
    }
}
