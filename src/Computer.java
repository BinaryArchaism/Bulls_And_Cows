/**
 * Created by Dmitrii on 28.01.2017.
 */
public class Computer {
    FourNumbers fourNumbers;

    public Computer() {
        fourNumbers = new FourNumbers();
        int num;
        fourNumbers.setA(getRandom(1, 9));

        do {
            num = getRandom(0, 9);
        } while (num == fourNumbers.getA());
        fourNumbers.setB(num);

        do {
            num = getRandom(0, 9);
        } while (num == fourNumbers.getA() || num == fourNumbers.getB());

        do {
            num = getRandom(0, 9);
        } while (num == fourNumbers.getA() || num == fourNumbers.getB() || num == fourNumbers.getC());
    }

    public int getRandom(int a, int b) {
        return (int) ((Math.random() * (b-a)) + a);
    }

    public FourNumbers getFourNumbers() {
        return fourNumbers;
    }
}
