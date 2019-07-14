public class Computer {
    FourNumbers fourNumbers;

    public Computer() {
        fourNumbers = new FourNumbers();
        fourNumbers.setA(getRandom(1, 9));
        do {
            fourNumbers.setB(getRandom(0, 9));
            fourNumbers.setC(getRandom(0, 9));
            fourNumbers.setD(getRandom(0, 9));
        } while (!fourNumbers.computerCheckingNumber());
    }

    public int getRandom(int a, int b) {
        return (int) ((Math.random() * (b-a)) + a);
    }

    public FourNumbers getFourNumbers() {
        return fourNumbers;
    }
}
