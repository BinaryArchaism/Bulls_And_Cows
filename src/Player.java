import java.util.Scanner;

public class Player {
    FourNumbers fourNumbers;

    public void getNumber(){
        Scanner sc = new Scanner(System.in);
        do {
            fourNumbers = new FourNumbers(sc.nextInt());
        } while (!fourNumbers.playerCheckingNumber());
    }
}
