import java.util.Scanner;

public class Player {
    FourNumbers fourNumbers;

    public void getNumber(){
        fourNumbers = new FourNumbers();
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            number = sc.nextInt();
        } while (!fourNumbers.playerCheckingNumber(number));
    }
}
