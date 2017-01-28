/**
 * Created by Dmitrii on 28.01.2017.
 */
public class Field {
    int number;
    boolean corectNumber;
    public void start(){
        Player player = new Player();
        FourNumbers fourNumbers = new FourNumbers();
        do {
            number = player.getNumber();
            corectNumber = fourNumbers.CheckingNumber(number);
            if (corectNumber == true) {break;}
        } while (true);
    }
}
