/**
 * Created by Dmitrii on 28.01.2017.
 */
public class Field {
    int number;
    int ra, rb, rc, rd;
    boolean corectNumber;
    int bulls;
    int cows;
    public void start(){
        Player player = new Player();
        FourNumbers fourNumbers = new FourNumbers();
        do {
            number = player.getNumber();
            corectNumber = fourNumbers.checkingNumber(number);
            if (corectNumber == true) {break;}
        } while (true);
        Computer computer = new Computer();
        do {
            ra = computer.getRandoma();
            rb = computer.getRandomb();
            rc = computer.getRandomc();
            rd = computer.getRandomd();
            corectNumber = fourNumbers.checkingRandom(ra, rb, rc, rd);
            if (corectNumber == true) {break;}
        } while (true);
        do {
            bulls = fourNumbers.bullSolver(ra, rb, rc, rd);
            cows = fourNumbers.cowSolver(ra, rb, rc, rd);
            System.out.println("Быки: " + bulls + " Коровы: " + cows);
            if (bulls == 4) {break;}
            else {System.out.println("Введите число заного");
            do {
                number = player.getNumber();
                corectNumber = fourNumbers.checkingNumber(number);
                if (corectNumber == true) {break;}
            } while (true);}
            bulls = 0;
            cows = 0;
        } while (true);
        System.out.println("Вы выиграли!");
    }
}
