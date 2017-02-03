import java.util.Scanner;

/**
 * Created by Dmitrii on 28.01.2017.
 */

public class Player {
    FourNumbers fourNumbers;

    public void getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше число (цифры не могут повторяться)");
        do {
            fourNumbers = new FourNumbers(sc.nextInt());
        } while (!fourNumbers.checkingNumber());
    }

    public FourNumbers getFourNumbers() {
        return fourNumbers;
    }
}
